package plugin.doma;

import org.seasar.doma.Domain;

import play.Logger;
import play.data.format.Formatters;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/05/06
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
public class DomainFieldFormatter<T> extends Formatters.SimpleFormatter<T> {

    private Class<T> domainClass;

    public DomainFieldFormatter(T... t) {
        this.domainClass = (Class<T>) t.getClass().getComponentType();
    }

    @Override
    public T parse(String text, Locale locale) throws ParseException {
        if(text == null || text.trim().isEmpty()) {
            return null;
        }
        T result = null;
        Domain domain = (Domain) domainClass.getAnnotation(Domain.class);
        Class type = domain.valueType();
        try {
            Constructor<?> constructor = domainClass.getConstructor(type);
            result = (T) constructor.newInstance(type.cast(text));
        } catch(NoSuchMethodException e) {
            Logger.debug("FactoryMethodでDomainを生成します。");
            try {
                result = (T) DomaPlugin.invokeStatic(domainClass, domain.factoryMethod(), type.cast(text));
            } catch (Throwable throwable) {
                Logger.error("Domainを生成できませんでした。", throwable);
                throw new RuntimeException(throwable);
            }
        } catch (Exception e) {
            Logger.error("Domainを生成できませんでした。", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public String print(T value, Locale locale) {
        if(value == null) {
            return "";
        }
        return value.toString();
    }
}

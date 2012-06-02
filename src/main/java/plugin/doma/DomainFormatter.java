package plugin.doma;

import org.seasar.doma.Domain;

import org.seasar.doma.jdbc.domain.DomainType;
import org.seasar.doma.jdbc.domain.DomainTypeFactory;
import org.springframework.beans.SimpleTypeConverter;
import play.data.format.Formatters;

import java.text.ParseException;
import java.util.Locale;

/**
 * 入力値をDomainにバインドするクラス
 */
public class DomainFormatter<T> extends Formatters.SimpleFormatter<T> {

    /** バインド対象クラス */
    private Class<T> domainClass;

    /**
     * factoryメソッド
     *
     * @param domainClass
     * @return formatter
     */
    public static <T> DomainFormatter<T> create(Class<T> domainClass) {
        return new DomainFormatter<T>(domainClass);
    }

    /**
     * コンストラクタ
     *
     * @param domainClass
     */
    private DomainFormatter(Class<T> domainClass) {
        this.domainClass = domainClass;
    }

    /**
     * パース処理
     *
     * @param text
     * @param locale
     * @return domain
     */
    @Override
    @SuppressWarnings("unchecked")
    public T parse(String text, Locale locale) throws ParseException {
        if(text == null || text.trim().isEmpty()) {
            return null;
        }
        DomainType domainType = DomainTypeFactory.getDomainType(domainClass);
        Domain domain = (Domain) domainClass.getAnnotation(Domain.class);
        Class valueType = domain.valueType();
        SimpleTypeConverter converter = new SimpleTypeConverter();
        return (T) domainType.newDomain(converter.convertIfNecessary(text, valueType));
    }

    /**
     * 出力処理<br>
     * DomainのtoStringメソッドを呼び出す
     *
     * @param value
     * @param locale
     * @return String
     */
    @Override
    public String print(T value, Locale locale) {
        if(value == null) {
            return "";
        }
        return value.toString();
    }
}

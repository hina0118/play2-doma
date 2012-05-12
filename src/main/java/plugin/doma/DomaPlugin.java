package plugin.doma;

import org.seasar.doma.jdbc.tx.LocalTransaction;
import play.Application;
import play.Plugin;
import play.data.format.Formatters;
import play.libs.F;

import javax.tools.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/05/01
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
public class DomaPlugin extends Plugin {
    private final Application application;

    public DomaPlugin(Application application) {
        this.application = application;
    }

    /**
     * Run a block of code in a Doma transaction.
     *
     * @param block Block of code to execute.
     */
    public static <T> T withTransaction(final Class configClass, final F.Function0<T> block) throws Throwable {
        LocalTransaction localTransaction = getLocalTransaction(configClass);
        try {
            localTransaction.begin();
            T result = block.apply();
            localTransaction.commit();
            return result;
        } catch(Throwable t) {
            localTransaction.rollback();
            throw t;
        }
    }

    private static LocalTransaction getLocalTransaction(Class configClass) throws Throwable {
        return (LocalTransaction) invokeStatic(configClass, "getLocalTransaction");
    }

    public static Object invokeStatic(final Class clazz, final String method, final Object... args) throws Throwable {
        Class[] types = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            types[i] = args[i].getClass();
        }
        Method m = clazz.getDeclaredMethod(method, types);
        m.setAccessible(true);
        return m.invoke(null, args);
    }

}

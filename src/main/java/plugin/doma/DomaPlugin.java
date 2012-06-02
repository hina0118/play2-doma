package plugin.doma;

import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.springframework.util.MethodInvoker;
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
 * Play2用Domaプラグインクラス
 */
public class DomaPlugin extends Plugin {

    /** アプリケーション */
    private final Application application;

    /**
     * コンストラクタ
     *
     * @param application アプリケーション
     */
    public DomaPlugin(Application application) {
        this.application = application;
    }

    /**
     * 処理にDomaのトランザクションを適用する
     *
     * @param configClass 設定クラス
     * @param block トランザクション対象処理ブロック
     * @return 処理結果
     * @throws Throwable
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

    /**
     * ローカルトランザクションを取得する
     *
     * @param configClass 設定クラス
     * @return ローカルトランザクション
     * @throws Throwable
     */
    private static LocalTransaction getLocalTransaction(Class configClass) throws Throwable {
        MethodInvoker mi = new MethodInvoker();
        mi.setStaticMethod(configClass.getName() + ".getLocalTransaction");
        mi.prepare();
        if (!mi.isPrepared()) {
            new RuntimeException("ローカルトランザクションを取得できません。");
        }
        return (LocalTransaction) mi.invoke();
    }

}

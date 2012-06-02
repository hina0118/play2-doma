package plugin.doma;

import play.libs.F;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

/**
 * Domaのトランザクションを適用したアクション
 */
public class TransactionalAction extends Action<Transactional> {

    /**
     * アクションを呼び出す
     *
     * @param ctx
     * @return Result
     * @throws Throwable
     */
    public Result call(final Context ctx) throws Throwable {
        return DomaPlugin.withTransaction(
                configuration.configClass(),
                new F.Function0<Result>() {
                    public Result apply() throws Throwable {
                        return delegate.call(ctx);
                    }
                }
        );
    }
}

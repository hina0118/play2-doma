package plugin.doma;

import play.libs.F;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/05/06
 * Time: 2:39
 * To change this template use File | Settings | File Templ ates.
 */
public class TransactionalAction extends Action<Transactional> {
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

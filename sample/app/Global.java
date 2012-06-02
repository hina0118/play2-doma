import doma.user.domain.Email;
import doma.user.domain.Password;
import play.Application;
import play.GlobalSettings;
import play.data.format.Formatters;
import plugin.doma.DomainFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/05/06
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class Global extends GlobalSettings {
    public void beforeStart(Application app) {
        Formatters.register(Email.class, new DomainFormatter<Email>());
        Formatters.register(Password.class, new DomainFormatter<Password>());
    }
}

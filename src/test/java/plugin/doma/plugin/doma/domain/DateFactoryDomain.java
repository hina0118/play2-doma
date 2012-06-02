package plugin.doma.plugin.doma.domain;

import org.joda.time.DateTime;
import org.seasar.doma.Domain;

import java.util.Date;

/**
 *
 */
@Domain(valueType = Date.class, factoryMethod = "of")
public class DateFactoryDomain {
    private final Date value;
    private DateFactoryDomain(Date value) {
        this.value = value;
    }
    public Date getValue() {
        return value;
    }
    public String getFormatString() {
        DateTime dateTime = new DateTime(value);
        return dateTime.toString("yyyy/MM/dd");
    }
    public static DateFactoryDomain of(Date value) {
        return new DateFactoryDomain(value);
    }
}

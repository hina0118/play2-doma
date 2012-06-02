package plugin.doma.plugin.doma.domain;

import org.joda.time.DateTime;
import org.seasar.doma.Domain;
import org.springframework.format.datetime.joda.JodaDateTimeFormatAnnotationFormatterFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
@Domain(valueType = Date.class)
public class DateDomain {
    private final Date value;
    public DateDomain(Date value) {
        this.value = value;
    }
    public Date getValue() {
        return value;
    }
    public String getFormatString() {
        DateTime dateTime = new DateTime(value);
        return dateTime.toString("yyyy/MM/dd");
    }
}

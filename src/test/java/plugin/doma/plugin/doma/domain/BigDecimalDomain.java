package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

import java.math.BigDecimal;

/**
 *
 */
@Domain(valueType = BigDecimal.class)
public class BigDecimalDomain {
    private final BigDecimal value;
    public BigDecimalDomain(BigDecimal value) {
        this.value = value;
    }
    public BigDecimal getValue() {
        return value;
    }
    public long getLongValue() {
        return value.longValue();
    }
}

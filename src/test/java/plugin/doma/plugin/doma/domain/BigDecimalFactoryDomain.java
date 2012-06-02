package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

import java.math.BigDecimal;

/**
 *
 */
@Domain(valueType = BigDecimal.class, factoryMethod = "of")
public class BigDecimalFactoryDomain {
    private final BigDecimal value;
    private BigDecimalFactoryDomain(BigDecimal value) {
        this.value = value;
    }
    public BigDecimal getValue() {
        return value;
    }
    public long getLongValue() {
        return value.longValue();
    }
    public static BigDecimalFactoryDomain of(BigDecimal value) {
        return new BigDecimalFactoryDomain(value);
    }
}

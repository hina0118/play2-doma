package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Double.class)
public class DoubleDomain {
    private final Double value;
    public DoubleDomain(Double value) {
        this.value = value;
    }
    public Double getValue() {
        return value;
    }
    public double getDoubleValue() {
        return value.doubleValue();
    }
}

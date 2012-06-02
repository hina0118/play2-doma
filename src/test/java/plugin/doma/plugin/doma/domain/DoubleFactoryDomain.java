package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Double.class, factoryMethod = "of")
public class DoubleFactoryDomain {
    private final Double value;
    private DoubleFactoryDomain(Double value) {
        this.value = value;
    }
    public Double getValue() {
        return value;
    }
    public double getDoubleValue() {
        return value.doubleValue();
    }
    public static DoubleFactoryDomain of(Double value) {
        return new DoubleFactoryDomain(value);
    }
}

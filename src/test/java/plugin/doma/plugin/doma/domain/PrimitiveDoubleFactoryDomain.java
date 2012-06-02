package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = double.class, factoryMethod = "of")
public class PrimitiveDoubleFactoryDomain {
    private final double value;
    private PrimitiveDoubleFactoryDomain(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    public static PrimitiveDoubleFactoryDomain of(double value) {
        return new PrimitiveDoubleFactoryDomain(value);
    }
}

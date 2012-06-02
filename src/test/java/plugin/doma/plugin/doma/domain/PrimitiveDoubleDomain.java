package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = double.class)
public class PrimitiveDoubleDomain {
    private final double value;
    public PrimitiveDoubleDomain(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}

package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Float.class, factoryMethod = "of")
public class FloatFactoryDomain {
    private final Float value;
    private FloatFactoryDomain(Float value) {
        this.value = value;
    }
    public Float getValue() {
        return value;
    }
    public float getFloatValue() {
        return value.floatValue();
    }
    public static FloatFactoryDomain of(Float value) {
        return new FloatFactoryDomain(value);
    }
}

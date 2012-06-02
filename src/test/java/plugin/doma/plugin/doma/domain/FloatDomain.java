package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Float.class)
public class FloatDomain {
    private final Float value;
    public FloatDomain(Float value) {
        this.value = value;
    }
    public Float getValue() {
        return value;
    }
    public float getFloatValue() {
        return value.floatValue();
    }
}

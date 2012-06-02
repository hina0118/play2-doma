package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = float.class)
public class PrimitiveFloatDomain {
    private final float value;
    public PrimitiveFloatDomain(float value) {
        this.value = value;
    }
    public float getValue() {
        return value;
    }
}

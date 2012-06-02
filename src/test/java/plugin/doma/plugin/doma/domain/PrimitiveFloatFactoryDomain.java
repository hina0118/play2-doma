package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = float.class, factoryMethod = "of")
public class PrimitiveFloatFactoryDomain {
    private final float value;
    private PrimitiveFloatFactoryDomain(float value) {
        this.value = value;
    }
    public float getValue() {
        return value;
    }
    public static PrimitiveFloatFactoryDomain of(float value) {
        return new PrimitiveFloatFactoryDomain(value);
    }
}

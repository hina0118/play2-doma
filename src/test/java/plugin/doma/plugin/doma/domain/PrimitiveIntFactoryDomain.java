package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = int.class, factoryMethod = "of")
public class PrimitiveIntFactoryDomain {
    private final int value;
    private PrimitiveIntFactoryDomain(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public static PrimitiveIntFactoryDomain of(int value) {
        return new PrimitiveIntFactoryDomain(value);
    }
}

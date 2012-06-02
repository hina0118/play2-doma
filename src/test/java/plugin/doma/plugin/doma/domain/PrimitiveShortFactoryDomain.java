package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = short.class, factoryMethod = "of")
public class PrimitiveShortFactoryDomain {
    private final short value;
    private PrimitiveShortFactoryDomain(short value) {
        this.value = value;
    }
    public short getValue() {
        return value;
    }
    public static PrimitiveShortFactoryDomain of(short value) {
        return new PrimitiveShortFactoryDomain(value);
    }
}

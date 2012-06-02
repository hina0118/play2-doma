package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = long.class, factoryMethod = "of")
public class PrimitiveLongFactoryDomain {
    private final long value;
    private PrimitiveLongFactoryDomain(long value) {
        this.value = value;
    }
    public long getValue() {
        return value;
    }
    public static PrimitiveLongFactoryDomain of(long value) {
        return new PrimitiveLongFactoryDomain(value);
    }
}

package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = short.class)
public class PrimitiveShortDomain {
    private final short value;
    public PrimitiveShortDomain(short value) {
        this.value = value;
    }
    public short getValue() {
        return value;
    }
}

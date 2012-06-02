package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = long.class)
public class PrimitiveLongDomain {
    private final long value;
    public PrimitiveLongDomain(long value) {
        this.value = value;
    }
    public long getValue() {
        return value;
    }
}

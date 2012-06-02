package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Short.class)
public class ShortDomain {
    private final Short value;
    public ShortDomain(Short value) {
        this.value = value;
    }
    public Short getValue() {
        return value;
    }
    public short getShortValue() {
        return value.shortValue();
    }
}

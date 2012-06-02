package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = int.class)
public class PrimitiveIntDomain {
    private final int value;
    public PrimitiveIntDomain(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = boolean.class)
public class PrimitiveBooleanDomain {
    private final boolean value;
    public PrimitiveBooleanDomain(boolean value) {
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }
}

package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Boolean.class)
public class BooleanDomain {
    private final Boolean value;
    public BooleanDomain(Boolean value) {
        this.value = value;
    }
    public Boolean getValue() {
        return value;
    }
    public boolean getBooleanValue() {
        return value.booleanValue();
    }
}

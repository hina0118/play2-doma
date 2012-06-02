package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Integer.class)
public class IntegerDomain {
    private final Integer value;
    public IntegerDomain(Integer value) {
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
    public int getIntValue() {
        return value.intValue();
    }
}

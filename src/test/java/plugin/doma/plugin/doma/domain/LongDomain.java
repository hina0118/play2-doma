package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Long.class)
public class LongDomain {
    private final Long value;
    public LongDomain(Long value) {
        this.value = value;
    }
    public Long getValue() {
        return value;
    }
    public long getLongValue() {
        return value.longValue();
    }
}

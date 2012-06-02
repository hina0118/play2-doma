package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Long.class, factoryMethod = "of")
public class LongFactoryDomain {
    private final Long value;
    private LongFactoryDomain(Long value) {
        this.value = value;
    }
    public Long getValue() {
        return value;
    }
    public long getLongValue() {
        return value.longValue();
    }
    public static LongFactoryDomain of(Long value) {
        return new LongFactoryDomain(value);
    }
}

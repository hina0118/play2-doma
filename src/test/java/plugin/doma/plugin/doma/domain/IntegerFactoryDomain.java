package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Integer.class, factoryMethod = "of")
public class IntegerFactoryDomain {
    private final Integer value;
    private IntegerFactoryDomain(Integer value) {
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
    public int getIntValue() {
        return value.intValue();
    }
    public static IntegerFactoryDomain of(Integer value) {
        return new IntegerFactoryDomain(value);
    }
}

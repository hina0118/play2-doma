package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Short.class, factoryMethod = "of")
public class ShortFactoryDomain {
    private final Short value;
    private ShortFactoryDomain(Short value) {
        this.value = value;
    }
    public Short getValue() {
        return value;
    }
    public short getShortValue() {
        return value.shortValue();
    }
    public static ShortFactoryDomain of(Short value) {
        return new ShortFactoryDomain(value);
    }
}

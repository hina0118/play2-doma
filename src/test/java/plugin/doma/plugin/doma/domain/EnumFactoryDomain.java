package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = EnumFactoryDomain.COLOR.class, factoryMethod = "of")
public class EnumFactoryDomain {
    public enum COLOR {RED, BLUE, GREEN};
    private final COLOR value;
    private EnumFactoryDomain(COLOR value) {
        this.value = value;
    }
    public COLOR getValue() {
        return value;
    }
    public static EnumFactoryDomain of(COLOR value) {
        return new EnumFactoryDomain(value);
    }
}

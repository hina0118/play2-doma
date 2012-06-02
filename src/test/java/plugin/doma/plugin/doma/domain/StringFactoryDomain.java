package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = String.class, factoryMethod = "of")
public class StringFactoryDomain {
    private final String value;
    private StringFactoryDomain(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public static StringFactoryDomain of(String value) {
        return new StringFactoryDomain(value);
    }
}

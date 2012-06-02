package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = Boolean.class, factoryMethod = "of")
public class BooleanFactoryDomain {
    private final Boolean value;
    private BooleanFactoryDomain(Boolean value) {
        this.value = value;
    }
    public Boolean getValue() {
        return value;
    }
    public boolean getBooleanValue() {
        return value.booleanValue();
    }
    public static BooleanFactoryDomain of(Boolean value) {
        return new BooleanFactoryDomain(value);
    }
}

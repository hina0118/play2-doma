package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = boolean.class, factoryMethod = "of")
public class PrimitiveBooleanFactoryDomain {
    private final boolean value;
    private PrimitiveBooleanFactoryDomain(boolean value) {
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }
    public static PrimitiveBooleanFactoryDomain of(boolean value) {
        return new PrimitiveBooleanFactoryDomain(value);
    }
}

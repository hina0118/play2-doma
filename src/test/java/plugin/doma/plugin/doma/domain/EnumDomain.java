package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = EnumDomain.COLOR.class)
public class EnumDomain {
    public enum COLOR {RED, BLUE, GREEN};
    private final COLOR value;
    public EnumDomain(COLOR value) {
        this.value = value;
    }
    public COLOR getValue() {
        return value;
    }
}

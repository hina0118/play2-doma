package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

/**
 *
 */
@Domain(valueType = String.class)
public class StringDomain {
    private final String value;
    public StringDomain(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

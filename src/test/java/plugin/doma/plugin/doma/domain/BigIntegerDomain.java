package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

import java.math.BigInteger;

/**
 *
 */
@Domain(valueType = BigInteger.class)
public class BigIntegerDomain {
    private final BigInteger value;
    public BigIntegerDomain(BigInteger value) {
        this.value = value;
    }
    public BigInteger getValue() {
        return value;
    }
    public int getIntegerValue() {
        return value.intValue();
    }
}

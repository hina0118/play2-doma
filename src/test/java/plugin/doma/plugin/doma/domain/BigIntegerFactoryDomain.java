package plugin.doma.plugin.doma.domain;

import org.seasar.doma.Domain;

import java.math.BigInteger;

/**
 *
 */
@Domain(valueType = BigInteger.class, factoryMethod = "of")
public class BigIntegerFactoryDomain {
    private final BigInteger value;
    private BigIntegerFactoryDomain(BigInteger value) {
        this.value = value;
    }
    public BigInteger getValue() {
        return value;
    }
    public int getIntegerValue() {
        return value.intValue();
    }
    public static BigIntegerFactoryDomain of(BigInteger value) {
        return new BigIntegerFactoryDomain(value);
    }
}

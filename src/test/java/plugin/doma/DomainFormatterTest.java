package plugin.doma;

import org.junit.Test;
import plugin.doma.plugin.doma.domain.*;

import java.text.ParseException;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 *
 */
public class DomainFormatterTest {

    /**
     *
     */
    // String
    @Test
    public void testStringTypeByConstructor() throws ParseException {
        DomainFormatter<StringDomain> formatter = DomainFormatter.create(StringDomain.class);
        StringDomain domain = formatter.parse("data", Locale.getDefault());
        assertNotNull(domain);
        assertEquals("data", domain.getValue());
    }

    /**
     *
     */
    // Integer
    @Test
    public void testIntegerTypeByConstructor() throws ParseException {
        DomainFormatter<IntegerDomain> formatter = DomainFormatter.create(IntegerDomain.class);
        IntegerDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getIntValue());
    }

    /**
     *
     */
    // Date
    @Test
    public void testDateTypeByConstructor() throws  ParseException {
        DomainFormatter<DateDomain> formatter = DomainFormatter.create(DateDomain.class);
        DateDomain domain = formatter.parse("2012/05/01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals("2012/05/01", domain.getFormatString());
    }

    // Array 未対応

    /**
     *
     */
    // BigDecimal
    @Test
    public void testBigDecimalTypeByConstructor() throws  ParseException {
        DomainFormatter<BigDecimalDomain> formatter = DomainFormatter.create(BigDecimalDomain.class);
        BigDecimalDomain domain = formatter.parse("100000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(100000000000l, domain.getLongValue());
    }

    /**
     *
     */
    // BigInteger
    @Test
    public void testBigIntegerTypeByConstructor() throws  ParseException {
        DomainFormatter<BigIntegerDomain> formatter = DomainFormatter.create(BigIntegerDomain.class);
        BigIntegerDomain domain = formatter.parse("1000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(1000000000, domain.getIntegerValue());
    }

    // Blob 未対応

    /**
     *
     */
    // Boolean
    @Test
    public void testBooleanTypeByConstructor() throws  ParseException {
        DomainFormatter<BooleanDomain> formatter = DomainFormatter.create(BooleanDomain.class);
        BooleanDomain domain = formatter.parse("true", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(true, domain.getBooleanValue());
    }

    // Bytes 未対応

    // Byte 未対応

    // Clob 未対応

    // sql.Date 未対応

    /**
     *
     */
    // Double
    @Test
    public void testDoubleTypeByConstructor() throws  ParseException {
        DomainFormatter<DoubleDomain> formatter = DomainFormatter.create(DoubleDomain.class);
        DoubleDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01d, domain.getDoubleValue(), 0);
    }

    /**
     *
     */
    // Enum
    @Test
    public void testEnumTypeByConstructor() throws  ParseException {
        DomainFormatter<EnumDomain> formatter = DomainFormatter.create(EnumDomain.class);
        EnumDomain domain = formatter.parse("RED", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(EnumDomain.COLOR.RED, domain.getValue());
    }

    /**
     *
     */
    // Float
    @Test
    public void testFloatTypeByConstructor() throws  ParseException {
        DomainFormatter<FloatDomain> formatter = DomainFormatter.create(FloatDomain.class);
        FloatDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01f, domain.getFloatValue(), 0);
    }

    /**
     *
     */
    // Long
    @Test
    public void testLongTypeByConstructor() throws  ParseException {
        DomainFormatter<LongDomain> formatter = DomainFormatter.create(LongDomain.class);
        LongDomain domain = formatter.parse("100000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(100000000000l, domain.getLongValue());
    }

    // NClob 未対応

    // Number 未対応

    /**
     *
     */
    // Short
    @Test
    public void testShortTypeByConstructor() throws  ParseException {
        DomainFormatter<ShortDomain> formatter = DomainFormatter.create(ShortDomain.class);
        ShortDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getShortValue());
    }

    // Timestamp 未対応

    // Time 未対応

    /**
     *
     */
    // int
    @Test
    public void testPrimitiveIntTypeByConstructor() throws ParseException {
        DomainFormatter<PrimitiveIntDomain> formatter = DomainFormatter.create(PrimitiveIntDomain.class);
        PrimitiveIntDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getValue());
    }

    // byte

    /**
     *
     */
    // double
    @Test
    public void testPrimitiveDoubleTypeByConstructor() throws ParseException {
        DomainFormatter<PrimitiveDoubleDomain> formatter = DomainFormatter.create(PrimitiveDoubleDomain.class);
        PrimitiveDoubleDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01d, domain.getValue(), 0);
    }

    /**
     *
     */
    // float
    @Test
    public void testPrimitiveFloatTypeByConstructor() throws ParseException {
        DomainFormatter<PrimitiveFloatDomain> formatter = DomainFormatter.create(PrimitiveFloatDomain.class);
        PrimitiveFloatDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01f, domain.getValue(), 0);
    }

    /**
     *
     */
    // short
    @Test
    public void testPrimitiveShortTypeByConstructor() throws ParseException {
        DomainFormatter<PrimitiveShortDomain> formatter = DomainFormatter.create(PrimitiveShortDomain.class);
        PrimitiveShortDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getValue());
    }

    /**
     *
     */
    // long
    @Test
    public void testPrimitiveLongTypeByConstructor() throws  ParseException {
        DomainFormatter<PrimitiveLongDomain> formatter = DomainFormatter.create(PrimitiveLongDomain.class);
        PrimitiveLongDomain domain = formatter.parse("100000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(100000000000l, domain.getValue());
    }

    /**
     *
     */
    // boolean
    @Test
    public void testPrimitiveBooleanTypeByConstructor() throws  ParseException {
        DomainFormatter<PrimitiveBooleanDomain> formatter = DomainFormatter.create(PrimitiveBooleanDomain.class);
        PrimitiveBooleanDomain domain = formatter.parse("false", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(false, domain.getValue());
    }

    // char 未対応

    // Character 未対応

    // ************************ ファクトリーメソッド対応 ************************

    /**
     *
     */
    // String
    @Test
    public void testStringTypeByFactory() throws ParseException {
        DomainFormatter<StringFactoryDomain> formatter = DomainFormatter.create(StringFactoryDomain.class);
        StringFactoryDomain domain = formatter.parse("data", Locale.getDefault());
        assertNotNull(domain);
        assertEquals("data", domain.getValue());
    }

    /**
     *
     */
    // Integer
    @Test
    public void testIntegerTypeByFactory() throws ParseException {
        DomainFormatter<IntegerFactoryDomain> formatter = DomainFormatter.create(IntegerFactoryDomain.class);
        IntegerFactoryDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getIntValue());
    }

    /**
     *
     */
    // Date
    @Test
    public void testDateTypeByFactory() throws  ParseException {
        DomainFormatter<DateFactoryDomain> formatter = DomainFormatter.create(DateFactoryDomain.class);
        DateFactoryDomain domain = formatter.parse("2012/05/01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals("2012/05/01", domain.getFormatString());
    }

    // Array 未対応

    /**
     *
     */
    // BigDecimal
    @Test
    public void testBigDecimalTypeByFactory() throws  ParseException {
        DomainFormatter<BigDecimalFactoryDomain> formatter = DomainFormatter.create(BigDecimalFactoryDomain.class);
        BigDecimalFactoryDomain domain = formatter.parse("100000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(100000000000l, domain.getLongValue());
    }

    /**
     *
     */
    // BigInteger
    @Test
    public void testBigIntegerTypeByFactory() throws  ParseException {
        DomainFormatter<BigIntegerFactoryDomain> formatter = DomainFormatter.create(BigIntegerFactoryDomain.class);
        BigIntegerFactoryDomain domain = formatter.parse("1000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(1000000000, domain.getIntegerValue());
    }

    // Blob 未対応

    /**
     *
     */
    // Boolean
    @Test
    public void testBooleanTypeByFactory() throws  ParseException {
        DomainFormatter<BooleanFactoryDomain> formatter = DomainFormatter.create(BooleanFactoryDomain.class);
        BooleanFactoryDomain domain = formatter.parse("true", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(true, domain.getBooleanValue());
    }

    // Bytes 未対応

    // Byte 未対応

    // Clob 未対応

    // sql.Date 未対応

    /**
     *
     */
    // Double
    @Test
    public void testDoubleTypeByFactory() throws  ParseException {
        DomainFormatter<DoubleFactoryDomain> formatter = DomainFormatter.create(DoubleFactoryDomain.class);
        DoubleFactoryDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01d, domain.getDoubleValue(), 0);
    }

    /**
     *
     */
    // Enum
    @Test
    public void testEnumTypeByFactory() throws  ParseException {
        DomainFormatter<EnumFactoryDomain> formatter = DomainFormatter.create(EnumFactoryDomain.class);
        EnumFactoryDomain domain = formatter.parse("RED", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(EnumFactoryDomain.COLOR.RED, domain.getValue());
    }

    /**
     *
     */
    // Float
    @Test
    public void testFloatTypeByFactory() throws  ParseException {
        DomainFormatter<FloatFactoryDomain> formatter = DomainFormatter.create(FloatFactoryDomain.class);
        FloatFactoryDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01f, domain.getFloatValue(), 0);
    }

    /**
     *
     */
    // Long
    @Test
    public void testLongTypeByFactory() throws  ParseException {
        DomainFormatter<LongFactoryDomain> formatter = DomainFormatter.create(LongFactoryDomain.class);
        LongFactoryDomain domain = formatter.parse("100000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(100000000000l, domain.getLongValue());
    }

    // NClob 未対応

    // Number 未対応

    /**
     *
     */
    // Short
    @Test
    public void testShortTypeByFactory() throws  ParseException {
        DomainFormatter<ShortFactoryDomain> formatter = DomainFormatter.create(ShortFactoryDomain.class);
        ShortFactoryDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getShortValue());
    }

    // Timestamp 未対応

    // Time 未対応

    /**
     *
     */
    // int
    @Test
    public void testPrimitiveIntTypeByFactory() throws ParseException {
        DomainFormatter<PrimitiveIntFactoryDomain> formatter = DomainFormatter.create(PrimitiveIntFactoryDomain.class);
        PrimitiveIntFactoryDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getValue());
    }

    // byte

    /**
     *
     */
    // double
    @Test
    public void testPrimitiveDoubleTypeByFactory() throws ParseException {
        DomainFormatter<PrimitiveDoubleFactoryDomain> formatter = DomainFormatter.create(PrimitiveDoubleFactoryDomain.class);
        PrimitiveDoubleFactoryDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01d, domain.getValue(), 0);
    }

    /**
     *
     */
    // float
    @Test
    public void testPrimitiveFloatTypeByFactory() throws ParseException {
        DomainFormatter<PrimitiveFloatFactoryDomain> formatter = DomainFormatter.create(PrimitiveFloatFactoryDomain.class);
        PrimitiveFloatFactoryDomain domain = formatter.parse("2.01", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(2.01f, domain.getValue(), 0);
    }

    /**
     *
     */
    // short
    @Test
    public void testPrimitiveShortTypeByFactory() throws ParseException {
        DomainFormatter<PrimitiveShortFactoryDomain> formatter = DomainFormatter.create(PrimitiveShortFactoryDomain.class);
        PrimitiveShortFactoryDomain domain = formatter.parse("10", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(10, domain.getValue());
    }

    /**
     *
     */
    // long
    @Test
    public void testPrimitiveLongTypeByFactory() throws  ParseException {
        DomainFormatter<PrimitiveLongFactoryDomain> formatter = DomainFormatter.create(PrimitiveLongFactoryDomain.class);
        PrimitiveLongFactoryDomain domain = formatter.parse("100000000000", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(100000000000l, domain.getValue());
    }

    /**
     *
     */
    // boolean
    @Test
    public void testPrimitiveBooleanTypeByFactory() throws  ParseException {
        DomainFormatter<PrimitiveBooleanFactoryDomain> formatter = DomainFormatter.create(PrimitiveBooleanFactoryDomain.class);
        PrimitiveBooleanFactoryDomain domain = formatter.parse("false", Locale.getDefault());
        assertNotNull(domain);
        assertEquals(false, domain.getValue());
    }

    // char 未対応

    // Character 未対応

}

import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
		assertEquals("IV", number.toRoman(4));
		assertEquals("V", number.toRoman(5));
		assertEquals("VI", number.toRoman(6));
		assertEquals("IX", number.toRoman(9));
		assertEquals("X", number.toRoman(10));
		assertEquals("XX", number.toRoman(20));
		assertEquals("XXIV", number.toRoman(24));
		assertEquals("L", number.toRoman(50));
		assertEquals("XL", number.toRoman(40));
		assertEquals("XLII", number.toRoman(42));
		assertEquals("C", number.toRoman(100));
		assertEquals("XC", number.toRoman(90));
		assertEquals("CVIII", number.toRoman(108));
		assertEquals("CCI", number.toRoman(201));
		assertEquals("CCCXLI", number.toRoman(341));
		assertEquals("D", number.toRoman(500));
		assertEquals("CD", number.toRoman(400));
		assertEquals("CDLXXII", number.toRoman(472));
		assertEquals("DCCXCI", number.toRoman(791));
		
	}
	

}

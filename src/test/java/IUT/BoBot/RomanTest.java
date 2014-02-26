package IUT.BoBot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class RomanTest {
	@Test
	public final void test1() {
	assertEquals(1, Roman.decode("I"));
	}
	@Test
	public final void test5() {
	assertEquals(5, Roman.decode("V"));
	}
	@Test
	public final void test4() {
	assertEquals(4, Roman.decode("IV"));
	}
	@Test
	public final void test10() {
	assertEquals(10, Roman.decode("X"));
	}
	@Test
	public final void test100() {
	assertEquals(100, Roman.decode("C"));
	}
	@Test
	public final void test50() {
	assertEquals(50, Roman.decode("L"));
	}
	@Test
	public final void test90() {
	assertEquals(90, Roman.decode("XC"));
	}
	@Test
	public final void test190() {
	assertEquals(190, Roman.decode("CXC"));
	}
	@Test
	public final void test399() {
	assertEquals(399, Roman.decode("CCCXCIX"));
	}
	@Test
	public final void test1904() {
	assertEquals(1904, Roman.decode("MCMIV"));
	}
}

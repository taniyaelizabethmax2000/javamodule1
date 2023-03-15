package firsttest;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.*;
public class TestCalculator {

	
	Calculator calc;
	
	@Before
	public void setup() throws Exception {
		calc = new Calculator();
	}
	@Test
	public void testPowerZero() {
		int inputBase=0;
		int exp=0;
		int expectedValue=0;
		int actualValue=calc.power(inputBase,0);
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testPower() {
	int	inputBase =2;
	int exp=3;
	int expectedValue=8;
	int actualValue=calc.power(inputBase, exp);
	assertEquals(expectedValue,actualValue);//assert is a keyword in java 
	//	fail("Not yet implemented");
	}
	//@Test
//     public void testFactorial() {
//     int inputNumber=5;
//     int expectedValue=120;
//     int actualValue=calc.factorial(inputNumber);
//     assertEquals(expectedValue,actualValue);
//     }
}

package paramtest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class TestPrimeNumber {

private final Integer inputNumber;
private final Boolean expectedResult;
private Primenumber primeNumber;//object ref

@Before //before going to next text object need to initialize with fresh values.
public void initialize() {
	 primeNumber=new Primenumber();
}

public TestPrimeNumber(Integer inputNumber,Boolean expectedResult) {
	this.inputNumber = inputNumber;
	this.expectedResult=expectedResult;
}

@Parameterized.Parameters
public static Collection  primeNumbers() {
	return Arrays.asList(new Object[][]{
		{2,true},
		{6,false},
		{19,true},
		{22,false},
		{23,true},	
		{24,false},
		{10,true}}
	);
		
	}

	@Test
	public void testValidator() {
		System.out.println("Parameterized number is "+inputNumber );
		assertEquals(expectedResult,primeNumber.validate(inputNumber));
		//fail("Not yet implemented");
	}

}

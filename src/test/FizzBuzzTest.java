package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTest {

	FizzBuzz fizzbuzz;
	
	@DisplayName("Test : Fizz")
	@Test
	void testFizz() {
		String number = FizzBuzz.checkerNumber(3);
		assertEquals("Fizz", number);
	}
	
	@DisplayName("Test : Buzz")
	@Test
	void testBuzz() {
		String number = FizzBuzz.checkerNumber(5);
		assertEquals("Buzz", number);
	}
	
	@DisplayName("Test : FizzBuzz")
	@Test
	void testFizzBuzz() {
		String number = FizzBuzz.checkerNumber(15);
		assertEquals("FizzBuzz", number);
	}
	
	@DisplayName("Test : Not in condition")
	@Test
	void testNotInCondition() {
		String number = FizzBuzz.checkerNumber(1);
		assertEquals("1", number);
	}
	
	@DisplayName("Test : Error < 1")
	@Test
	void testError1() {
		String number = FizzBuzz.checkerNumber(0);
		assertEquals("The number must be between 0-100!", number);
	}
	
	@DisplayName("Test : Error > 100")
	@Test
	void testError2() {
		String number = FizzBuzz.checkerNumber(101);
		assertEquals("The number must be between 0-100!", number);
	}
	
}

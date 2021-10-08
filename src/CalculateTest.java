import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculateTest {
	
	private Calculator calculator;
	
	
	@Test
	 void emptyStringReturnZero() {
		calculator = new Calculator();
		assertEquals(calculator.add(""), 0);
	}

	@Test
	 void singleValueIsReplied() {
		calculator = new Calculator();
		assertEquals(calculator.add("1"), 1);
	}

	@Test
	 void twoNumbersCommaDelimitedReturnSum() {
		calculator = new Calculator();
		assertEquals(calculator.add("1,2"), 3);
	}
	
	@Test
	 void twoNumbersNewLineDelimitedReturnSum() {
		calculator = new Calculator();
		assertEquals(calculator.add("1\n2"), 3);
	}
	
	@Test(expectedExceptions = Exception.class)
	 void negativeInputReturnsException() {
		calculator = new Calculator();
		calculator.add("-1");
	}
}

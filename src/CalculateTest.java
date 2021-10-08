import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculateTest {
	
	private Calculator calculator;
	
//	@BeforeAll
//	public void init() {
//		calculator = new Calculator();
//	}

	
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

	
}

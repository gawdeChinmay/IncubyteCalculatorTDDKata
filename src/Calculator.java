
public class Calculator {

public int add(String input) {
	
	    final String delimiter = ",|\n";
		
		String[] numbers = input.split(delimiter);
		
		if(input.isEmpty()) {
			return 0;
		}
		if(input.length() == 1) {
			return Integer.parseInt(input);
		}
		else {
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		} 
		
	}


}

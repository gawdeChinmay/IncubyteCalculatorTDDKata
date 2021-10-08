
public class Calculator {

	public int add(String input) {
		
		String[] numbers = input.split(",");
		
		if(input.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(input);
	}

}

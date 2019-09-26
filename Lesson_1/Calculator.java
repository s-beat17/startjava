public class Calculator {

	public static void main(String[] args) {
		int number1 = 10;
		System.out.println("Number One = " + number1);
		int number2 = 0;
		System.out.println("Number Two = " + number2);
		char simbol = '^';
		System.out.println("Operation = " + simbol);
		int answer;
		
		if(simbol == '+') {
			answer = number1 + number2;
			System.out.println("answer = number1 + number2: " + answer);
		} else if(simbol == '-') {
			answer = number1 - number2;
			System.out.println("Difference = number1 - number2: " + answer);
		} else if(simbol == '*') {
			answer = number1 * number2;
			System.out.println("Multiplication = number1 * number2: " + answer);
		} else if(simbol == '/') {
			if(number2 == 0) {
				System.out.println("Division by zero!!!");
			} else {
				answer = number1 / number2;
				System.out.println("Division = number1 / number2: " + answer);
			}
		} else if(simbol == '^') {
			answer = number1;
			for(int i = 1; i < number2; i++) {
				answer *= number1;
			}
			System.out.println("Exponentiation = number1 ^ number2: " + answer);
		} else if(simbol == '%') {
			answer = number1 % number2;
			System.out.println("Remainder of division = number1 mod number2: " + answer);
		}
	}
}
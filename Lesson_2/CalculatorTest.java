import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner key = new Scanner(System.in);
		do {
			System.out.print("Enter One number: ");
			int number1 = key.nextInt();
			calculatorOne.setNumber1(number1);
			System.out.print("Enter math operation sign (+,-,*,/,^,%): ");
			String simbol = key.next();
			calculatorOne.setSimbol(simbol);
			System.out.print("Enter Two number: ");
			int number2 = key.nextInt();
			calculatorOne.setNumber2(number2);
			System.out.print(calculatorOne.calc());
			System.out.println("Do you continue [yes/no]: ");
			String answer = key.next();
			calculatorOne.setAnswer(answer);
		} while ("yes".equals(calculatorOne.getAnswer()) || "no".equals(calculatorOne.getAnswer())); {
			System.out.print("Enter yes or no!!!: ");
			String answer = key.next();
		}
	}
}
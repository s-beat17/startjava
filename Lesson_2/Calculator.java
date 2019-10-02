public class Calculator {
	
	private int number1;
	private int number2;
	private String simbol;
	private String answer;

	public int getNumber1() {
		return number1;
	}

	void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	void setNumber2(int number2) {
		this.number2 = number2;
	}

	public String getAnswer() {
		return answer;
	}

	void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getSimbol() {
		return simbol;
	}

	void setSimbol(String simbol) {
		this.simbol = simbol;
	}

	public int calc() {
		int result = 0;
		switch (simbol) {
			case "+":
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;
			case "-":
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;
			case "*":
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;
			case "/":
				if(number2 == 0) {
					System.out.println("Division by zero!!!"); 
					break;
				} else {
					result = number1 / number2;
					System.out.println(number1 + " / " + number2 + " = " + result);
				}
				break;
			case "^":
				result = number1;
				for(int i = 1; i < number2; i++) {
					result *= number1;
				}
				System.out.println(number1 + " ^ " + number2 + " = " + result);
				break;
			case "%":
				result = number1 % number2;
				System.out.println(number1 + " mod " + number2 + " = " + result);
				break;
			default:
				System.out.println("Invalid operation entered!!!");
				break;
		}
		return result;
	}
}
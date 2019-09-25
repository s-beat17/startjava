public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 25;
		if(age > 20) { 
			System.out.println("You're an adult");
		}

		boolean isMale = true;
		if(isMale) { 
			System.out.println("You're a gentleman!");
		}

		boolean isFemale = false;
		if(isFemale) { 
			System.out.println("You're a Lady!");
		}
		
		double height = 1.85;
		if(height < 1.8) { 
			System.out.println("You're a good man");
		} else { 
			System.out.println("You breathe clean air");
		}

		char firstCharName = 'V';
		if(firstCharName == 'M') { 
			System.out.println("Your name begins with the letter M");
		} else if(firstCharName == 'I') { 
			System.out.println("People whose name starts with' I ' are happy");
		} else { 
			System.out.println("I already wrote that you are a good man");
		}
	}
}

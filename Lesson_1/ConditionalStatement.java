public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 25;
		String youMaleGender = "male";
		String youNotMaleGender = "female";
		int height = 1.85;
		char firstCharName = 'M';
		if(age > 20) { 
			System.out.println ("You're an adult");
		}
		if(youMaleGender == "male") { 
			System.out.println ("You're a gentleman!");
		}
		if(youNotMaleGender == "female") { 
			System.out.println ("You lady!");
		}
		if(height < 1.8) { 
			System.out.println ("You're a good man");
		} else 
			{ System.out.println ("You breathe clean air");
		}
		if(firstCharName == 'M') { 
			System.out.println ("Your name begins with the letter M");
		} else if(firstCharName == 'I'){ 
			System.out.println ("People whose name starts with' I ' are happy");
		} else 
			{ System.out.println ("I already wrote that you are a good man");
		}
	}
}
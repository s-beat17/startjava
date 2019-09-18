import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print ("Enter your age : ");
		int age = keyboard.nextInt ();
		if(age > 20) { 
			System.out.println ("You're an adult");
		}

		System.out.print ("Enter your gender(male/female) : ");
		String gen = keyboard.next ();
		if(gen.equals("male")) { 
			System.out.println ("You're a gentleman!");
		}
		if(gen.equals("female")) { 
			System.out.println ("You lady!");
		}

		System.out.print ("Enter your height(m.cm) : ");
		double hgt = keyboard.nextDouble ();
		if(hgt < 1.8) { 
			System.out.println ("You're a good man");
		}
		else { 
			System.out.println ("You breathe clean air");
		}

		System.out.print ("Enter the first letter of your name : ");
		String nme = keyboard.next ();
		if(nme.equals("M")) { 
			System.out.println ("Your name begins with the letter M");
		}
		else if(nme.equals("I")){ 
			System.out.println ("People whose name starts with' I ' are happy");
		}
		else { 
			System.out.println ("I already wrote that you are a good man");
		}

	}
}
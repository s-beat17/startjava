public class MyFirstGame {

	public static void main(String[] args) {
		int unknownNumber = 50; //Entered 0..100
		System.out.println("Entered number from 0 to 100");
		int answer = 99;
		System.out.println("The number you entered: " + answer);
		while(answer != unknownNumber) {
			if(answer < unknownNumber) {
				System.out.println("The number you entered is less than what the computer wished for!");
				answer++;
			} else {
				System.out.println("The number you entered is greater than what the computer wished for");
				answer--;
			}
		} 

		System.out.println("You guessed it!!!");
	}
}
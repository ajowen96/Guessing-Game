package logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Logic l = new Logic();
		boolean found = false;
		Scanner userInput = new Scanner(System.in);
		l.guessRange();
		int userNumber = 0;
		boolean isNumber = false;
		do {
			try {
				System.out.println("Enter a number between 1 and 100");
				userNumber = userInput.nextInt();
				isNumber = true;
				}
			catch(InputMismatchException e) {
				System.out.println("Thats a String boi... Enter a number between 1 and 100 stupid");
				}
			finally {
				userInput.nextLine();
				}
			
		}while(!isNumber || userNumber <= 0 || userNumber > 100);
		
		System.out.println("Our number: " + userNumber);
		do {
			int compGuess = l.computerGuess();
			System.out.println("Computers Guess: " + compGuess);
			found = l.winCondition(compGuess, userNumber);
			String highLow = l.higherLower(compGuess, userNumber);
			l.stream(compGuess, highLow);
		} while (found == false);
	}
}

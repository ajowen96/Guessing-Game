package logic;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Logic {
	
	List<Integer> numbers;
	
	public Logic() {
		numbers = new ArrayList<>();
	}
	
	public void guessRange() {
		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
		}
	}
	
	public int computerGuess() {
		Random r = new Random();
		return numbers.get(r.nextInt(numbers.size()));
	}
	
	public boolean winCondition(int guess, int userNumber) {
		boolean found = false;
		if (guess == userNumber) {
			System.out.println("You win!");
			found = true;
		}
		else {
			System.out.println("WRONG!");
			found = false;
		}
		return found;
	}
	
	public String higherLower(int guess, int userNumber) {
		return guess<userNumber?"Higher":"Lower";
	}
	
	public List<Integer> stream(int guess, String highLow) {
		Stream<Integer> allNumbers = numbers.stream();
		if (highLow.equals("Lower")) {
			numbers = allNumbers.filter(num -> num<guess).collect(Collectors.toList());
		}
		else if (highLow.equals("Higher")) {
			numbers = allNumbers.filter(num -> num>guess).collect(Collectors.toList());
		}
		return numbers;
	}
}

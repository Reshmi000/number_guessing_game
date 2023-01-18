import java.util.Random;
import java.util.Scanner;
//import java.util.*;
public class game{
public static void main(String[] args){
	int answer, guess;
	final int Max=5;
	Scanner Keyboard = new Scanner(System.in);
	Random rand= new Random();
	answer = rand.nextInt(Max) + 1 ;
	System.out.print("Guess a number between 1 and 5 :");
	guess = Keyboard.nextInt();
	
	if(guess == answer) {
		System.out.println("Good job, the number was: " + answer);
	}
	else {
		System.out.println("sorry, but the number was: " + answer);
	}
}
}
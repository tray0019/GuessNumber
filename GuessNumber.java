import java.util.Scanner;
import java.util.Random;
/**
 * This a very simple game that i've created. A guessing game
 * between 1 to 100. It ask the user to guess the number, with 
 * 15 attempt or else he lose. After the game is finish
 * it shows the level of the player, from a certain amount 
 * it guessed. 
 * 
 * @author Rustom Trayvilla
 * @version 1
 * @since 2023-12-18
 */
public class GuessNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int userWin = 0;
		int userLose = 0;
		
		
		int master = 0;
		int expert = 0;
		int intermediate = 0;
		int beginner = 0;
		int Ehh = 0;
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("| Welcome! Try to guess the number between 1 - 100! |");
		System.out.println("|              THINK CAREFULLY!                     |");
		System.out.println("|___________________________________________________|\n");
		
		while(true) {			
			
		int guess = 0;
		String exit = "";
		int random = rand.nextInt(100)+1;	
		int limit = 15;	
		int userGuess = 0;
		
		int attempt = 0;
		
			while(true) {
				
			
			//System.out.println(random);
			System.out.println("Guess the number? ");
			userGuess = sc.nextInt();
			
			if(random < userGuess) {
				System.out.println("Lower");
			}else if(random > userGuess) {
				System.out.println("Higher");
			}
			
			attempt++;
			while(userGuess == random) {
				System.out.println("-----------------------------------------");
				System.out.println("|You guess it! The number was "+userGuess+"         |");
				System.out.println("|Great Job!                             |");
				System.out.println("-----------------------------------------");
				userWin++;
				break;
			}
			
			
			if(userGuess != random) {
				userLose++;
				System.out.println("-----------------------------------------");
				System.out.println("|      Wrong! Try again!                |");
				System.out.println("|      You have "+limit+" attempt left         |");
				System.out.println("-----------------------------------------");
				limit--;
			}
			
		
			if(guess == limit) {
				System.out.println("You have failed! ");
				break;
			}
			
			if(userGuess == random) {
				
				break;
				}
			
			}
				
			
			if(attempt <= 4) {
				System.out.println("Your'e a MASTER!!");
				master++;
			}else if(attempt <= 6) {
				System.out.println("You're an EXPERT!");
				expert++;
			}else if(attempt <= 8) {
				System.out.println("Intermediate level");
				intermediate++;
			}else if(attempt <= 11) {
				System.out.println("Begginer level");
				beginner++;
			}else {
				System.out.println("Ehhhh");
				Ehh++;
				}
		
			
			
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("|   MASTER  |  EXPERT  |  INTERMEDIATE   |   BEGINNER  |  EHH  |");
			System.out.println("|     "+master+"     |    "+expert+"     |       "+intermediate+    "         |      "+beginner+ "      |   "+Ehh+"   |");	
			System.out.println("|______________________________________________________________|");
			
			System.out.println();
			System.out.println("You have made "+attempt+" attempt!");
			System.out.println("You have guess right "+userWin+" times!");
			System.out.println("You have guess wrong "+userLose+" times!");
				
			
			System.out.println();
			System.out.println("Would you like to keep playing?? Press y to exit anything else to continue!\n");		
			exit = sc.next();
			if(exit.equalsIgnoreCase("y")) {			
				break;
					}
			
		}
		
		
		if((Ehh > beginner)&&(Ehh > intermediate)&&(Ehh > expert)&&(Ehh > master)) {
			System.out.println("Your'e patrick");
			System.out.println("SEE YOU AGAIN");
		}else if((beginner > intermediate)&&(beginner > expert)&&(beginner > master)) {
			System.out.println("You need more practice.");
			System.out.println("SEE YOU AGAIN");
		}else if((intermediate > expert)&&(intermediate > master)) {
			System.out.println("You are Intermediate, not bad.");
			System.out.println("GREAT JOB! SEE YOU AGAIN");
		}else if((expert > master)) {
			System.out.println("YOU ARE AN EXPERT!! YOU ARE ABOVE THE AVERAGE!");
			System.out.println("GREAT JOB! SEE YOU AGAIN");
		}
		else {
			System.out.println("YOU ARE A MASTER!!! YOU ARE THE 1 PERCENT");
			System.out.println("GREAT JOB! SEE YOU AGAIN");
		}
		
		
		
		
	}
}
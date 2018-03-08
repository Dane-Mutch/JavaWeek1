package Game;

import java.util.Scanner;

public class RockPaperScissors {
	
	public static void mainGame() {
		int userScore = 0;
		int computerScore = 0;
		int draws = 0;
		
		int rockCount = 0;
		int paperCount = 0;
		int scissorCount = 0;
		
		for (int gameCounter = 1; gameCounter < 6; gameCounter++) {
			int userChoice = userInputConverter ();
			int computerChoice = randomWithRange(1,3);
			if (userChoice == computerChoice) {
				System.out.println("Draw! Try Again!");
				draws++;
			}
			 else if (userChoice == 1 && computerChoice == 2) {
					System.out.println("Computer chose Paper" + "\n" + "Paper wraps Rock! Shame!");
					computerScore++;
					rockCount++;
				
			}
			 else if (userChoice == 1 && computerChoice == 3) {
					System.out.println("Computer chose Scissors" + "\n" + "Rock beats Scissors! Smashing!");
					userScore++;
					rockCount++;
				}
			 else if (userChoice == 2 && computerChoice == 1) {
					System.out.println("Computer chose rock" + "\n" + "Paper wraps Rock! Good Job!");
					userScore++;
					paperCount++;
				}
			 else if (userChoice == 2 && computerChoice == 3) {
					System.out.println("Computer chose Scissors" + "\n" + "Scissors cuts Paper! Shame!");
					computerScore++;
					paperCount++;
				}
			 else if (userChoice == 3 && computerChoice == 2) {
					System.out.println("Scissors cuts Paper! Good Job!");
					userScore++;
					scissorCount++;
				}
			 else if (userChoice == 3 && computerChoice == 1) {
					System.out.println("Rock smashes Scissors! Shame!");
					computerScore++;
					scissorCount++;
				}
			 else if (userChoice==4) {
			break; 
			}
			}
		scoring(userScore, computerScore, draws);
		System.out.println("You chose " + mostChosenOption(rockCount, paperCount, scissorCount) + " the most, choosing it "
		+ Math.max(rockCount, Math.max(paperCount, scissorCount)) + " times");
	}	
			
		
	

	public static int userInputConverter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type rock, paper, or scissors, or press Q to quit");
		String userChoice = sc.next();
		while (!userChoice.equals("Rock") && !userChoice.equals("Scissors") && !userChoice.equals("Paper") && !userChoice.equals("Q")) {
			System.out.println("Type rock, paper, or scissors, or press Q to quit");
			userChoice = sc.next();
		}
		if (userChoice.equals("Rock")) {
			return 1;
		} else if (userChoice.equals("Paper")) {
			return 2;
		}
		else if (userChoice.equals("Scissors")) {
			return 3;
		}
		else if (userChoice.equals("Q")) {
			return 4;
		}
		return 0;
	}
	

	public static int randomWithRange(int a, int b) {
		int range = b-a + 1;
		return (int)(Math.random() * range) + a;
	}
	
	public static void scoring(int userScore, int computerScore, int draws) {
		int totalGames = userScore + computerScore + draws;
		System.out.println("You played " + totalGames + " games");
		System.out.println("You won " + userScore + " games");
		System.out.println("Computer won " + computerScore + " games");
		System.out.println("Your win rate was " + (userScore  * 100) / totalGames + "%");
		
		
	}
	
	public static String mostChosenOption(int rockCount, int scissorCount, int paperCount) {
		int[] choices = {rockCount, paperCount, scissorCount};
		int max = 0;
		int j = 0;
		for (int counter = 1; counter < choices.length; counter++) {
			if (choices[counter] > max) {
				max = choices[counter];
				j = counter;
			}
			}
		if (j == 1) { 
		return "Rock";
	}
		else if (j==2) {
		return "Scissors";
		}
		else {
		return "Paper";
		}
	
	}
	
			
		
		
	}
		
	
	


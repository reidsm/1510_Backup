import java.util.Scanner;
import java.util.Random;

public class Games {
	
	private int score;
	private Scanner scan;
	private Random rand;
	
	public Games() {
		this.score = 0;
		this.scan = new Scanner(System.in);
		this.rand = new Random();
	}
	
	public void play() {
		
		boolean gameOn = true;
		
		while(gameOn) {
		
		System.out.println("Welcome to the Games Program!");
		System.out.println("Make your choice (enter a number)");
		System.out.println("1. See your score");
		System.out.println("2. Guess a number.");
		System.out.println("3. Play Rock, Paper, Scissors");
		System.out.println("4. Quit");
		
		String input = this.scan.next();
		
		switch (input) {
		
			case "1":
				System.out.println(this.score);
				break;
			case "2":
				guessANumber();
				break;
			case "3":
				rockPaperScissors();
				break;
			case "4":
				gameOn = false;
				System.out.println("Game Over");
				break;
			default:
				System.out.println("That's not a valid input. Please try again.");	
		
		}
		
		}
	}
	
	public void guessANumber() {
		
		int randNum = this.rand.nextInt(101);
		int numGuesses = 0;
		
		System.out.println("I've picked a number between 0 and 100, can you guess the number?");
		int playerGuess = this.scan.nextInt();
		
		while(playerGuess != randNum) {
			
			numGuesses++;
			
			if(playerGuess > randNum) {		
				System.out.println("Too high, guess again!");
				playerGuess = this.scan.nextInt();		
			}else if(playerGuess < randNum) {
				System.out.println("Too low, guess again!");
				playerGuess = this.scan.nextInt();
			}
		}
		
		if(playerGuess == randNum) {
			System.out.println("RIGHT!");
			if(numGuesses <= 5) {
				System.out.println("Five points!");
				this.score += 5;
			}
		}
		
	}
	
	public void rockPaperScissors() {
		int compChoice = this.rand.nextInt(3);
		String compString;
		
		if(compChoice == 0) {
			compString = "rock";
		}else if(compChoice == 1) {
			compString = "paper";
		}else if(compChoice == 2) {
			compString = "scissors";
		}else {
			compString = "error";
		}
		
		int playerChoice;
		
		System.out.println("I've picked one of ROCK, PAPER, or SCISSORS. Which do you choose?");
		String input = this.scan.next().toLowerCase();
		
		while(!(input.equals("rock") || input.equals("paper") || input.equals("scissors"))) {
			System.out.println("That's not a valid choice. Try again!");
			input = this.scan.next().toLowerCase();
		}
		
		if(input.equals("rock")) {
			playerChoice = 0;
		}else if(input.equals("paper")) {
			playerChoice = 1;
		}else if(input.equals("scissors")) {
			playerChoice = 2;
		}else {
			playerChoice = -1;
		}
		
		while(playerChoice == compChoice) {
			System.out.println("Tie, try again");
			
			input = this.scan.next().toLowerCase().trim();
			
			while(!(input.equals("rock") || input.equals("paper") || input.equals("scissors"))) {
				System.out.println("That's not a valid choice. Try again!");
				input = this.scan.next().toLowerCase().trim();
			}
			
			if(input.equals("rock")) {
				playerChoice = 0;
			}else if(input.equals("paper")) {
				playerChoice = 1;
			}else if(input.equals("scissors")) {
				playerChoice = 2;
			}else {
				playerChoice = -1;
			}
		}
		
		if((playerChoice == 0 && compChoice == 2)
				|| (playerChoice == 1 && compChoice == 0)
				|| (playerChoice == 2 && compChoice == 1)) {
			System.out.println("Your opponent played " + compString);
			System.out.println("You win!");
			this.score += 5;
		}else if((playerChoice == 0 && compChoice == 1)
				|| (playerChoice == 1 && compChoice == 2)
				|| (playerChoice == 2 && compChoice == 0)) {
			System.out.println("Your opponent played " + compString);
			System.out.println("You lose!");
			this.score -= 3;
		}else {
			System.out.println("There was an error.");
		}
		
	}

}

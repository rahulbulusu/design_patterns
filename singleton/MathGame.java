import java.util.Random;
import java.util.*;

/**
 * Is a math game that gives random addition, subtraction, multiplication, 
 * and division problems for the user to do. The user inputs in the answer 
 * and the console compares to see if the user got the answer to the problem 
 * right or wrong.
 * @author Rahul Bulusu
 */
public class MathGame {
	private static MathGame mathGame;
	private int score = 0;
	private Random rand;
	private Scanner reader;
	private String[] operands = {"+","-","*","/"};
	
	/**
	 * Creates a random object and a scanner object. In addition, it 
	 * prints out a statement for the math game. 
	 */
	private MathGame() {
		rand = new Random();
		reader = new Scanner(System.in);
		System.out.println("Let's have fun with Math!");
	}
	
	/**
	 * Checks if there is an instance of MathGame. If it exists already, 
	 * then it returns that same instance. If it doesn't exist yet, then 
	 * it creates a new instance of the MathGame and returns the new instance. 
	 * @return mathGame the instance of the MathGame 
	 */
	public static MathGame getInstance() {
		if(mathGame == null)
			mathGame = new MathGame();
		return mathGame;
	}
	
	/**
	 * Contains a while loop that allows the user to continue solving the math 
	 * problems in the MathGame as long as they want to. In addition, it prompts 
	 * the user to play or quit and the user inputs either p for play or q for quit.
	 * If they input anything other than those two letters then it prints out an 
	 * invalid message to the user and loops again. If the user picks q, then the 
	 * MathGame ends, displays the score of how many math problems the user got right, and 
	 * prints Goodbye. If the user picks p then another round is played.
	 */
	public void play() {
		while(true) {
			System.out.print("(P)lay or (Q)uit: ");
			String input = reader.nextLine();
			if(input.equalsIgnoreCase("Q")) {
				System.out.println("You won "+score+" games!");
				System.out.println("Goodbye");
				break;
			}
			else if(input.equalsIgnoreCase("P")) {
				System.out.println();
				System.out.println("Round answer to 1 decimal place");
				boolean pR = playRound();
				if(pR) 
					score++;
			}
			else {
				System.out.println("Sorry, you must enter p or q");	
			}
		}
	}
	
	/**
	 * Generates two random numbers between 1 and 100. Next, picks a random
	 * operand for the math problem for the array of operands. Then, it prompts 
	 * the user with the math question to solve. The user then has to type the 
	 * answer into the console. If the user gets the problem right, then a happy 
	 * message is printed and true is returned. If user gets the problem wrong, then 
	 * a sad message is printed, false is returned, and the correct answer is printed
	 * for the user to know what it is. 
	 * @return true if the user gets the math problem correct
	 * @return false if the user gets the math problem wrong 
	 */
	private boolean playRound() {
		int num = rand.nextInt(100)+1;
		int num1 = rand.nextInt(100)+1;
		String opp = operands[rand.nextInt(4)];
		System.out.print(num+" "+opp+" "+num1+" = ");
		String ans = String.format("%.1f",reader.nextDouble());
		reader.nextLine();
		if(opp.equals("+")) {
			String correct = String.format("%.1f", ((double)num)+num1);
			if(ans.equals(correct)) {
				System.out.println("You got it!");
				return true;
			}
			else {
				System.out.println("The correct answer is: "+correct);
				return false;
			}
		}
		else if(opp.equals("-")) {
			String correct = String.format("%.1f", ((double)num)-num1);
			if(ans.equals(correct)) {
				System.out.println("You got it!");
				return true;
			}
			else {
				System.out.println("The correct answer is: "+correct);
				return false;
			}
		}
		else if(opp.equals("*")) {
			String correct = String.format("%.1f", ((double)num)*num1);
			if(ans.equals(correct)) {
				System.out.println("You got it!");
				return true;
			}
			else {
				System.out.println("The correct answer is: "+correct);
				return false;
			}
		}
		else {
			String correct = String.format("%.1f", ((double)num)/num1);
			if(ans.equals(correct)) {
				System.out.println("You got it!");
				return true;
			}
			else {
				System.out.println("The correct answer is: "+correct);
				return false;
			}
		}
	}
}

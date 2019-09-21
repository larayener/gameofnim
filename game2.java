import java.util.Random;
import java.util.Scanner;

/*****************************************
 * A template for a Nim game
 ****************************************/ 

public class Game2{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private int difficulty;
    private int turn;
    
    public Game2(int difficulty){
        this.difficulty = difficulty;
        turn = 1;
        marbles = 100;
    }
     
    public void play(){
    	while (true) {
    	if (turn == 1) {
    		Scanner s = new Scanner(System.in);
    		System.out.println("It's your turn! There are " + marbles + " marbles.");
    		int j = s.nextInt();
    		while (j > (marbles / 2) || j < 1) {
    			System.out.println("Your input has to be bigger than 1 and smaller than " + (marbles / 2));
    			j = s.nextInt();
    		}
    		marbles = marbles - j;
    		turn = 0;
    		if (marbles == 0) {
    			System.out.println("You lost!!!!");
    			return;
    		}
    	}
    	
    	if (turn == 0) {
    		if (difficulty == 1) {
    			Random randomGenerator = new Random();
    			int randomInt;
    			if (marbles == 1) {
    				randomInt = 1;
    			}
    			else {
    				randomInt = randomGenerator.nextInt(marbles / 2) + 1;
    			}
    			System.out.println(randomInt);
    			marbles = marbles - randomInt;
    			turn = 1;
    			if (marbles == 0) {
    				System.out.println("You won!!");
    				return;
    			}
    		}
    		if (difficulty == 2) {
    			int compchoice = 0;
    			
    			for (int i = 2; i <= 6; i++) {
    			
    			if (marbles > Math.pow(2, i) -1 && Math.pow(2, i) -1 > (marbles / 2)) {
    				compchoice = (int) (marbles - (Math.pow(2, i) -1));
    			}

    			}
    			if (compchoice == 0) {
    				Random randomGenerator = new Random();
    				compchoice = randomGenerator.nextInt(marbles / 2) + 1;
    			}
    			System.out.println(compchoice);
    			marbles = marbles - compchoice;
    			turn = 1;
    			if (marbles == 0) {
    				System.out.println("You won!!");
    				return;
    			}
    		}
    	}
    }
    }

    // you may wish to add more methods here
    


}

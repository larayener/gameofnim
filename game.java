import java.util.Random;

public class Game {
	    
	    private int marbles;
	    private Human humanPlayer;
	    private Computer computerPlayer;
	    private int difficulty;
	    private int turn; // 0 = computer; 1 = human
	
	    public Game(int difficulty){
	    	computerPlayer = new Computer(difficulty);
	    	humanPlayer = new Human();
	        this.difficulty = difficulty;
	        Random randomGenerator = new Random();
			int randomInt;
			randomInt = randomGenerator.nextInt(2);
			turn = randomInt;
	        marbles = randomGenerator.nextInt(91) + 10;
	    }
	    
	    public void play(){
	    	while(true) {
	    		if (turn == 0) {
	    			computerPlayer.move(marbles);
	    			int c = computerPlayer.getChoice();
	    			System.out.println("The computer took " + c + " marbles.");
	    			marbles = marbles - c;
	    			if (marbles == 1) {
	    				System.out.println("You lost!!");
	    				break;
	    			}
	    			turn = 1;
	    		}
	    		if (turn == 1) {
	    			humanPlayer.move(marbles);
	    			int g = humanPlayer.getChoice();
	    			marbles = marbles - g;
	    			if (marbles == 1) {
	    				System.out.println("You won!!");
	    				break;
	    			}
	    			turn = 0;
	    		}
	    	}
}
	    
}

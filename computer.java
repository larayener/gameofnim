import java.util.Random;

/*****************************************
 * A template for a computer Nim player
 ****************************************/ 

public class Computer{
    
    private int mode;
    private int choice;
    
    public Computer(int m){
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft){
    	if (mode == 1) {
    		Random randomGenerator = new Random();
			int randomInt;
			randomInt = randomGenerator.nextInt(marblesLeft / 2) + 1;
			choice = randomInt;
    	}
    	if (mode == 2) {
    		for (int i = 2; i < 7; i++) {
    			int k = (int) (Math.pow(2, i) -1);
    			if (k >= marblesLeft/2 && k <= marblesLeft) {
    				choice = marblesLeft - k;
    				return;
    			}
    		}
    		Random randomGenerator = new Random();
			int randomInt;
			randomInt = randomGenerator.nextInt(marblesLeft / 2) + 1;
			choice = randomInt;
    	}
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}

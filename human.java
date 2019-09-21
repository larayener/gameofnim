/*****************************************
 * A template for a Human Nim player
 ****************************************/ 
import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human(){
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(int MarblesLeft){
    	System.out.println("There are " + MarblesLeft + " marbles left. What's your move?");
    	int a = input.nextInt();
    	while (a > (MarblesLeft / 2)) {
    		System.out.println("That's more than half of the marbles left! Choose a different amount to take.");
    		a = input.nextInt();
    	}
    		choice = a;
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}

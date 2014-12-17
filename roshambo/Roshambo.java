
import java.util.Scanner;

public class Roshambo{
   public static void main(String[] args) {
        //Generate computer's play (0,1,2)
	int computerInt = (int)(Math.random() * 3);//Randomly generated number 0, 1, or 2
                                                   //used to determine computer's play 
 
         String computerPlay = " ";
        //Translate computer's randomly generated play to a String variable computerPlay
	switch (computerInt) {  //complete the switch statement
    case 0: computerPlay = "R";break;     
	case 1: computerPlay = "S";break;
	case 2: computerPlay = "P";break;
	}                                                       
        String personPlay = " ";
         //User's play -- "R", "P", or "S"
       Scanner scan = new Scanner(System.in);
	//Get player's play from the keyboard -- note that this is stored as a String
        System.out.println("What is your choice? Enter P for Paper, R for Rock, or S for Scissors.");
        personPlay = scan.nextLine();
	
	personPlay = personPlay.toUpperCase();

	
	//Print computer's play
	//See who won.  Use nested ifs instead of &&.
	if (personPlay.equalsIgnoreCase(computerPlay))
	{   System.out.println("It's a tie!");}
		
	else if (personPlay.equals("R"))
	{
	    if (computerPlay.equals("S"))
		{	System.out.println("Rock crushes scissors.  You win!!");}
	    else if (computerPlay.equals("P"))
		{	System.out.println("Paper covers rock.Computer wins!!");}
	}
	else if (personPlay.equals("S"))
	{
		if(computerPlay.equals("P"))
		{	System.out.println("Scissors cut paper.  You win!!");}
		else if (computerPlay.equals("R"))
		{	System.out.println("Rock crushes scissors.Computer wins!!");}
	}
	else if (personPlay.equals("P"))
	{
		if(computerPlay.equals("R"))
		{	System.out.println("Paper covers rock.You win!!");}
		else if (computerPlay.equals("S"))
		{	System.out.println("Scissors cut paper.Computer wins!!");}
	}		
	else{
	System.out.println("False!");}
  }
   
   
     
}

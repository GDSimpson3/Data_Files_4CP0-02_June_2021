import java.util.Scanner;

public class Q05 {

	private static void DisplayMenu(){
		// Completed subprogram that displays the menu 
		System.out.println("                Menu               ");
		System.out.println("-----------------------------------");
		System.out.println("[1] Add player name");
		System.out.println("[2] Play guess the capital city");
		System.out.println("[3] End game");
		System.out.println("-----------------------------------");
	}
	// End of DisplayMenu()-------------------------------------------------------------------
	private static int GetMenuChoice(){
    // Completed subprogram that gets and validates the menu choice 
		int mChoice = 0;
		
		// Menu choice is validated 
		while (mChoice != 1 && mChoice != 2 && mChoice != 3)
		{
			System.out.print("Enter your menu choice ");
			Scanner input = new Scanner(System.in);
			mChoice = Integer.parseInt(input.nextLine());	
		}

    	// Valid menu option returned to the main menu 
		return mChoice;
	}
	// End of GetMenuChoice()--------------------------------------------------------------------
	private static String AddPlayerName(){
    /* Add your code to: 
         ensure a player name is input
         return the player name to the main menu */
 
   
    	return ;

  	}
	// End of AddPlayerName()---------------------------------------------------------------------
	private static int GuessCapital(){
		/* Partially completed subprogram to:
         display questions
         check guesses
         return final score */

    	// Arrays holding question numbers, countries and their capitals 
		int[] questions = { 1, 2, 3, 4, 5 ,6 ,7 ,8, 9 };
		String[] countries = { "England", "France", "Spain", "Italy", "Germany", "Scotland", "Wales", "United Arab Emirates", "China" };
        String[] capitals = { "London", "Paris", "Madrid", "Rome", "Berlin", "Edinburgh", "Cardiff", "Abu Dhabi", "Beijing" };
        Scanner input = new Scanner(System.in);
		
        // Add your code here 
           

      
        
        

		return ;
	}
	// End of GuessCapital()------------------------------------------------------------------------
	public static void main(String[] args) throws Exception{
		int menuChoice = 0;
		int score = 0;
		String playerName = "";
		
		while (menuChoice != 3)
		{
			DisplayMenu();
			menuChoice = GetMenuChoice();
			
			/* Add your code to:
           call the relevant subprogram if the menu choice is 1 or 2
           display the player name and score  if the menu choice is 3 */
		







    
		} // End of while
	} // End of main program
} // End of class
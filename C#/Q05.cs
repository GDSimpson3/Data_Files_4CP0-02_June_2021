using System;
using System.Linq;
namespace Q05
{
    class Program
    {
        private static void DisplayMenu()
        {
            // Completed subprogram that displays the menu 
            Console.WriteLine("                   Menu                 ");
            Console.WriteLine("----------------------------------------");
            Console.WriteLine("[1] Add player name");
            Console.WriteLine("[2] Play guess the capital city");
            Console.WriteLine("[3] End game");
            Console.WriteLine("----------------------------------------");
        }
        // End of DisplayMenu()-----------------------------------------------------------------

        private static int GetMenuChoice()
        {
            // Completed subprogram that gets and validates the menu choice
            int[] choices = { 1, 2, 3 };
            int mChoice = 0;

            // Menu choice is validated
            while (!choices.Contains(mChoice)) 
            {
                Console.Write("Enter your menu choice: ");
                mChoice = Convert.ToInt32(Console.ReadLine());
            }

            // Valid menu option returned to the main menu
            return mChoice;
        }
        //  End of GetMenuChoice()---------------------------------------------------------------

        private static string AddPlayerName()
        {
            /* Add your code to: 
                 ensure a player name is input
                 return the player name to the main menu */



            
            return ;
        }
        //  End of AddPlayerName()-----------------------------------------------------------------

        private static int GuessCapital()
        {
            /* Partially completed subprogram to:
                 display questions
                 check guesses
                 return final score */

            /* Arrays holding question numbers, countries and their capitals */
            int[] questions = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            string[] countries = { "England", "France", "Spain", "Italy", "Germany", "Scotland", "Wales", "United Arab Emirates", "China" };
            string[] capitals = { "London", "Paris", "Madrid", "Rome", "Berlin", "Edinburgh", "Cardiff", "Abu Dhabi", "Beijing" };

            // Add your code here
           



            return ;
        }
        //  End of GuessCapital()---------------------------------------------------------------------
        
        static void Main(string[] args)
        {
            int menuChoice = 0;
            int score = 0;
            string playerName = "";

            while (menuChoice != 3)
            {
                DisplayMenu();
                menuChoice = GetMenuChoice();
              
               /* Add your code to:
                    call the relevant subprogram if the menu choice is 1 or 2
                    display the player name and score  if the menu choice is 3 */
               






               
            }  // End of while
        }  // End of main program
    }  // End of class
} // End of namespace
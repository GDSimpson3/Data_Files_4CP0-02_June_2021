import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q03a {

	public static void main(String[] args) throws Exception {
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k",
						   "l","m","n","o","p","q","r","s","t","u","v",
						   "w","x","y","z"};
		String plaintext = "";
		String ciphertext = "";
		int key = 0;
		int plaintextLength = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		// Add your code to get the plaintext and convert it to lowercase


		
		// Add your code to get the key and make sure the key is between 1 and 25 



		// Ciphertext is generated 
		plaintextLength = plaintext.length();
		
		// Each plaintext letter is converted into a ciphertext letter 
		while (count < plaintextLength) 
		{
			boolean found = false;
			int alphabetCount = 0;
			
			while (alphabetCount < 26 && !found)
			{
				
				if (alphabet[alphabetCount].equals(plaintext.substring(count,count+1)))
				{
					found = true;
					if (alphabetCount + key - 26 < 0)
					{
						ciphertext += alphabet[alphabetCount + key];
					}
					else
					{
						ciphertext += alphabet[alphabetCount + key - 26];
					}
				}
				alphabetCount ++;
			}
			count ++;
		   }
		
		// Add your code to write the ciphertext to a text file 



		
		// Add your code to display the ciphertext 



	} // End of main program
} // End of class
import java.util.Scanner;

public class Q01d {

	public static void main(String[] args) {
			
		// Initialise variables
		char[] vowels = {'a','e','i','o','u'}; 
		int[] numVowels = {0,0,0,0,0};
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the sentence ");
		String sentence = input.nextLine();
		
		for (char letter : sentence.toCharArray()) 
		{
			for (int vowel = 0; vowel < vowels.length; vowel ++) 
			{
				if (letter == vowels[vowel]) 
				{
					numVowels[vowel] ++; 
				}
			}	
		}
		
		System.out.println("Here are the number of vowels in the sentence '" + sentence +"'");
		for (int vowel = 0; vowel < vowels.length; vowel ++) 
		{
			System.out.println(vowels[vowel] +" "+ numVowels[vowel]);
		}
	} // End of main program
} // End of class
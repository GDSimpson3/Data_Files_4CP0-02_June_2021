using System;
namespace Q01d
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] vowels = {'a','e', 'i' ,'o','u' }; 
            int[] numVowels = { 0, 0, 0, 0, 0 }; 
            int vowel;

            Console.WriteLine("Input the sentence");
            string sentence = Console.ReadLine().ToLower();

            foreach (char letter in sentence) 
            {
                for (vowel = 0; vowel < vowels.GetLength(0); vowel++) 
                {
                    if (letter == vowels[vowel]) 
                    {
                        numVowels[vowel]++;
                    }
                }
            }
            Console.WriteLine("Here are the number of vowels in the sentence '" + sentence + "'");
            for (vowel = 0; vowel < vowels.GetLength(0); vowel++)
            {
                Console.WriteLine(vowels[vowel] + " " + numVowels[vowel]);
            }
            
            Console.ReadKey();

        } // End of main program
    } // End of class
} // End of namespace

/*Write the complete code for a program which will work with a text file.
Your program should read in the entire file. 
Then, using a StringTokenizer object, it should print out a message to 
the screen telling the user how many words appear in the entire text of the file.
*/

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer
{
	public static void main(String[] args) throws IOException
	{
		String filename = "C://Users//Eric//Desktop//tokenTest.txt";
		String toHoldString = " ";
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext())
		{
			toHoldString += inputFile.nextLine();
		}
		
		StringTokenizer st = new StringTokenizer(toHoldString);
		
		System.out.println("Your text file contains approximately : " + st.countTokens() + " words.");
	
	}
}


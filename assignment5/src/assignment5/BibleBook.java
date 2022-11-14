package assignment5;

import java.io.File;
import java.util.Scanner;

public class BibleBook 
{
		public static void main(String[] args)
		{
			try
			{
				Scanner fileIn = new Scanner(new File(System.getProperty("user.dir") + "/src/assignment5/input.dat"));
				while(fileIn.hasNext())
				{
					String line = fileIn.nextLine();
					String array[] = line.split(":");
					
						String book = array[0];
						int chapters = Integer.parseInt(array[1]);
						String summary = array[2];
				
					System.out.println("Book name: " + book + "(" + chapters + " chapters) - " + summary);
				}
				fileIn.close();
			}
			catch(Exception e)
			{
			System.err.println(e.toString());
			}
		}
}
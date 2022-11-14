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
					
					System.out.println("Book name: " + array[0] + "(" + array[1] + " chapters) - " + array[2]);
				}
				fileIn.close();
			}
			catch(Exception e)
			{
			System.err.println(e.toString());
			}
		}
}
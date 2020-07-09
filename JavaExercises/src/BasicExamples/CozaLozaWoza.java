package BasicExamples;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CozaLozaWoza {
//Testing Git Now Again

	public static void main(String[] args) {
		System.out.print("Enter the number of positive integers to print");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		printNumbers(count);
		

	}

	public static void printNumbers(int count)
	{
	    int positiveIntegers = 1;
		for(int i = 0; i < ((count / 11) + 1); i++ )
		{
			for(int j = 0; j < 11; j++)
			{
				Boolean bool = checkForMultiples(positiveIntegers);
				
				if(bool == true)
				{
					positiveIntegers++;
				}
				else
				    {
					System.out.print(positiveIntegers + "\t");
					positiveIntegers++;
				    }
				
				if(positiveIntegers > count)
				{
					break;
				}
				
				
			}
			
			System.out.print("\n");
		
			
		}
		System.out.print("\nThe Numbers are printed");
	}

	private static Boolean checkForMultiples(int positiveIntegers) {
		if (positiveIntegers % 3 == 0)
		{
			System.out.print("Coza");
			if(positiveIntegers % 5 == 0)
			{
				System.out.print("Loza");
			}
			if(positiveIntegers % 7 == 0 )
			{
				System.out.print("Woza");
			}System.out.print("\t");
			return true;
		}
		if(positiveIntegers % 5 == 0)
		{
			System.out.print("Loza");
			if(positiveIntegers % 7 == 0)
			{
				System.out.print("Woza");
			}
		}System.out.print("\t");
		return false;
	}
}
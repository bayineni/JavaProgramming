package BasicExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {

	public static void hello(String[] args) {
	
	System.out.print("What to print? 'EVEN' or 'ODD'\n");
	Scanner scan = new Scanner(System.in);
	String evenOrOdd = scan.nextLine();
	
	if(evenOrOdd.toUpperCase().equals("EVEN")) 
	{
		System.out.print("Enter the number till which you want the even numbers to be printed\n");
		int range = scan.nextInt();
		printEvenTill(range);
	
		
	}
	else if(evenOrOdd.toUpperCase().equals("ODD"))
	{
		System.out.print("Enter the number till which you want the odd numbers to be printed\n");
		int range = scan.nextInt();
		printOddTill(range);
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

	
	}

	public static void printEvenTill(int range)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int temp = 0;
		System.out.print("the Even numbers are\n");
		while(temp <= range)
		{
			if(temp % 2 == 0)
			{
				System.out.print(temp+"\t");
				numList.add(temp);
			
			}
			temp++;
		}
		System.out.print("\n");
	//	System.out.print(numList.get(2));
		
		System.out.print("The reverse sequence is\n ");
		int index = numList.size()-1;
		while(index > -1)
		{
			System.out.print(numList.get(index) + "\t");
			index--;
		}
//		for(int i = (numList.size()-1); i == 0; i-- )
//		{
//			System.out.print(numList.get(i));
//			
//		}
	}
	
	public static void printOddTill(int range)
	{
		int temp = 0;
		System.out.print("The Odd numbers are\n");
		while(temp <= range)
		{
			if(temp % 2 != 0)
			{
				System.out.print(temp+"\t");
				
			
			}
			temp++;
			
		}
		
	}
	
	
}

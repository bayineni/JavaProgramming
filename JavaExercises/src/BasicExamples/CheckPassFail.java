package BasicExamples;

import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args)
	{
		System.out.print("Enter the Marks\n");
		Scanner markScan = new Scanner(System.in);
		int mark = markScan.nextInt();
		marksCheck(mark);
		
	}
	public static void marksCheck(int marks)
	{
		char character =  marks >= 50 ? 'A' : 'B';
		switch(character)
		{case 'A' : System.out.print("PASS\n");
		break;
		
		case 'B' : System.out.print("FAIL\n");
		}
		System.out.print("DONE");
	}

}
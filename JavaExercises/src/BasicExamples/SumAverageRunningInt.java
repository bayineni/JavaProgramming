package BasicExamples;


public class SumAverageRunningInt {
	public static void main(String[] args)
	{
		int lowerBound = 1;
		int upperBound = 100;
		int sum = 0;
		for(int i = 0; i < (100 - 1); i++)
		{
			sum += lowerBound;
			lowerBound++;
		}
		double average = ((float)sum / upperBound);
		System.out.print("The sum of numbers from 1 to 100 is " + " "+ sum);
		System.out.print("\nthe average of numbers is" + " " + average );
	}
	

}


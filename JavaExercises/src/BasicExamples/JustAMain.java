package BasicExamples;

import java.util.Scanner;

public class JustAMain {
	public static void main(String[] Args) {
		System.out.print("Enter the Radius");
		Scanner sc = new Scanner(System.in);
		double in_Radius = sc.nextDouble();
		System.out.print("Enter the Height");
		double in_height = sc.nextDouble();
		Cylinder CylV = new Cylinder(in_Radius, in_height);
		CylV.setVolume();
		System.out.print("The volume is" + CylV.getVolume());
		
	}

}

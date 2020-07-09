package BasicExamples;

import java.util.Scanner;

public class Circle {
	double radius;
	double area;

	public Circle() {
		System.out.print("Enter the Radius");
		Scanner scan = new Scanner(System.in);
		double rad = scan.nextDouble();
		setRadius(rad);
		double are = scan.nextDouble();
		setArea(are);
		scan.close();

	}

	public Circle(double radius_input) {
		if (radius_input < 0) {
			this.radius = 0;
		} else {
			this.radius = radius_input;
		}
	}

	public void setRadius(double rad) {
		this.radius = rad;
	}

	public void setArea(double are) {
		this.area = radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return area;
	}
}

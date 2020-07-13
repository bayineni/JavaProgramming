package BasicExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class HamBurger {
	String meat;
	String breadRoll;
	String lettuce;
	String tomatos;
	String carrot;
	double price = 0;
	ArrayList<String> Additions = new ArrayList<String>();

	public HamBurger() {
		System.out.print("Please Provide the Type of Roll \n 1.Kaiser Roll \n 2.Onion Roll \n 3.Potato Roll");
		Scanner scan = new Scanner(System.in);
		int rollType = scan.nextInt();
		selectTheTypes(rollType);
		System.out.print("Please Select The Type of Meat \n A.Chicken \n B.Bacon \n C.Ham ");
		char meatType = scan.next().charAt(0);
		selectTheTypes(meatType);
		System.out.print("Please Select any Additions \n 1.Tomatos \n 2.lettuce \n 3.Carrot \n 4.Spinach");
		double addType = scan.nextDouble();
		selectTheTypes(addType);
		System.out.print(
				"Do you want any More Additions? \n 1.Tomatos \\n 2.lettuce \\n 3.Carrot \\n 4.Spinach \n If Not Enter NO");
		String addTypeAgain = scan.next();
		selectTheTypes(addTypeAgain);
	}

	public void selectTheTypes(int rollType) {
		switch (rollType) {
		case 1:
			this.breadRoll = "Kaiser Roll";
			break;
		case 2:
			this.breadRoll = "Onion Roll";
			break;
		case 3:
			this.breadRoll = "Potato Roll";
			break;
		}
	}

	public void selectTheTypes(char meatType) {
		switch (meatType) {
		case 'A':
			this.meat = "Chicken";
			break;
		case 'B':
			this.meat = "Bacon";
			break;
		case 'C':
			this.meat = "Ham";
			break;
		}
	}

	public void selectTheTypes(double addType) {
		int intaddType = (int) addType;
		switch (intaddType) {
		case 1:
			methodAddType("Tomatos");
			addPrice();
			break;
		case 2:
			methodAddType("Lettuce");
			addPrice();
			break;
		case 3:
			methodAddType("Carrot");
			addPrice();
			break;
		case 4:
			methodAddType("Spinach");
			addPrice();
			break;

		}
	

	}

	public void selectTheTypes(String addTypeAgain) {
		switch (addTypeAgain) {
		case "NO":finalSelection();break;
		case "no":finalSelection();break;
		case "No":finalSelection();break;
		case "nO":finalSelection();break;
		case "1":
			methodAddType("Tomatos");
			addPrice();
			additionsAgain();break;
		case "2":
			methodAddType("Lettuce");
			addPrice();
			additionsAgain();break;
		case "3":
			methodAddType("Carrot");
			addPrice();
			additionsAgain();break;
		case "4":
			methodAddType("Spinach");
			addPrice();
			additionsAgain();break;

		}

	}
	
	public void additionsAgain()
	{
		System.out.print(
				"Do you want any More Additions? \n 1.Tomatos \\n 2.lettuce \\n 3.Carrot \\n 4.Spinach \n If Not Enter NO");
		Scanner scan = new Scanner(System.in);
		String addTypeAgain = scan.next();
		selectTheTypes(addTypeAgain);
		
	}

	public void methodAddType(String additions) {
		 
		Additions.add(additions);

	}
	public void finalSelection() {
		System.out.print("The Burger You Selected is " + "  "+breadRoll + " " + meat + " " + "Additions:\n");
		System.out.println("The price is "+ price + "$");
		for(int i = 0; i < Additions.size(); i++) {
			System.out.println(Additions.get(i));
		}
	}
	
	public void addPrice() {
		this.price += 0.5;
	}

	public void addBreadRoll() {

	}

}

package BasicExamples;

import java.util.Scanner;

public class JustAMainMethod {

	public static void main(String[] args) {
		System.out.print(
				"Welcome To Bills! \n What Kind of Burger you Wanna Have? \n 1.Cheese Burger \n 2.Chilli Burger \n 3.Kiwi Burger \n Enter your Choice");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		chooseTheTypeOfHamburger(option);

	}

	public static void chooseTheTypeOfHamburger(int option) {
		System.out.print("Please Provide the Additions to HamBurgers : 50 Cents For Each ");
		switch (option) {
		case 1:
			HamBurger cheeseBurger = new HamBurger();
			break;
		case 2:
			HamBurger chilliBurger = new HamBurger();
			break;
		case 3:
			HamBurger kiwiBurger = new HamBurger();
			break;
		}

	}

}

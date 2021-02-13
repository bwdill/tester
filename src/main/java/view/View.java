package view;

import java.util.Scanner;

public class View {

	public static final int QUIT = 0;
	public static final int ADDPATIENT = 1;
	public static final int SHOWPATIENTS = 2;
	
	public static int choice;

	public static Scanner input;

	public View() {
	}


	public void showMenu() {

		System.out.println("Welcome to the Immunization Record System");
		System.out.println("Enter your choice below");
		System.out.println("Add a Patient.............." + ADDPATIENT);
		System.out.println("Show Patients.............." + SHOWPATIENTS);
		System.out.println("Quit......................." + QUIT);


	}

	public int getIntWtihPrompt(String prompt) {

		System.out.println(prompt);

		input = new Scanner(System.in);
		int userChoice = input.nextInt();
		return userChoice;
	}
	
	public String getStringWtihPrompt(String prompt) {

		System.out.println(prompt);

		input = new Scanner(System.in);
		String userInput = input.nextLine();
		return userInput;
	}

}

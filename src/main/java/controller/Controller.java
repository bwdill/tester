package controller;

import view.View;
import data.Patient;
import gson.test.GSONTesting;

public class Controller {

	private View menu;
	private GSONTesting gson = new GSONTesting();

	public Controller(View menu) {
		this.menu = menu;
	}

	public void startApp() {

		int userChoice = 1;


		while (userChoice != menu.QUIT) {
			menu.showMenu();
			userChoice = menu.getIntWtihPrompt("Enter your choice: ");
			startChoice(userChoice);
		}
	}

	public void startChoice(int userChoice) {

		if (userChoice == menu.ADDPATIENT) {
			String name = menu.getStringWtihPrompt("Enter the patients name: ");
			int age = menu.getIntWtihPrompt("Enter the patients age: ");
			String immunizedPrompt = menu.getStringWtihPrompt("Is the patient immunized? (yes or no): ");
			Boolean immunized = false;
			if(immunizedPrompt.equalsIgnoreCase("yes")) {
				immunized = true;
			}

			Patient patient = new Patient(name, age, immunized);

			GSONTesting gson = new GSONTesting();
			gson.seralizePatient(patient);
		}

		else if (userChoice == menu.SHOWPATIENTS) {
			gson.deseralizePatient("patients.json");
		}

	}

}

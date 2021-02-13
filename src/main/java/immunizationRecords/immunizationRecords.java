package immunizationRecords;

import view.View;
import controller.Controller;
public class immunizationRecords {

	public static void main(String[] args) {
		View menu = new View();
		Controller control = new Controller(menu);
		control.startApp();
	}

}

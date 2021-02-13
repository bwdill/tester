package gson.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;
import data.Patient;

public class GSONTesting {


	public static String seralizePatient(Patient patient) {


		Gson gson = new Gson();
		String me = gson.toJson(patient);


		try {
			FileWriter fw = new FileWriter("patients.json", true);
			fw.write(me + "\n");
			fw.flush();
			System.out.println("Did it");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		return me;
	}

	public static void deseralizePatient(String filename){

		Gson gson = new Gson();


		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String patient;

			while((patient = br.readLine()) != null) {
				Patient me = gson.fromJson(patient, Patient.class);
				System.out.println(me.toString() + "\n");
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}

package data;

public class Patient {

	private String name;
	private int age;
private boolean immunized = false;



	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isImmunized() {
	return immunized;
}

public void setImmunized(boolean immunized) {
	this.immunized = immunized;
}

	public Patient(String name, int age, boolean immunized) {
		this.name = name;
		this.age = age;
		this.immunized = immunized;
	}
	
	public String toString() {
		return "Name: " + this.name 
				+ "\n" + 
				"Age: " + this.age +
				"\n" +
				"Immunized: " + this.immunized;
	}
}
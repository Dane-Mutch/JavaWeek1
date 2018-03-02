public class Van extends Vehicle {
	public int storageSpace;
	

	public Van(String regNo, String Model, double weight, int storageSpace) {
		super(regNo, Model, weight);
		this.storageSpace = storageSpace;
		
		
	}
	public void accelerate() {
		
	}
	public void changeGear() {
	}
		
	
		
	public String toString() {
		return ("Vehicle Type: Van" + "\n" + "Registration number: " + regNo + "\n Model is: " + Model +
				"\n" + "Weight is: " + weight + "\n Storage space is: " + storageSpace + "\n");
		
	} 
}
		

	


public class Car extends Vehicle {
	public String carType;
	public String wheelBase;
	
	public Car(String regNo, String Model, double weight, String carType, String wheelBase) {
		super(regNo, Model, weight);
		this.carType = carType; 
		this.wheelBase = wheelBase;
		
	}



	public void accelerate() {
	} 
	


	public void changeGear() {
	} 
	
	public String toString() {
		return ("Vehicle Type: Car" + "\n" + "Registration number: " + regNo + "\n Model is: " + Model +
				"\n" + "Weight is: " + weight + "\n Car type is" + carType + "\n" + "wheelBase is: " + wheelBase + "\n");
	}
	
	
}


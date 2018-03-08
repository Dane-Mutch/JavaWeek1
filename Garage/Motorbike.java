
public class Motorbike extends Vehicle{
	public String motorbikeType;
	
	
	
	public Motorbike(String regNo, String Model, double weight, String motorbikeType) {
		super(regNo, Model, weight);
		this.motorbikeType = motorbikeType;
		
		
		
	}



	public void accelerate() {
	
		
	}



	public void changeGear() {
	
		
	}

	public String toString() {
		return ("Vehicle Type: Motorbike" + "\n" + "Registration number: " + regNo + "\n Model is: " + Model +
				"\n" + "Weight is: " + weight + "\n Vehicle subtype is: " + motorbikeType + "\n");
	}
	
	
	}


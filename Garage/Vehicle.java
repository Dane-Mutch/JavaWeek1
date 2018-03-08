public abstract class Vehicle {
	String regNo;
	String Model;
	double weight; 
	

	
	public Vehicle(String regNo, String Model, double weight) {
		this.regNo = regNo;
		this.Model = Model;
		this.weight = weight;
	}
		
	public abstract void accelerate();
	public abstract void changeGear();
	public abstract String toString();

	
	

	
	
		
}


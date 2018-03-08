import java.util.*;
import java.util.Iterator;

public class Garage {
	
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public int calculateBill(Vehicle vehicle) {
		
		Iterator<Vehicle>itr = vehicleList.iterator();
		int i = 0;
		while (itr.hasNext()) {
			if (vehicle instanceof Car) {
				i = i + 250;
			}
			else if (vehicle instanceof Van) {
				i = i + 500;
			}
			else if (vehicle instanceof Motorbike) {
				i = i + 150;
			}
		}
	return i; 
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	public void removeVehicle(String regNo) {
		Iterator<Vehicle >itr = vehicleList.iterator();
		while (itr.hasNext()) {
			if (itr.next().regNo.equals(regNo)) {
				itr.remove();
			}
		}
	}
							
			
	public void removeVehicle(Vehicle vehicle) {
		Iterator<Vehicle>itr = vehicleList.iterator();
		while (itr.hasNext()) { 
			if (itr.next().getClass().equals(vehicle.getClass())) {
				itr.remove();
			}
			
		}
	}
			

	public void emptyGarage() {
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
			
		}
	public String toString() {
		String s = ("");
		for (Vehicle v : vehicleList) { 
			s = s + v + "\n";
			
		}
	return s;
	}
	
	}



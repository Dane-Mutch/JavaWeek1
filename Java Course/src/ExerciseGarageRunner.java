import java.util.*;



public class ExerciseGarageRunner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Vehicle car1 = new Car("FG64 2PA", "Focus", 1500, "Hatchback", "Short");
		Vehicle van1 = new Van("DL14 7NB", "Transit", 2600, 146);
		Vehicle motorbike1 = new Motorbike("TR54 9IT", "Harley Davidson", 890, "Chopper");
		garage.addVehicle(car1);
		garage.addVehicle(van1);
		garage.addVehicle(motorbike1);
		System.out.println(garage);
		garage.removeVehicle("FG64 2PA");
		System.out.println("-----------------------------");
		System.out.println(garage);
		garage.removeVehicle(van1);
		System.out.println("------------------------------");
		System.out.println(garage);
		garage.emptyGarage();
		
		
		
		
		
		
	}
}


import java.util.Scanner;

public class Person {
	int playerLocationX;
	int playerLocationY;
	
	public Person(int playerLocationX, int playerLocationY) {
		this.playerLocationX = playerLocationX;
		this.playerLocationY = playerLocationY;
		
	}

Scanner sc = new Scanner(System.in);
	
public int moveNorth(Person person) {
	System.out.println("How far to travel?");
	int distanceNorth = sc.nextInt();
	playerLocationY = playerLocationY + distanceNorth;
	return playerLocationY;
}
	
public int moveSouth(Person person) {
	System.out.println("How far to travel?");
	int distanceSouth = sc.nextInt();
	playerLocationY = playerLocationY - distanceSouth;
	return playerLocationY;
}
	
public int moveWest(Person person) {
	System.out.println("How far to travel?");
	int distanceWest = sc.nextInt();
	playerLocationX = playerLocationX - distanceWest;
	return playerLocationX;
}
	
public int moveEast(Person person) {
	System.out.println("How far to travel?");
	int distanceEast = sc.nextInt();
	playerLocationX = playerLocationX + distanceEast;
	return playerLocationX;
}

		
		
public int initialNavigate(Person person) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Which way would you like to travel? (N/E/S/W)");
	String direction = sc.next();
	while (!direction.equals("n") & !direction.equals("s") & !direction.equals("w") & !direction.equals("e")) {
		System.out.println("Please enter a valid direction");
		direction = sc.next();
	}
	if (direction.equals("n")) {
		moveNorth(person);
		return playerLocationY;
	} if (direction.equals("s")) {
		moveSouth(person);
		return playerLocationY;
	} if (direction.equals("w")) {
		moveWest(person);
		return playerLocationX;
	} if (direction.equals("e")) {
		moveEast(person);
		return playerLocationX;
	}
	return 0;
	}

public void mainNavigate(Person person, Treasure treasure) {
	boolean isFound = false;
	while (isFound == false) {
		
		if ((playerLocationX == treasure.locationX) & (playerLocationY == treasure.locationY)) {
		isFound = true; 
		} else {
			System.out.println("You are currently in position " + playerLocationY + " " + playerLocationX + " and you are "
					   + howFarAwayAmI(person, treasure) + " steps from the treasure, which is to the " + whichDirectionIsTheTreasure(person, treasure));
		initialNavigate(person);
		}
	}
}
	
	
public double howFarAwayAmI(Person person, Treasure treasure) {
	double a = (Math.sqrt(Math.pow((playerLocationX-treasure.locationX), 2) + 
			   (Math.pow((playerLocationY-treasure.locationY), 2))));
	return a;
}

public String whichDirectionIsTheTreasure(Person person, Treasure treasure) {
	if (playerLocationX < treasure.locationX) {
		if (playerLocationY < treasure.locationY) {
			return "North East";
		} else if (playerLocationY == treasure.locationY) {
			return "East";
		} else {
			return "South East";
		}
	} else if (playerLocationX > treasure.locationX) {
		if (playerLocationY < treasure.locationY) {
			return "North West";
		} else if (playerLocationY == treasure.locationY) {
			return "West";
		} else {
			return "South West";
		}
	} else {
		if (playerLocationY < treasure.locationY) {
			return "North";
		} else {
			return "South";
		}
		
		
}
	
}
}
	

	
	
	




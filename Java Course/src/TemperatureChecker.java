package src;

public class TemperatureChecker {
	public static void main(String[] args) {
		temperature(70, true);
	}
	private static boolean temperature(int a, boolean isSummer) {
		if (isSummer = (true)) {
			if (a >=60 && a<=100) {
				return true;
			} else {
				return false;
			}
		} else {
				if (a >= 60 && a<=90) {
					return true;
				} else {
					return false;
				}
		}
	
	}
}

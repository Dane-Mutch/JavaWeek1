
public class DoggoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	doggoPlace(3);
		
	}
	
	
 		public static void doggoPlace (int x) {
 			int[] doggoArray = new int[101];
 			for (int i = 1; i<=100 ; i++) {
 				
 				if (i != x) {
 					doggoArray[i] = i;
 					System.out.println(doggoArray[i] + doggoOrdinal(i));
 				}
 			}
 			
 		}
 		public static String doggoOrdinal (int y) {
 			 String[] ordinalNumber = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
 			 	switch (y % 100) {
 			 		case 11: return "th";
 			 		case 12: return "th";
 			 		case 13: return "th";
 			 	
 			 	default:
 			 		return ordinalNumber[y%10];
 			 	}
 		}
 		
	
}


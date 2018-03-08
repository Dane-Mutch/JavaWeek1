public class Exercise8 {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
		System.out.println(method1(i, 0, true));
		}
}
	
	

	private static String method1(int a, int b, boolean condition) {
		String tmp = "";
		if ((a == 0) & (b == 0)) {
				tmp =  ("Both numbers are zero");
			} else if (((a + b) == a) | ((a + b) == b)) {
				if (a < b) {
					tmp =  ("The number is " + b);
				} else {
					tmp = ("The number is " + a);
				}
			} else {
				tmp =  ("Both numbers are not zero");
			}
		return tmp;
		
	}
}



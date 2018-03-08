public class Exercise9 {
	public static void main(String[] args) {
		int[] arrayOfInts = new int[10];
		for (int i=0; i<10; i++) {
		arrayOfInts[i] = i;
		System.out.println(method1(i, 0));
		}
}
	
	

	private static String method1(int a, int b) {
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
				tmp = a+b;
			}
		return tmp;
		
	}
}
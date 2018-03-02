
public class Exercise11 {
	public static void main(String[] args) {
		int [] arrayInitial = new int [10];
		for (int i=0; i<10; i++) {
			arrayInitial[i]=i;
			System.out.println(arrayInitial[i]);
		}
		method1();
	}
		private static void method1() {
			for(int j=0; j<10; j++) {
				int [] arrayFinal = new int [10];
				arrayFinal[j] = j*10;
				System.out.println((arrayFinal[j]));
			}
			
		
		
	}
		
}
	

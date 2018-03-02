public class Exercise7 {
	public static void main(String[] args) {
		System.out.println(method1());
	}

private static String method1() {
	int a=0;
	int b=0;
	if ((a==0) & (b==0)) {
		return ("Both numbers are zero");
	} else if ((a+b)==a) {
		if (a<b) {
			return ("The number is " + b);
		} else {
			return ("The number is " + a);
		}
	} else {
		return ("Both numbers are not zero");
	}
	
	}

}

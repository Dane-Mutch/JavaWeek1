public class Blackjack2 {
	
	public static void main(String[] args) {
		System.out.println(returnValue(18, 20));
	}
private static int returnValue(int a, int b) {
	if ((a>21) & (b>21)) {
		return 0;
	}
	else if ((a<=21) & (b<=21)) {
		if (a<b) {
			return b;
		} else {
			return a;
		}
	} else {
		if (a<b) {
			return a;
		} else {
			return b;
		}
	}
}
}

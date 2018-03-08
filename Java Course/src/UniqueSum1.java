public class UniqueSum1 {
	public static void main(String[] args) {
		System.out.println(sumReturn(3, 4, 3));
		System.out.println(sumReturn(3, 4, 2));
		System.out.println(sumReturn(3, 3, 3));
	}
	public static int sumReturn(int a, int b, int c) {
		int sum = 0;
		if (a != b && a != c) {
			sum += a;
		}
		if (b != a && b != c) {
			sum += b;
		}
		if (c != a && c != b) {
			sum +=c;
		}
		return sum;
	}
}

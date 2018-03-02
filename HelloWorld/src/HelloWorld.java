public class HelloWorld {
public static void main(String[] args) {
	
	method1();
	method2();
	System.out.println(method3());
}

public static void method1() {
	System.out.print("hello");
	}

public static void method2() {
	System.out.print(" world");
}

public static String method3() {
	return ("!");
	}
}
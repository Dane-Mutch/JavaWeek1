import java.util.Scanner;

public class ScannerTest {
	
	String name;
	int age;
	double weight; 
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your name");
		String name=sc.next();
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		System.out.println("Your name is " + name + " your age is: " + age);
		
		

	}

}

import java.util.*;

public class Person {
	public String name;
	public int age;
	public String job;
	public String toString() {
		return ("\n" + name + "," + age + "," + job);
	}


	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
		
	
		
	}
	
	public static Person nameGetter(ArrayList<Person> al, String name) {
		for (Person p : al) {
			if (p.name==name) {
				return p;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Person person1 = new Person("Jeff", 20, "Cleaner");	
		Person person2 = new Person("Linda", 49, "Teacher");
		Person person3 = new Person("Steve", 32, "Builder");
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(person1);
		al.add(person2);
		al.add(person3);
		System.out.print(nameGetter(al, "Linda"));
			for (Person i : al) { 
				System.out.println(i);
			}
			
		}
		
		
	}


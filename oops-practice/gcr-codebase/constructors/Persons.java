package constructors;

class Person{
	String name;
	int age;
	String gender;
	
	// Parameterized Constructor
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// Copy Constructor
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
		this.gender = p.gender;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
}

public class Persons {

	public static void main(String[] args) {
		Person p1 = new Person("Rajat Bhargava", 22, "Male");
		Person p2 = new Person(p1); // Calling Of Copy Constructor
		System.out.println("Person 1 Details");
		p1.display();
		System.out.println("Person 2 Details");
		p2.display();
	}
}

package Polymorphism;

// there are 2 types of polymorphism 1)Runtime and 2nd)Compile Time 
// compile time is basically method overloading
public class CompileTime {

	public static void main() {
		CompileTime obj = new CompileTime();
		CompileTime obj2 = new CompileTime("Shrey");
		CompileTime obj3 = new CompileTime("Stute",26);
		
		obj.f1();
		obj.f1("XYZ");

	}

	public CompileTime() {
		System.out.println("Default constructor called");
	}

	public CompileTime(String name) {
		this();// calling the default constructor
		System.out.println("Constructor with name" + name + "called");
	}

	public CompileTime(String name, int age) {
		this(name);// calling the constructor with string argument
		System.out.println("Constructor with name " + name + " and age " + age);
	}

	public void f1() {
		System.out.println("No name");
	}

	public void f1(String name) {
		System.out.println("Name is " + name);
	}

}

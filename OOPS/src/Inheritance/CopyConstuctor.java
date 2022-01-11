package Inheritance;

public class CopyConstuctor {
	int a;
	int b;

//A copy constructor is a member function which initializes an object using another object of the same class
	public static void main(String[] args) {
		CopyConstuctor ob1 = new CopyConstuctor();
		CopyConstuctor ob2 = new CopyConstuctor(ob1);
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob2.a);
		System.out.println(ob2.b);

	}

	public CopyConstuctor() {
		a = 10;
		b = 15;
	}

	public CopyConstuctor(CopyConstuctor ob) {// this is copy constructor
		a = ob.a + 10;
		b = ob.b + 15;
	}
}

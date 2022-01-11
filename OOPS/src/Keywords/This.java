package Keywords;

public class This {
	int c = 0;

	void m(This obj) {
		System.out.println("method is invoked " + c);// see the value of c will be 20 cause we given it value 20 in
														// "main" method
	}

	void p() {
		m(this);
		// 4) In event handling (or) in a situation where we have to provide reference
		// of a class to another one.
		// It is used to reuse one object in many methods.
		// here the "s1" object which we made in main method is passed to function "m"
	}

	public static void main(String[] args) {
		This s1 = new This();
		s1.c = 20;
		s1.p();
	}
	// Here is given the 6 usage of java this keyword.

	public class A {
		int a;
		int b;

		A(int a) {// 2)this can be used to refer current class instance variable.
			this.a = a;
		}

		A(int a, int b) {// 3)"this()" can be used to invoke current class constructor from other
							// constructor only
			this(20);
			b = 10;
			// this(20);// error cause "this()" must be the first statement in constructor.
		}

		void f1() {
			// this();// error this(); can only be called in a constructor to call other
			// constructor
		}

		void f2() {
			this.f1();// 1)this can be used to invoke current class method (implicitly)
			f1();// this is i guess explicit method
		}

	}

	class B {// 5) We can pass the this keyword in the constructor also. It is useful if we
				// have to use one object in multiple classes.
		A4 obj;

		B(A4 obj) {
			this.obj = obj;
		}

	}

	class A4 {
		int data = 10;

		A4() {
			B b = new B(this);// here we are passing object of class A4 to constructor of B
		}
	}

	class C { // 6) this keyword can be used to return current class instance
		C getC() {
			return this;
		}
	}

}

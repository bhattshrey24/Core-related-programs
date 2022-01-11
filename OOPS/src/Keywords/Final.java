package Keywords;

public class Final {
	// final method can be inherited but you cannot override it. For Example:

	// If you want to create a variable that is initialized at the time of creating
	// object and once initialized may not be changed, it is useful. For example PAN
	// CARD number of an employee.

	public static void main(String[] args) {
	}

	static final int data;// static blank final variable , A static final variable that is not initialized
							// at the time of declaration is known as static blank final variable. It can be
							// initialized only in static block.

	static {// this is static block
		data = 50;
	}

	public class A {
		final void f1(final int dum) {
			// dum = dum + 1;// error cause If you declare any parameter as final, you
			// cannot change the value of it.
		}

	}

	public class B extends A {

		// final void f1() {} // error cause cannot override final method

		final int a;

		B(int a) {// if final variable of a class is not initialized with a value when it was
					// declared then
					// you can only initialize it in the Constructor of the class
			this.a = a;
		}
	}
}

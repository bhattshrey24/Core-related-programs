package Abstraction;

public class Abstraction {
	// Must Watch
//https://www.youtube.com/watch?v=zZq_XDhU-rc 
	
	abstract class Phone {
		public abstract void features();
	}

	class Samsung extends Phone {

		@Override
		public void features() {
			System.out.println("Showing Features of Samsung");
		}

	}

	class nokia extends Phone {
		@Override
		public void features() {
			System.out.println("Showing Features of nokia");
		}
	}

	class Customer {
		
//		public void showingDifferentPhone(Samsung ob) {// this function show's user functions/features of different company phones
//
//		}
//
//		public void showingDifferentPhone(Nokia ob) {// so instead of making different function for every other company simply make pointer of object to parent class like I have done below:-
//
//		}

		public void showingDifferentPhone(Phone ob) {// now observe implementation of the "features" function is in
														// nokia
														// and samsung class and not in "phone" class and we are only
														// using "phone" class pointer to access the functionality of
														// "feature" function thus hiding the implementation of
														// "feature function" . So abstraction is achieved

		}
	}

	public static void main(String[] args) {
		Abstraction ob2 = new Abstraction();

		// Abst ob = new Abst();// cannot instantiate abstract class , i.e. cannot make
		// object of it

		Abstraction.B ob = ob2.new B();// this is how we create object of inner class

		ob.f2();

	}

	public abstract class Abst {
		public void f1() {// can make non abstract function in abstract class too

		}

		public abstract void f2();// observe abstract methods have no body also a ";"
	}

	public class B extends Abst {
		@Override
		public void f2() {
			System.out.print("Inside B , body of F2 function");
		}
	}

	public abstract class C extends Abst {// if you dont want to override abstract function in child class simply make
											// child class also abstract

		public void f1() {
			System.out.println("Inside C");
		}

	}


}

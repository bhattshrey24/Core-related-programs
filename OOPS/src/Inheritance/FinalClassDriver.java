package Inheritance;

import Inheritance.FinalClassDriver.B;
//A final class is a class that can't be extended. 
//Also methods could be declared as final to indicate that cannot be overridden by subclasses.

//Preventing the class from being subclassed could be particularly
//useful if you write APIs or libraries and want to avoid being extended 
//to alter base behaviour
public class FinalClassDriver {

	public static void main(String[] args) {
		FinalClassDriver obj = new FinalClassDriver();

		FinalClassDriver.B ob = obj.new B();// this is how we use inner class ,explained in depth in "InnerClass" class
		ob.display();
	}

	// public class A extends FinalClass{}// will give error since finalClass is
	// final and cannot be inherited

	public class A {
		public void f1() {
			System.out.println("This is non final function");
		}

		public final void f2() {
			System.out.println("This is final function");
		}
	}

	public class B extends A {
		public void display() {
			f1();
			f2();
		}

		// public void f2(){}// will give error cause cannot override final method , f2
		// is final method of parent class i.e A so B cannot override it

	}

}

package Inheritance;

//A final class is a class that can't be extended. 
//Also methods could be declared as final to indicate that cannot be overridden by subclasses.

//Preventing the class from being subclassed could be particularly
//useful if you write APIs or libraries and want to avoid being extended 
//to alter base behaviour
public class FinalClass {
	public final class A {}
	public  class B extends A{}
	public void f1() {

	}

	public final void f2() {

	}


}

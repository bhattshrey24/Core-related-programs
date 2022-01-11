package Inheritance;

public class B extends A {

	// int d = a;// will give error cause first it find a in same class and it found
	// a in same
	// class but its used first and then declared which is illegal , even though "a"
	// was in parent class too still instead of using it the compiler is thinking
	// that we are using a before declaring it
	public int a = 20;
	
	int d = c;// this c is of parent
	
	// public int c = 10;

	// Important

	// if there's just one constructor whether it is default or with parameter , if
	// we make it private then we cant make object of the class but if there's more
	// than one constuctor our default constuctor is public or "default" and other
	// constructors is private then we CAN make object of the class eg:

	public B() {// default constuctor with default access specifier , we have to make it explicilty public/ default otherwise it will act as private if the other one is private 

	}

	private B(int a) {// this is private still we can make object of class B since default constuctor
						// is public

	}

}

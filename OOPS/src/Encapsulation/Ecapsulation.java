package Encapsulation;

// implementing encapsulation in java:
//Make the instance variables private so that they cannot be accessed directly from outside the class.
//You can only set and get values of these variables through the methods of the class.
//Have getter and setter methods in the class to set and get the values of the fields.

public class Ecapsulation {
	public class A {
		private int data;

		public boolean checkToken(String token) {
			// logic for checking token and return whether its valid or not
			return true;
		}

		public int getData(String token) {// getter for "data"
			boolean isValid = checkToken(token);
			if (isValid) {
				return data;// this way we can protect our data using getters and setter hence data is
							// encapsulated
			} else {
				return 0;// means user not authenticated
			}
		}

	}

	public static void main(String[] args) {

	}

	// DIFFERENCE BETWEEN Encapsulation and Abstraction
	
	// Encapsulation is a way to achieve "information hiding" so, following your
	// example, you don't "need to know the internal working of the mobile phone to
	// operate" with it. You have an interface to use the device behaviour without
	// knowing implementation details.

	// Abstraction on the other side, can be explained as the capability to use the
	// same interface for different objects. Different implementations of the same
	// interface can exist. Details are hidden by encapsulation.
}

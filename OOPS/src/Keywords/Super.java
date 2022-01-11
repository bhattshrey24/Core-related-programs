package Keywords;
//The super keyword in Java is a reference variable which is used to refer immediate parent class object.

//Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

//There are 3 uses of Super keyword
public class Super {

	public static void main(String[] args) {
	}

	class Animal {// 1) super is used to refer immediate parent class instance "variable".
		String color = "white";
	}

	class Dog extends Animal {
		String color = "black";

		void printColor() {
			System.out.println(color);// prints color of Dog class
			System.out.println(super.color);// prints color of Animal class
		}
	}

	class Animal2 {// 2) super can be used to invoke parent class method

		void eat() {
			System.out.println("eating...");
		}
	}

	class Dog2 extends Animal2 {
		void eat() {
			System.out.println("eating bread...");
		}

		void bark() {
			System.out.println("barking...");
		}

		void work() {
			super.eat();// calling Animal2 ka eat method
			bark();
		}
	}

	class Animal3 {// 3) super is used to invoke parent class constructor.
		Animal3() {
			System.out.println("animal is created");
		}

		Animal3(int leg) {
			System.out.println("animal is created with " + leg + " legs");
		}

	}

	class Dog3 extends Animal3 {
		Dog3() {
			super();// if you don't use it then compiler will call it implicitly
			// super(3); will give error cause we can call only 1 constructor
			System.out.println("dog is created");
		
		}
	}


}

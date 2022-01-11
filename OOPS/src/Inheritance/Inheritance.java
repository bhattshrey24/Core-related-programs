package Inheritance;

// public<protected<default<private this is order of restrictiveness , The default modifier is more restrictive than protected
public class Inheritance {

	public static void main(String[] args) {
		// accessing child's 'a'
		B obj = new B();
		System.out.println(obj.a);
		// accessing parents a
		A obj2 = new A();
		System.out.println(obj.a);
		// obj2.c;// error since pointer is of parent therefore only properties and
		// methods of parents are accessible

		// obj.b// error cause private members are not actually inherited

		obj.f1();// observe we can even call protected member of our parent class outside i.e
					// once they are inherited they become default i guess

		// IMPORTANT
		// If you are overriding any method, overridden method (i.e. declared in
		// subclass i.e derived class or child class) must not be more restrictive
		// otherwise it will give compile time error
		


	}



}

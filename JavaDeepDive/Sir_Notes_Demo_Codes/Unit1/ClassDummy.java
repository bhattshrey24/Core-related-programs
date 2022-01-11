package Unit1;

import java.lang.reflect.*;

public class ClassDummy {
	
	{
		System.out.println("This is instance block , it is called while object is being created");
	}

	static {

		System.out.println("This is static block , it is before object is created , i.e. when class is being loaded");

	}

	public static void main(String[] args) throws ClassNotFoundException {
		int count = 0;
		Class c = Class.forName("Student");
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
	}

	public class Student {

		public String getname() {
			return null;
		}

		public int getRollNo() {
			return 10;
		}

	}

}

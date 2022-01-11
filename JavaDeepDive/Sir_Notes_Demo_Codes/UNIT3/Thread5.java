package UNIT3;

public class Thread5 {

	synchronized public void f1() {// synchronized method, object lock here is given by jvm and handled by jvm
									// itself you dont have to do anything ,this function can be executed by only 1
									// thread at a time

	}

	synchronized public void f2() {// synchronized method

	}

	public void f3() {// non synchronized method , can be executed my multiple thread

	}

	static synchronized public void f4() {// synchronized method , class level lock handels this since its static , JVM handles class level lock too , you dont have to do anything

	}

	public void f5() {// non synchronized method , but has synchornized block
		synchronized (this) {// this synchronized block and not method , here we have to explicitly provide object to get its object lock , "this" means we are passing the object which called this method 

		}
		Thread5 ob = new Thread5();
		synchronized (ob) {// now this synchronized have object lock of object "ob"
		}
		
		synchronized (Thread5.class) {//this gives the class level lock ,Thread5.class is equivalent to "this" 
		}
	}

	public static void main(String[] args) {

	}

}

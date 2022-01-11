package UNIT3;

public class Thread4 extends Thread {


	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // Name of main thread

		Thread4 t = new Thread4();
		System.out.println(t.getName()); // Thread-0 , i.e. initial name given by JVM to my thread
		Thread.currentThread().setName("CSE");// giving name to the thread i created
		System.out.println(Thread.currentThread().getName());
		// Thread.currentThread() method gives current executing Thread object's
		// reference(i.e. pointer to that object)
		
	}

}

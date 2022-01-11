package UNIT3;

public class Thread2 implements Runnable {// see no extend Thread class
//Method 2 (using Runnable )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 r = new Thread2();
		Thread t = new Thread(r); // here r is a object of my thread class
		t.start();
		for (int i = 0; i < 150; i++) {
			System.out.println("main thread");
		}
	}

	@Override
	public void run() {// this is run method of thread class which is basically run method of runnable class only since thread class also implements runnable interface
		// TODO Auto-generated method stub
		for (int i = 0; i < 15; i++) {
			System.out.println("child Threaddddddddddddd");
		}
	}

}

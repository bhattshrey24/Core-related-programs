package UNIT3;

public class Thread3 implements Runnable {
	public void f1(Thread th) {
		th.start();// this is starting the thread , i.e calling the "run" method
	}


	public static void main(String[] args) {
		Thread3 t = new Thread3();
		Thread th = new Thread(t);
		t.f1(th);
	}

	@Override
	public void run() {
  System.out.println("Inside run");
	}

}

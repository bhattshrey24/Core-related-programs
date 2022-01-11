package UNIT3;

public class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running... ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread without nameeeeeeeeeeee " + i);
		}
		super.run();
	}

	public void run(String name) {
		System.out.println("Thread is running... ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread with name " + name + " " + i);
		}
		super.run();// observe here also im calling run method of parent
	}

	public void Myrun(String name) {// this is a normal method of class Thread1 and not actual run method , observe
									// here i'm not calling run method of parent
		System.out.println("Thread is running... ");
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
		super.run();// observe here also im calling run method of parent
	}

	public static void main(String[] args) {// this main is executing on "Main thread" , while "Thread1" is executing on
											// different thread
		Thread1 t1 = new Thread1();
		t1.start();

		t1.run("Shrey");//// normal method of "Thread1" class , wont be executed
		// asynchoronously, it will
		// be
		// executed by main thread only , and no new thread will be created for it 

		t1.Myrun("YOOOOOOOOOOOOO");// normal method of "Thread1" class , wont be executed asynchoronously, it will
									// be
									// executed by main thread only , and no new thread will be created for it

		for (int i = 0; i < 150; i++) {
			System.out.println("main thread");// observe beech beech mein my thread bhi execute hora fir execution wapis
												// main thread pr aara
		}
	}

}

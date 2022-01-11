package UNIT3;

public class Thread6 {
	synchronized void f1(Thread6 ob) throws InterruptedException {// see we called wait() inside synchronized cause otherwise it will give exception , you can only call wait , notify and notify all inside synchronoized block or method cause these methods needs object lock
		ob.wait();// see wait() is not Thread class method but "Object" class method
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread6 ob = new Thread6();
		ob.f1(ob);
	}

}

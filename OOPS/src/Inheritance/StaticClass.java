package Inheritance;

public class StaticClass {

	 static int s=100;
	 int ns=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	}

	public static class S {
		int a = 10;
		static int b = 20;

		public void f1() {
        System.out.print(s);// can only call static members or functions of other class
        
        //System.out.print(ns);// will give error since ns is not static

        f2();// can only call static members or functions of its own class
		}

		public static void f2() {
	        System.out.print(s);
	        //f1();// error since f1() is not static;
		}
	}

}

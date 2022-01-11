package Keywords;

//In Java, static keyword is mainly used for memory management.
//It can be used with variables, methods, blocks and nested classes.

// 1)with variable and Method
public class Static1 {
	
// static functions are used to do operations on static variables only
	
	public static void main(String[] args) {
		Static1 ob = new Static1();
		int a = ob.nonStaticA;
		
		// properties
		int c = ob.staticA;
		int d = Static1.staticA;
		// methods
		ob.staticF1();
		Static1.staticF1();
	}

	int nonStaticA;
	static int staticA;

	public void f1() {
		int ans = nonStaticA;
		staticF1();// can call static function in non static function of same class without name
					// also
		Static1.staticF1();// can call static function in non static function of same class with name also

		int ans2 = staticA;// same with static member/properties too
		int ans3 = Static1.staticA;

	}

	public static void staticF1() {
		// int ans = nonStaticA;// error can't access non static variables of same class
		// in static
		// function of same class
		// f1(); // can't call non static function of same class in static function of
		// same class
		int ans = Static1.staticA;
	}

}

package Keywords;

public class Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class staticOuter {
		static int staticA;
		int nonStaticA;

		void f1() {
			
			staticOuter.innerStaticClass.innerStaticStaticF1();// called static inner classe's static function without
																// object
			
			// making inner class object in outer class
			innerStaticClass ob2 = new innerStaticClass();
			staticOuter.innerStaticClass ob3 = new staticOuter.innerStaticClass();
		}

		static void staticF1() {
			innerStaticClass ob2 = new innerStaticClass();
			staticOuter.innerStaticClass ob3 = new staticOuter.innerStaticClass();

		}

		public static class innerStaticClass {
			void innerStaticF1() {
             // int ans= nonStaticA;// error cause inner static class cannot access non static variable,method of outer class inside static inner class
             
				int ans2 =staticA;// inner static class can only access static variable ,method of outer class
			}

			static void innerStaticStaticF1() {
	             int ans2 =staticA;
			}
		}

	}
}

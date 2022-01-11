package Keywords;
//Let's prove that this keyword refers to the current class instance variable. In this program, we are printing the reference variable and this, output of both variables are same.

public class This2 {
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String[] args) {
		This2 obj = new This2();
		System.out.println(obj);// prints the reference ID
		obj.m();
		System.out.println();
		System.out.println("let see again");
		System.out.println();
		This2 obj2 = new This2();
		System.out.println(obj2);// prints the reference ID
		obj2.m();
	}
// observe when you print observe both will print will give same address of object
}

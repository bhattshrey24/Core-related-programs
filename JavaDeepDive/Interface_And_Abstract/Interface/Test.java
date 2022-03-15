package Interface;

public class Test {

	public static void main(String[] args) {
		Test ob = new Test();
		ob.Initialize(new DB_implemen_2());// See If I created a new Implementation I just have to change this
													// line ie. pass object of the new Implementation here 
	
	}
	

	void Initialize(DB_Interface db) {
		System.out.println(db.bestEmployee());
		System.out.println(db.mostSalary());
		System.out.println(db.updateDB("Select * blah blah blah"));
		System.out.println("Name of the app is :  "+ db.appName);// this "appName" is a variable of DB_Interface
	}
}

package AssocaiationAggregationComposition;
// these are asked a lot by interviewers

//Association is relation between two separate classes which establishes through their Objects.
//Association can be one-to-one, one-to-many, many-to-one, many-to-many.
//In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object.

public class Association {

	public static void main(String[] args) {
		Association ob = new Association();
		Association.Bank bank = ob.new Bank("Axis");
		Association.Employee emp = ob.new Employee("Neha");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());// observe here we connected
																							// both bank and employee

		// using there objects

		// this is an example of "many to one" example of association since a bank can
		// have many employees , similarly u can create many to one , one to one etc
	}

	class Bank {
		private String name;

		// bank name
		Bank(String name) {
			this.name = name;
		}

		public String getBankName() {
			return this.name;
		}
	}

	// employee class
	class Employee {
		private String name;

		// employee name
		Employee(String name) {
			this.name = name;
		}

		public String getEmployeeName() {
			return this.name;
		}
	}

}

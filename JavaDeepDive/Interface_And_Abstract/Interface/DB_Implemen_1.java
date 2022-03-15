package Interface;

public class DB_Implemen_1 implements DB_Interface {

	@Override
	public int mostSalary() {
		// Add Implementation here that searches in he DB
		return 100000;
	}

	@Override
	public String bestEmployee() {
		// Add Implementation here
		return "Shrey";
	}

	@Override
	public boolean updateDB(String Query) {
		// Add implementation based on the DB that DB_implementation_1 uses SQlite or
		// some web server etc.
		return true;
	}

}

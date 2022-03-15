package Interface;

public class DB_implemen_2 implements DB_Interface {

	@Override
	public int mostSalary() {
// Add the implementation
		return 50000;
	}

	@Override
	public String bestEmployee() {
		// Add the implementation
		return "Prasoon";
	}

	@Override
	public boolean updateDB(String Query) {
// Add implementation based on the DB that DB_implementation_2 uses
		return true;
	}

}

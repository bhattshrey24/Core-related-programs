package Interface;

public interface DB_Interface {
	String appName="Dummy App";// see we can even have properties in interfaces
	
	int mostSalary();// Searches the DB and returns the highest salary given to a person

	String bestEmployee();// Searches in Db and give the best Employee

	boolean updateDB(String Query);// returns whether DB is updated Successfully or not
}

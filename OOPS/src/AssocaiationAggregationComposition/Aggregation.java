package AssocaiationAggregationComposition;

import java.util.ArrayList;
import java.util.List;

//It is a special form of Association where
//It represents Has-A relationship.
//In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity , like student and school can exist independently
public class Aggregation {

	public static void main(String[] args) {
		Aggregation ob = new Aggregation();
		Aggregation.Student s1 = ob.new Student("Mia", 1, "CSE");
		Aggregation.Student s2 = ob.new Student("Priya", 2, "CSE");
		Aggregation.Student s3 = ob.new Student("John", 1, "EE");
		Aggregation.Student s4 = ob.new Student("Rahul", 2, "EE");

		// making a List of
		// CSE Students.
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);

		// making a List of
		// EE Students
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(s3);
		ee_students.add(s4);

		Aggregation.Department CSE = ob.new Department("CSE", cse_students);
		Aggregation.Department EE = ob.new Department("EE", ee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

		// creating an instance of Institute.
		Aggregation.Institute institute = ob.new Institute("BITS", departments);

		System.out.print("Total students in institute: ");
		System.out.print(institute.getTotalStudentsInInstitute());
	}

	class Student {
		String name;
		int id;
		String dept;

		Student(String name, int id, String dept) {

			this.name = name;
			this.id = id;
			this.dept = dept;

		}
	}

	/*
	 * Department class contains list of student Objects. It is associated with
	 * student class through its Object(s).
	 */
	class Department {

		String name;
		private List<Student> students;

		Department(String name, List<Student> students) {

			this.name = name;
			this.students = students;

		}

		public List<Student> getStudents() {
			return students;
		}
	}

	/*
	 * Institute class contains list of Department Objects. It is asoociated with
	 * Department class through its Object(s).
	 */
	class Institute {

		String instituteName;
		private List<Department> departments;

		Institute(String instituteName, List<Department> departments) {
			this.instituteName = instituteName;
			this.departments = departments;
		}

		// count total students of all departments
		// in a given institute
		public int getTotalStudentsInInstitute() {
			int noOfStudents = 0;
			List<Student> students;
			for (Department dept : departments) {
				students = dept.getStudents();
				for (Student s : students) {
					noOfStudents++;
				}
			}
			return noOfStudents;
		}

	}
	// In this example, there is an Institute which has no. of departments like CSE,
	// EE. Every department has no. of students. So, we make a Institute class which
	// has a reference to Object or no. of Objects (i.e. List of Objects) of the
	// Department class. That means Institute class is associated with Department
	// class through its Object(s). And Department class has also a reference to
	// Object or Objects (i.e. List of Objects) of Student class means it is
	// associated with Student class through its Object(s).
//It represents a Has-A relationship.  
}

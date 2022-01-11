package Inheritance;
// must watch video on this page https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim

//Shallow Copy

//The default implementation of the clone method creates a shallow copy of the source object, 
//it means a new instance of type Object is created, it copies all the fields to a new instance 
//and returns a new object of type ‘Object’. This Object explicitly needs to be typecast in object
//type of source object.

//This object will have an exact copy of all the fields of source object including the primitive 
//type and object references. If the source object contains any references to other objects in field
//then in the new instance will have only references to those objects, a copy of those objects is not
//created. This means if we make changes in shallow copy then changes will get reflected in the source object. Both instances are not independent.

// Demo ob2= ob1;  is not shallow copy cause here ob2 pointer will point to same object where ob1 is pointing , here also if we do changes in ob2 it will reflect in ob1 but its not correct shallow copy cause new object is not created , in shallow; new object is created and properties of ob1 will be copied to ob2 using "cloneable"


//There are 2 ways to implement shallow and deep copy , using copy constructor and using cloneable internface 

//Using copy constructor

//SHALLOW COPY

//public class A {
//	private Name name; // observe this is object of class Name  
//	private Address add; // observe this is object of class Address
//
//	public A(A obj) {// Copy constructor
//		this.name = obj.name;// here "name" is the pointer referencing/pointing to the object "name" of object "obj" , so any change done using name of this new object will reflect back to object "obj"
//		this.add = obj.add;
//	}
//}

//public class Name {
//private String name;
//
//Name(String name) {
//	this.name = name;
//}
//}
//

//public class Address {
//private String address;
//
//Address(String address) {
//	this.address = address;
//}
//}

//DEEP COPY

//public class A {
//	private Name name; // observe this is object of class Name
//	private Address add; // observe this is object of class Address
//
//	public A(A obj) {
//		this.name = new Name(obj.name);// here we are creating a new object and "name" will point to that object hence any change in "name"  of new object  will not affect name of object "obj"
//		this.add = new Address(obj.add);
//	}
//}
//




//Using Cloneable

// SHALLOW COPY

//class Department {
//    String empId;
// 
//    String grade;
// 
//    String designation;
// 
//    public Department(String empId, String grade, String designation) {
//        this.empId = empId;
// 
//        this.grade = grade;
// 
//        this.designation = designation;
//    }
//}
// 
//class Employee implements Cloneable {// observe we have to implement Cloneable
//    int id;
// 
//    String name;
// 
//    Department dept;
// 
//    public Employee(int id, String name, Department dept) {
//        this.id = id;
// 
//        this.name = name;
// 
//        this.dept = dept;
//    }
// 
//    // Default version of clone() method. It creates shallow copy of an object.
// 
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
// 
//public class ShallowCopyInJava {
// 
//    public static void main(String[] args) {
// 
//        Department dept1 = new Department ("1", "A", "AVP");
// 
//        Employee emp1 = new Employee (111, "John", dept1);
// 
//        Employee emp2 = null;
// 
//        try {
//            // Creating a clone of emp1 and assigning it to emp2
// 
//            emp2 = (Employee) emp1.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
// 
//        // Printing the designation of 'emp1'
// 
//        System.out.println(emp1.dept.designation); // Output : AVP
// 
//        // Changing the designation of 'emp2'
// 
//        emp2.dept.designation = "Director";// observe we are doing changes in emp2 but it will also reflect in emp1
// 
//        // This change will be reflected in original Employee 'emp1'
// 
//        System.out.println(emp1.dept.designation); // Output : Director
//    }
//}

//DEEP COPY

//The deep copy of an object will have an exact copy of all the fields of source object like a shallow copy, but unlike sallow copy if the source object has any reference to object as fields, then a replica of the object is created by calling clone method. This means that both source and destination objects are independent of each other. Any change made in the cloned object will not impact the source object.

//class Department implements Cloneable{// Observe here department is also cloneable
//    String empId;
// 
//    String grade;
// 
//    String designation;
// 
//    public Department(String empId, String grade, String designation) {
//        this.empId = empId;
// 
//        this.grade = grade;
// 
//        this.designation = designation;
//    }
//    //Default version of clone() method.
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
// 
//class Employee implements Cloneable {
//    int id;
// 
//    String name;
// 
//    Department dept;
// 
//    public Employee(int id, String name, Department dept) {
//        this.id = id;
// 
//        this.name = name;
// 
//        this.dept = dept;
//    }
// 
//    // Overriding clone() method to create a deep copy of an object.
// 
//    protected Object clone() throws CloneNotSupportedException { // this was not done in Shallow copy example
//        Employee emp = (Employee) super.clone();
// 
//        emp.dept = (Department) dept.clone();
// 
//        return emp;
//    }
//}
// 
//public class DeepCopyInJava {
//    public static void main(String[] args) {
//        Department dept1 = new Department("1", "A", "AVP");
// 
//        Employee emp1 = new Employee(111, "John", dept1);
// 
//        Employee emp2 = null;
// 
//        try {
//            // Creating a clone of emp1 and assigning it to emp2
// 
//            emp2 = (Employee) emp1.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
// 
//        // Printing the designation of 'emp1'
// 
//        System.out.println(emp1.dept.designation); // Output : AVP
// 
//        // Changing the designation of 'emp2'
// 
//        emp2.dept.designation = "Director";
// 
//        // This change will be reflected in original Employee 'emp1'
// 
//        System.out.println(emp1.dept.designation); // Output : AVP
//    }
//}

public class ShallowAndDeepCopy {

}

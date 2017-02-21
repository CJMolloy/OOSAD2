package Classes;

public class Employee {

	SalaryCalculator empType;
	String name;

	public Employee(String e, SalaryCalculator c){
		name = e;
		empType = c;
	}




	public void display() {
		// TODO - implement Employee.display
		throw new UnsupportedOperationException();
		System.out.println("Name : " + name);
		System.out.println("Salary : " + empType.getSalary());
	}

}

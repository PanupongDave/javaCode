class Employee{
	String emp_id;
	double emp_salary;
	public Employee(){
		emp_id = "PE105";
	}
	public Employee(double s){
		emp_salary = s;
	}
}

public class OverloadTest{
	public static void main(String[] args){
		double data = 20000;
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(data);
		System.out.println("======= Overload Test =======");
		System.out.println("Employee ID = "+ emp1.emp_id +
			"\nSalary = " + emp2.emp_salary);
		System.out.println("==============================");
	}
}
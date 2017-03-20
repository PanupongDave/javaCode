class Employee{
	String emp_id;
	double emp_salary;
	public Employee(){
		emp_id = "PE1105";
	}
	public Employee(String n){
		emp_id = n;
	}
	public Employee(double s){
		this("PE1000");
		emp_salary = s;
	}
}

public class ThisTest{
	public static void main(String[] args){
		double data = 30000;
		Employee emp = new Employee(data);
		System.out.println("======== This Test =========");
		System.out.println("Employee ID = " + emp.emp_id +
			"\nSalary = "+ emp.emp_salary);
		System.out.println("=============================");
	}
}
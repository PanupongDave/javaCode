class Employee{
	public double emp_salary;
	public Employee(){
		emp_salary = 10000;
	}
}

public class DefaultConstructorTest{
	public static void main(String[] args){
		String emp_id = "PE1005";
		Employee emp = new Employee();
		System.out.println("== Defult Constructor ====");
		System.out.println("Employee ID = "+ emp_id +
			"\nSalary = " + emp.emp_salary);
		System.out.println("============================");
	}
}
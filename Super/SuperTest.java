class Employee{
	String emp_id;
	double emp_salary;
	public Employee (){
		emp_id = "PE1105";
	}
	public Employee(String n){
		emp_id = n;
	}
}
class EmployeeSa1 extends Employee{
	public EmployeeSa1(double s){
		super("PE1000");
		emp_salary = s;
	}
}

public class SuperTest{
	public static void main(String[] args){
		double data = 40000;
		EmployeeSa1 emp = new EmployeeSa1(data);
		System.out.println("========= SuperTest=========");
		System.out.println("Employee ID = " + emp.emp_id);
		System.out.println("Salary = "+emp.emp_salary);
		System.out.println("============================");
	}
}
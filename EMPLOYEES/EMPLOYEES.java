import javax.swing.JOptionPane;

class employee_salary{
	float setsalary(int t1){
		float salary = 0;
		if(t1==0)
			salary = 10000;
		if(t1==9)
			salary = 20000;
		return salary;
	}

	String setsalary(String t2){
		String salary ="";
		if(t2.equals("A"))
			salary = "$750";
		if(t2.equals("B"))
			salary = "$500";
		return salary;
	}
}

public class EMPLOYEES{
	public static void main(String[] args){
		String data;
		data=JOptionPane.showInputDialog("Enter Employee Type (1 or 2)");
		int n = new Integer(data);
		employee_salary emp = new employee_salary();
		switch(n){
			case 1:
				data=JOptionPane.showInputDialog("Enter Employee level (0 or 9)");
				float s1 = emp.setsalary(new Integer(data));
				JOptionPane.showMessageDialog(null,"Salary = " + s1 + " TH Baht");
				break;
			case 2:
				data=JOptionPane.showInputDialog("Enter Employee Grade(A or B)");
				String s2 = emp.setsalary(data);
				JOptionPane.showMessageDialog(null,"Salary = "+s2+" US Dollar");
				break;
			default :
				JOptionPane.showMessageDialog(null,"Invalid Employee Type");
		}
	}
}
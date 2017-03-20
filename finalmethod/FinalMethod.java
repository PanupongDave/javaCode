import java.util.Scanner;

class employee{
	float rate = 300.0f, work=10.0f;
	int hour;
	final float calOT(){
		return hour*rate/work;
	}
}

class daily_emp extends employee{

}
class monthly_emp extends employee{
	float calmOT(float bonus){
		float pay = hour*rate/work;
		if(hour>100)
			pay += bonus;
		return pay;
	}
}

public class FinalMethod{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		employee emp1 = new employee();
		System.out.print("Enter total OT hour : ");
		emp1.hour = scan.nextInt();
		System.out.println("\"Employee\"\nTotal OT Pay = (" + emp1.rate +
			" * " + emp1.hour + ") = " + emp1.calOT() + " BAHT");

		daily_emp emp2 = new daily_emp();
		emp2.hour = emp1.hour;
		System.out.print("\"Daily Employee\"\nRate per Day = ");
		emp2.rate = scan.nextFloat();
		System.out.println("Total OT Pay = (" + emp2.rate + " * " +
			emp2.hour + ") = " + emp2.calOT()+ " BAHT");
		monthly_emp emp3 = new monthly_emp();
		emp3.hour = emp1.hour;
		System.out.print("\"Monthly Employee\"\nEnter Salary = ");
		emp3.rate = scan.nextFloat();
		emp3.rate = emp3.rate/30;
		System.out.print("Enter Bonus = ");
		int b = scan.nextInt();
		System.out.println("Total OT Pay = (" + emp3.rate+ " * "+
			emp3.hour+ ") + " + b + " = " + emp3.calmOT(b) + " BAHT");
	}
}
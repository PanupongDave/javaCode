import java.util.Scanner;

public class Bonus1{
	public static void main(String[] args){
		Bonus_Calculator bonus = new Bonus_Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.print("inputSalary>>>>");
		float salary = scan.nextFloat();
		
		float result = bonus.calBonus(salary);
		System.out.println("Bonus = "+ result +"Bath");
	}
}
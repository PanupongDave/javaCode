import java.util.Scanner;

public class Bonus{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Your Salary>>> ");
		float salary = scan.nextFloat();
		float bonus = 0.05f*salary;
		System.out.println("Bonus is " + bonus + "Bath");

	}
}
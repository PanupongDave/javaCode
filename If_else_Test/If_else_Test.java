import java.util.Scanner;

public class If_else_Test{
	public static void main(String[] args){
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age >>>> ");
		age = scan.nextInt();
		if(age>60)
			System.out.println("Retired");
		else
			System.out.println("Not Retired");
	}
}
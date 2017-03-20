import java.util.Scanner;

public class If_else_Test1{
	public static void main(String[] args){
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age>>> ");
		age = scan.nextInt();
		ifelseTest_Condition ifelsetest =
			new ifelseTest_Condition();
		boolean result = ifelsetest.checkRetired(age);
		if(result)
			System.out.println("Retired");
		else
			System.out.println("Not Retired");
	}
}
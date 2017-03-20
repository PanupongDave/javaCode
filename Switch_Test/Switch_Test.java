import java.util.Scanner;

public class Switch_Test{
	public static void main(String[] args){
		System.out.println("Main menu");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");

		System.out.print("Press 1,2,3, or 4 >>>> ");
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		System.out.print("enter first number >>> ");
		float a = scan.nextFloat();
		System.out.print("enter second number >>> ");
		float b = scan.nextFloat();

		switch(key){
			case 1:
				System.out.println("result of " + a + "+"+ b+ " = "+ (a+b));
				break;
			case 2:
				System.out.println("result of " + a + "-"+ b+ " = "+ (a-b));
				break;
			case 3:
				System.out.println("result of " + a + "*"+ b+ " = "+ (a*b));
				break;
			case 4:
				System.out.println("result of " + a + "/"+ b+ " = "+ (a/b));
				break;
		}
		System.out.println("Good Bye !!!");
	}
}
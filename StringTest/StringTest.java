import java.util.Scanner;
public class StringTest{
	public static void main(String[] args){
		String msg1 = "J";
		System.out.print("Enter msg2 = ");
		Scanner scan = new Scanner(System.in);
		String msg2 = scan.nextLine();
		System.out.print("msg1 - "+ msg1);
		System.out.println(" and msg2 = "+ msg2);
		if(msg1 == msg2)
			System.out.println("msg1 == msg2");
		else
			System.out.println("msg1 != msg2");
		msg1 = msg2;
		System.out.print("msg1 = "+msg1);
		System.out.println(" and msg2 = "+msg2);
		if(msg1 == msg2)
			System.out.println("msg1 == msg2");
		else
			System.out.println("msg1 != msg2");
	}
}
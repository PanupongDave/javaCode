import java.util.Scanner;
public class DivideOp{
	public static void main(String[] args){
		int firstInt,secondInt,resultInt,resultMod;
		float number,resultFloat;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first Integer : ");
		firstInt = scan.nextInt();
		System.out.print("Enter second Integer : ");
		secondInt = scan.nextInt();
		resultInt = firstInt/secondInt;
		System.out.println(firstInt + "/" + secondInt + "=" + resultInt);
		resultMod = firstInt%secondInt;
		System.out.println(firstInt + "%" + secondInt + "=" + resultMod);
		System.out.println("*** Convert first Integer to float ****");
		number = (float) firstInt;
		resultFloat = number/secondInt;
		System.out.println(number + "/" + secondInt + "=" + resultFloat);

	}
}
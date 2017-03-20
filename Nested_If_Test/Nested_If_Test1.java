import java.util.Scanner;
public class Nested_If_Test1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Credit subject>>>> ");
		int x = scan.nextInt();
		System.out.print("Input Credit support Subject>>> ");
		int y = scan.nextInt();
		nestedifTest_Condition nestedif =
			new nestedifTest_Condition();
			nestedif.checkPass(x, y);
	}
}
import java.util.Scanner;

public class Do_While_Test{
	public static void main(String[] args){
		int num, sum=0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Enter number >>> ");
			num = scan.nextInt();

			if(num >= 0)
				sum += num;
		}while (num >= 0);
		System.out.println("Result is " + sum);
	}
}
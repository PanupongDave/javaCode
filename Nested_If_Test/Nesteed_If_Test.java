import java.util.Scanner;
public class Nesteed_If_Test{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Credit subject>>>> ");
		int x = scan.nextInt();
		System.out.print("Input Credit support Subject>>> ");
		int y = scan.nextInt();
		if( x >= 20 && y>= 30)
			System.out.println("Completed");
		else if(x < 20 && y< 30)
			System.out.print("You don't have subject "+ (20-x)+" Credit\n"
				+"and Support Subject "+(30-y)+ " Credit");
		else if(x<20)
			System.out.println("You don't have subject" + (20-x) + " Credit");
		else if(y<20)
			System.out.println("You don't have Support Subject" + (30-y)+ "Credit");

	}
}
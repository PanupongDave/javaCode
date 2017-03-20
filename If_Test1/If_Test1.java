import java.util.Scanner;

public class If_Test1{
	public static void main(String[] args){
		int key; float score,percent;
		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 to continue>>>> ");
		key = scan.nextInt();
		ifTest_Condition iftest = new ifTest_Condition();
		boolean result = iftest.checkValue(key);
		if(result){
			System.out.print("Enter Score>>>  ");
			score = scan.nextFloat();
			percent = score/30.0f*100;
			System.out.println("Your Score = "+ percent+"%");
		} 
		System.out.println("Good Bye !!!!");
	}
}
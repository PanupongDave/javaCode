import java.util.Scanner;

public class If_Test{
	public static void main(String[] args){
		int key; float score, percent;
		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 to continue >>> ");
		key = scan.nextInt();
		if(key == 1){
			System.out.print("Enter Score >>> ");
			score = scan.nextFloat();
			percent = score/30.0f*100;
			if(score <= 30){
			System.out.println("Your Score = "+ percent + "%");	
			}
			else{
				System.out.println("Score not true");
			}		
		}
		System.out.println("Good Bye !!!");
	}
}
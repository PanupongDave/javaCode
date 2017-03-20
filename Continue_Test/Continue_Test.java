import java.util.Scanner;

public class Continue_Test{
	public static void main(String[] args){
		int i = 1, score = 100;
		Scanner scan = new Scanner(System.in);
		while(i <= 5){
			System.out.print("Input Score Nisit"+ i +" >>> ");
			score = scan.nextInt();
			if((score > 100) || (score < 0)){
				System.out.println(score +
					"is False");
				continue;
			}
			System.out.println(score +
				" is True");
			i = i+1;
		}
	}
}
import java.util.Scanner;

public class For_Test_2{
	public static void main(String[] args){
		int N; float avg = 0.0f, sum = 0.0f,score;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of nisit >>>>");
		N = scan.nextInt();
		for(int i =0;i<N;i++){
			System.out.print("Score of Nisit"+(i+1)+" >>>> ");
			score = scan.nextFloat();
			sum = sum+score;
		} 
		avg = sum/N;
		System.out.println("Avg of Score = "+avg);
	}
}
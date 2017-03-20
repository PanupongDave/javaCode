import java.util.Scanner;
public class StudentScore{
	public static void main(String[] args){
		int [] scores;
		Scanner scan = new Scanner(System.in);
		scores = new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Score "+(i+1)+" : ");
			scores[i] = scan.nextInt();
		}
		MaxMinAvg test = new MaxMinAvg();
		int max = test.getmax(scores);
		int min = test.getmin(scores);
		float avg = test.getavg(scores);
		System.out.println("Min score is "+min
			+ "\n"+"max score is " + max +
			"\n" + "mean score is " + avg);
	}
}
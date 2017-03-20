import java.util.Scanner;
import java.util.ArrayList;

public class Score_By_Array_List{
	public static void main(String[] args){
		float score;
		ArrayList ScoreList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("score : ");
			score = scan.nextFloat();
			if(score >= 0)
				ScoreList.add(score);
		}while(score >= 0);

		for(int i=0;i<ScoreList.size();i++)
			System.out.println("score "+(i+1) + " - "+
				ScoreList.get(i));
	}
}
import java.util.Scanner;
public class AvgTemp{
	public static void main(String[] args){
		int i; 
		float[] temp;
		float sum = 0,
			  avg_temp;

		temp = new float[12];
		Scanner scan = new Scanner(System.in);
		for(i=0;i<12;i++){
			System.out.print("Temp["+(i+1)+"] = ");
			temp[i] = scan.nextFloat();
			sum = sum + temp[i];
		}
		avg_temp = sum/12;
		System.out.println("average temperature = "+ avg_temp);
	}
}
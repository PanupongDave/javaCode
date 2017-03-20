import java.util.Scanner;
public class ARRAY2D{
	public static void main(String[] args){
		int[][] num_std;
		int[] tfac;
		int i, j, total = 0;

		num_std = new int[2][4];
		tfac = new int[2];
		Scanner scan = new Scanner(System.in);

		for(i=0;i<2;i++){
			System.out.println("Enter total student in Faculty " + (i+1));
			tfac[i] =0;
			for(j=0;j<4;j++){
				System.out.print("year "+(j+1)+ " = ");
				num_std[i][j] = scan.nextInt();
				tfac[i] = tfac[i] + num_std[i][j];
			}
			total = total + tfac[i];
		}

		for(i=0;i<2;i++){
			System.out.print("===========================\n");
			for(j=0;j<4;j++){
				System.out.println("Student in year" + (j+1) + " = "+ num_std[i][j]);				
			}
			System.out.println("student in faculty " +(i+1)+ " = " +tfac[i]);
		}
		System.out.println("total students = " + total);
	}
}
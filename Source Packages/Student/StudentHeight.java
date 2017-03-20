import java.util.Scanner;
public class StudentHeight{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] height;
		height = new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Height " + (i+1+ " : "));
			height[i] = scan.nextInt();
		}
		MaxMinAvg std_height = new MaxMinAvg();
		float high = std_height.getavg(height);
		System.out.println("Average height is "+ high);
	}
}
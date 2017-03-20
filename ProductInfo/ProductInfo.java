import java.util.Scanner;
import java.util.Arrays;

public class ProductInfo{
	public String[] name;
	double[] price;
	int idx;
		public void setdata(){
			name = new String[5];
			price = new double[5];

			//name
			name[0] = "COKE";
			name[1] = "FANTA";
			name[2] = "MAMA";
			name[3] = "PEPSI";
			name[4] = "SPRITE";
			//price
			price[0] = 10.75;
			price[1] = 10.50;
			price[2] = 5.25;
			price[3] = 10.25;
			price[4] = 11.25; 
		}
		public void showdata(){
			System.out.printf("%-10s %10s\n","name","prize");
			System.out.printf("===================================\n");
			for(int i=0; i<5; i++)
				System.out.printf("%-10s %10.2f\n",name[i],price[i]);
			System.out.printf("===========================================\n");
		}
		public void getdata(){
			Scanner scan = new Scanner(System.in);
			do{
				System.out.print("Enter product name : ");
				String g = scan.nextLine();
				idx = Arrays.binarySearch(name,g);
				if(idx<0)
					System.out.println("This product name is not found");
			}while(idx < 0);
			System.out.println("This product units : ");
			int u = scan.nextInt();
			System.out.printf("===============================\n");
			System.out.println("your order is" +name[idx]+" "+u+" units = "
				+u+" * " +price[idx]+ " = " +u*price[idx]+" baht");
		}
}
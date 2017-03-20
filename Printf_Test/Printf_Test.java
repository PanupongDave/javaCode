public class Printf_Test{
	public static void main(String[] args){
		int i = 3277;
		double d = 1323240.25;
		System.out.printf("%-10s%5d\n","%5d",i);
		System.out.printf("%-10s%f\n","%f",d);
		System.out.printf("%-10s%16f\n","%16f",d);
		System.out.printf("%-10s%16.2f\n","%16.2f",d);
		System.out.printf("%-10s%,16.2f\n","%,16.2f",d);
	}
}
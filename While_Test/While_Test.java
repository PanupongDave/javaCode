public class While_Test{
	public static void main(String[] args){
		int count = 1, sum = 0;
		while (count <= 20){
			sum += count;
			count++;
		}
		System.out.println("Summation of 1 to 20 = " + sum);
	}
}
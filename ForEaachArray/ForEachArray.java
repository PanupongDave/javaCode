public class ForEachArray{
	public static void main(String[] args){
		double[] score = {18.5, 40.25, 30.75};
		System.out.println("======== Score Data ==========");
		for(double Arrays : score)
			System.out.printf("Score %.2f is %.1f%%\n"
				,Arrays,(Arrays/50*100));
		System.out.println("----------------------------------");
	}
}
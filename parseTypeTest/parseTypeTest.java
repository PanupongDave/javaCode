public class parseTypeTest{
	public static void main(String[] args){
		String a = "25", b = "25.125", c = "25.2525";
		System.out.printf("a = %s\n", a);
		int a1 = Integer.parseInt(a);
		System.out.printf("a1 = %d\n", a1);

		System.out.printf("b = %s\n", b);
		float b1 = Float.parseFloat(b);
		System.out.printf("b1 = %f\n", b1);

		System.out.printf("c = %s\n", c);
		double c1 = Double.parseDouble(c);
		System.out.printf("c1 = %f\n", c1); 
	}
}
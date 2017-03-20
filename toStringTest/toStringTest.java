public class toStringTest{
	public static void main(String[] args){
		int a=25; float b=25.25f; double c= 20.5d;
		System.out.printf("a = %d\n", a);
		String a1 = Integer.toString(a);
		System.out.printf("a1 = %s\n", a1);

		System.out.printf("b = %f\n", b);
		String b1 = Float.toString(b);
		System.out.printf("b1 = %s\n", b1);

		System.out.printf("c = %f\n", c);
		String c1 = Double.toString(c);
		System.out.printf("c1 = %s\n", c1);

	}
}
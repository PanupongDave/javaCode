public class ImplicitTest{
	public static void main(String[] args){
		float firstNo = 5;
		int secondNo = 0;
		System.out.println("firstNo = " + firstNo);
		System.out.println("secondNo = "+ secondNo);
		firstNo = secondNo;
		System.out.println("firstNo = "+ firstNo);
	}
}
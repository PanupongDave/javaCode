public class ExplicitTest{
	public static void main(String[] args){
		double tax1; 
		float vat1 = 0.07f;
		int pricel = 250;
		tax1 = (double)(vat1*pricel);
		System.out.println("TAX1 = " + tax1 + " BAHT");

		int tax2;
		float vat2 = 0.07f;
		double price2 = 250;
		tax2 = (int)(vat2 * price2);
		System.out.println("TAX2 = "+ tax2 + " BAHT"); 
	}
}
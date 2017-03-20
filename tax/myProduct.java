import java.util.Scanner;
public class myProduct{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Money: ");
		float money = scan.nextFloat();
		float total_vat = tax.calVat(money);
		float total_fuel = tax.calFuel(money);

		System.out.println("Money is " + money +
			" bath \nVat 7% is " + total_vat +
			" bath \nFuel is " + total_fuel +
			" bath \nSumVat is "+ (total_vat+total_fuel)+
			" bath" );
	}
}
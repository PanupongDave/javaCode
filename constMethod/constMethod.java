import java.util.Scanner;
public class constMethod{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Money: ");
		float money = scan.nextFloat();

		System.out.println("Bonus = " +
				new Bonus().myBonus +
				" baht");
		Bonus bonusobj = new Bonus();
		float moneyout = bonusobj.calBonus(money);
		System.out.println("Bonus = "+
				moneyout +
				" baht");
	}
}
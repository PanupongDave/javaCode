import java.util.Scanner;
class Bonus{
	public float calBonus(float s){
		return 0.05f*s;
	}
}

public class instMethod{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		Bonus bonus = new Bonus();
		System.out.print("Input Money : ");
		float moneyin = scan.nextFloat();

		float moneyout = bonus.calBonus(moneyin);


		System.out.println("Bonus = " +
				moneyout +
				" baht");
	}
}
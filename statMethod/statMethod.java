class Bonus{
	public static float calBonus(float s){
		return 0.05f*s;
	}
}

public class statMethod{
	public static void main(String[] args){
		System.out.println("Bonus = "+
			Bonus.calBonus(40000) +
			" baht");
	}
}
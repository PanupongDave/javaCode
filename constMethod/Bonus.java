public class Bonus{
	public float myBonus;
	public Bonus(){
		myBonus = 0;
	}
	public float calBonus(float s){
		myBonus = 0.5f*s;
		return myBonus;
	}
}
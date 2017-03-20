class wage{
	public float calWage(int h, float r){
		return (40*r) + calOt(h,r);
	}
	private float calOt(int h, float r){
		return (h-40)*(1.5f*r);
	}
}

public class WageMethod{
	public static void main(String[] args){
		wage emp_wage = new wage();
		float total = emp_wage.calWage(50,500f);
		System.out.println("Total Money = "+ total + " Bath.");
	}
}
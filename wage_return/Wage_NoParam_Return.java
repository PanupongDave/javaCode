class wage{
	public int h;
	public float r;
	public float calWage(){
		return (40*r)+(h-40)*(1.5f*r);
	}
}
public class Wage_NoParam_Return{
	public static void main(String[] args){
		wage emp_wage = new wage();
		emp_wage.h = 50;
		emp_wage.r = 300.0f;
		float total = emp_wage.calWage();
		System.out.println("Total Money = "+
			total + " Bath");
	}
}
class wage{
	public float calWage(int h,float r){
		return (40*r)+(h-40)*(1.5f*r);
	}
}
public class Wage_Param_Return{
	public static void main(String[] args){
		wage emp_wage = new wage();
		float total = emp_wage.calWage(50,400.f);
		System.out.println("Total Money = "+ total+ " Bath.");
	}
}
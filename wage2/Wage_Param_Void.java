class wage{
	public void calWage(int h, float r){
		float total = (40*r)+(h-40)*(1.5f*r);
		System.out.println("Total Money = " +
				total + " Bath");
	}
}
public class Wage_Param_Void{
	public static void main(String[] args){
		wage emp_wage = new wage();
		emp_wage.calWage(50,200.0f);
	}
}
class wage{
	public int h;
	public float r;
	public void calWage(){
		float total=(40*r)+(h-40)*(1.5f*r);
		System.out.println("Sum Money = " +
				total + " Bath");
	}
}
public class Wage_NoParam_Void{
	public static void main(String[] args){
		wage emp_wage = new wage();
		emp_wage.h = 50;
		emp_wage.r = 100.0f;
		emp_wage.calWage();
	}
}
public class nestedifTest_Condition{
	public void checkPass(int a, int b){
		if( a >= 20 && b >= 30)
			System.out.println("Completed");
		else if(a < 20 && b < 30)
			System.out.println("You don't have subject "+ (20-a)+" Credit\n"
				+"and Support Subject "+(30-b)+ " Credit");
		else if( a < 20)
			System.out.println("You don't have subject" + (20-a) + " Credit");
		else if( b < 30)
			System.out.println("You don't have Support Subject" + (30-b)+ "Credit");
	}
}
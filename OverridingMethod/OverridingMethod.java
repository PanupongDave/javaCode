class shape{
	public float calArea(float x,float y){
		return 0;
	}
}

class tri extends shape{
	@Override
	public float calArea(float x,float y){
		return 0.5f*x*y;
	}
}

class rec extends shape{
	@Override
	public float calArea(float x,float y){
		return x*y;
	}
}
public class OverridingMethod{
	public static void main(String[] args){
		System.out.println("triangle area = " + new tri().calArea(2,2));
		System.out.println("ractangle area = "+ new rec().calArea(2,2));
	}
}
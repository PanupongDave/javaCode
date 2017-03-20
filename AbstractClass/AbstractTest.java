abstract class employee{
  public abstract void setOT(float s);
  public float calOT(int h,float s){
    return h*s;
  }
}

public class AbstractTest extends employee{
  public void setOT(float s){
    System.out.println("OT RATE = "+ s + "BAHT/HR.");
  }
}

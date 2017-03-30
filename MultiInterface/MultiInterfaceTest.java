import java.util.Scanner;
public class MultiInterfaceTest implements employee1,employee2{
  public float setOT(float s){
    return s/30;
  }
  public float calOT(float s,int h){
    return setOT(s)*h;
  }
  public static void main(String[] args){
    MultiInterfaceTest cmp = new MultiInterfaceTest();
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter OT RATE >>>>> ");
    float salary = scan.nextFloat();
    System.out.print("Enter OT HOUR >>>>> ");
    int hr = scan.nextInt();
    System.out.println("OT HOUR = "+ hr +" HR.");
    System.out.println("OT RATE = "+ cmp.setOT(salary)+ " BAHT/HR.");
    System.out.println("TOTAL OT = "+ cmp.calOT(salary,hr)+ " BAHT");
  }
}

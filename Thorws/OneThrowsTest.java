import java.util.Scanner;

public class OneThrowsTest{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int n = scan.nextInt();
    try{
      OneThrows ex = new OneThrows();
      ex.go(n);
    }
    catch (OneThrows ex){
      System.out.println("catch");
    }
  }
}

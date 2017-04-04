import java.util.Scanner;

public class InputMisType{
  public static void main(String[] args){
    try{
      System.out.print("Enter X: ");
      Scanner scan = new Scanner(System.in);
      int X = scan.nextInt();
      System.out.print("Enter Y: ");
      scan = new Scanner(System.in);
      int Y = scan.nextInt();
      System.out.println(X/Y);
    }
    catch(ArithmeticException e1){
      System.out.println(e1+"\n หมายถึง ข้อผิดพลาดที่เกิดจากการหารด้วยศูนย์");
    }

    catch(Exception e2){
      System.out.println(e2+"\n หมายถึง ข้อผิดพลาดที่เกิดจากการป้อนข้อมูลผิดประเภท");
    }
  }
}

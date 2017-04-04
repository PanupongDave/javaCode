import java.util.Scanner;

public class CreatingExceptions{
  public static void main(String[] args){
    OutOfRangeException x = new OutOfRangeException();
    final int MIN = 0, MAX = 30; int value = 0;

    try{
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Score: ");
      value = scan.nextInt();
      x.checkvalue(value,MIN,MAX);
    }
    catch(OutOfRangeException e){
      System.out.println(e + "\nหมายถึง ข้อผิดพลาดที่เกิดจากข้อมูลเกินขนาด");
      System.exit(0);
    }
    catch(Exception e){
      System.out.println(e + "\nหมายถึง ข้อผิดพลาดที่เกิดจากการป้อนข้อมูลผิดประเภท");
      System.exit(0);
    }
    finally{
      System.out.println("คะแนนคือ "+value*100.0f/MAX +"%");
    }
  }
}

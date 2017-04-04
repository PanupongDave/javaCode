import java.io.*;

public class IOExceptType{
  public static void main(String[] args){
    BufferedReader f_in = null;
    File fname = new File("D:\\ByteData.txt");
      try{
        f_in = new BufferedReader(new FileReader(fname));
        System.out.println("Read Data from File: "+ fname);
        String c;
        while((c = f_in.readLine()) != null)
          System.out.println(c);
        f_in.close();
      }
      catch(IOException e){
        System.out.println(e+"\nหมายถึง ข้อผิดพลาดที่เกิดจากไม่พบไฟล์ข้อมูลที่ต้องการ");
      }
  }
}

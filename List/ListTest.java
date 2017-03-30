import java.util.*;

public class ListTest{
  public static void main(String[] args){
    LinkedList A = new LinkedList();
    LinkedList B = new LinkedList();

    A.add("โดราเอมอน");
    A.add("อิ้กคิวซัง");
    A.add("ฮาโตริ");
    A.add("ดราก้อนบอล");
    A.add(2,"โคนัน");

    System.out.print("จำนวนสมาชิกใน A = "+ A.size());
    System.out.println(" ประกอบด้วย\n" + A);

    if(A.contains("โคนัน")){
      System.out.println("โคนันอยู่ในลำดับที่ " + (A.indexOf("โคนัน") +1));
    }
    A.remove(3);
    System.out.println("เมื่อลบรายการที่่ "+ 4 + "ใน A แล้ว");
    System.out.println("A = "+ A);

    for(int i = 0; i<A.size(); i++){
      B.add(A.get(i));
    }

    B.set(2, "ฮาโตริ");
    System.out.println("B = " + B);

    if(!(A.equals(B))){
      System.out.println("A ไม่เท่ากับ B");
    }
    B.set(2,"โคนัน");
    System.out.println("B new =  " + B);
    if(A.equals(B)){
      System.out.println("A เท่ากับ B");
    }
    A.clear();
    System.out.println("ลบรายการ A ทั้งหมดแล้ว");
    System.out.println("A = "+ A);
    if(A.isEmpty()){
      System.out.println("A เป็นลิสต์ว่าง");
    }
  }
}

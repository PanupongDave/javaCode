public class OutofBound{
  public static void main(String[] args){
    int X[] = {0,1,2,3};
    try{
      System.out.println(X[X.length]);
    }
    catch (Exception e){
      System.out.println(e+"\n หมายถึง ที่เกิดจากการอ้างอิงอาร์เรย์ที่เกินขอบเขต");
    }
  }
}

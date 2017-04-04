public class OneThrows extends Exception{
  void go(int n)throws OneThrows{
    if(n<10){
      throw new OneThrows();
    }
    System.out.println(n);
  }
}

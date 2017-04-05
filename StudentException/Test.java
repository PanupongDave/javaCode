public class Test{
  public static void main(String[] args){
    double gpa;
    GpaException ex = new GpaException();

    try{
      gpa = 3;
      ex.checkGPA(gpa);
      System.out.println("GPA is " + gpa);
    }
    catch(GpaException e){
      System.out.println(e + "\n GPA is not true.");
    }
  }
}

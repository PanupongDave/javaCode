public class GpaException extends Exception{
  void checkGPA(double gpa)throws GpaException{
    if(gpa > 4){
      throw new GpaException();
    }
  }
}

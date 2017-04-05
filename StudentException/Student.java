public class Student {
  private String ID ;
  private String Name;
  private double GPA;

  public Student(String ID,String Name,double GPA){
    this.ID = ID;
    this.Name = Name;
    this.GPA = GPA;
  }
  public double getGPA(){
    return GPA;
  }
}

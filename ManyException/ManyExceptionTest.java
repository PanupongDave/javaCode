import java.io.*;
import java.sql.*;
public class ManyExceptionTest{
  public static void main(String[] args){
    for(int i=0;i<=3;i++){
      try{
        System.out.print(i);
        ManyException ex = new ManyException();
        ex.go(i);
      }
      catch(IOException ex){
        System.out.println(" catch io exception");
      }
      catch(SQLException ex){
        System.out.println(" catch sql exception");
      }
      catch(PanupongException ex){
        System.out.println(" PanupongException Goodnight!!! Wisit.");
      }
    }
  }
}

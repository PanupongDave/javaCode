import java.io.*;
import java.sql.*;
public class ManyException{
  // PanupongException panupong ;
  void go(int n) throws IOException, SQLException,PanupongException{
      switch(n){
        case 0:
          System.out.println();
          break;
        case 1:
          throw new IOException();
        case 2:
          throw new SQLException();
        default:
          throw new PanupongException();
      }
  }
}

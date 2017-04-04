import java.util.*;

public class SetTest{
  public static void main(String[] args){
    Set X = new HashSet();
    Set Y = new HashSet();
    Set Z = new HashSet();

    X.add("A");
    X.add("E");
    X.add("I");
    X.add("O");
    X.add("U");
    Y.add("A");

    System.out.println("X = "+ X);
    System.out.println("Y = "+ Y);
    Z = intersect(X, Y);
    System.out.println("X intersect Y = " + Z);
    Z = union(X, Y);
    System.out.println("X Union Y = "+ Z);
    Z = difference(X,Y);
    System.out.println("X difference Y = "+ Z);
  }

  public static Set intersect(Set s1,Set s2){
    Set ans = new HashSet(s1);
    ans.retainAll(s2);
    return ans;
  }

  public static Set union(Set s1,Set s2){
    Set ans = new HashSet(s1);
    ans.addAll(s2);
    return ans;
  }

  public static Set difference(Set s1,Set s2){
    Set ans = new HashSet(s1);
    ans.removeAll(s2);
    return ans;
  }
}

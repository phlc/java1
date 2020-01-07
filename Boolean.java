public class Boolean{
  public static void main (String[] args){
    boolean x;

    x = (2==2);
    System.out.println("2==2 is "+x);

    String s = "Test";
    String t = "Test";

    x = s.equals("test");
    System.out.println(x);

    x = s.equals(t);
    System.out.println(x);

    x = false;

    if (s == t)
      System.out.println("true?");

    String u = new String("Test");
    String v = new String("Test");

    boolean y = u == v;
    System.out.println(y);

  }
}

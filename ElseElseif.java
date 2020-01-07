public class ElseElseif{
  public static void main (String[] args){
    int y = 2;
    int x = 3;
    double d = 2.0;

//test with else if
    if (y < 3)
      System.out.println("Ok.");
    else if (y < 6)
      System.out.println("Nao deve mostrar -  6.");
    else
      System.out.println("Nao deve mostrar - 8.");

//test without else if
    if (y < 3)
      System.out.println("Ok.");
    if (y < 6)
      System.out.println("Deve mostrar -  Sem else if.");
    else
        System.out.println("Nao deve mostrar - 8.");

//test combining if statements
    if (y < 4){
      System.out.println("Ok test");
      if (y == d){
        System.out.println("int == double");
      }
    }

    if (y<4 && y==d)
      System.out.println("Same as before, using &&");

    
  }
}

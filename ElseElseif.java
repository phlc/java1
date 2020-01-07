public class ElseElseif{
  public static void main (String[] args){
    int y = 2;
    int x = 3;
    double d = 2.0;

    if (y < 3)
      System.out.println("Ok.");
    else if (y < 6)
      System.out.println("Nao deve mostrar -  6.");
    else
      System.out.println("Nao deve mostrar - 8.");

    if (y < 3)
      System.out.println("Ok.");
    if (y < 6)
      System.out.println("Deve mostrar -  Sem else if.");
    else
        System.out.println("Nao deve mostrar - 8.");
  }
}

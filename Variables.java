public class Variables {
    public static final String NAME = "Pedro";

    public static void main (String[] args){
        System.out.println("Nome: "+NAME);

        int x = 2;
        
        System.out.println("Valor de x: "+x);

        add2(x);

        System.out.println("Valor de x depois de add2: "+x);
    }

    public static void add2 (int x){
        x+=2;

        System.out.println("Valor de x dentro de add2: "+x);
    }
}
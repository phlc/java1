public class Concatenation{
    public static void main (String[] args){
        String a = "string";
        int x = 2;
        double y = 3.0;
        
        System.out.println(a + x + y);
        System.out.print(x + y);
        System.out.println();
        System.out.println(a + x * y);
        System.out.println (y - x + a);
        System.out.println (a + (char)(x * y * 10));

    }
}
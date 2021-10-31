public class arithmetic
 {
    public static void main(String args[]){
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Addition : " +(a+b));
        System.out.println("Product: " +(a*b));
        System.out.println("Difference: " +(a-b));
        System.out.println("Division: " +((float)a/b));
    }
}
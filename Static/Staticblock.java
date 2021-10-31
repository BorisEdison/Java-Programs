//it is executed before the main method at the time of classloading
package Static;
public class Staticblock {
    static{
        System.out.println("static block is invoked");
    }
    public static void main(String args[]){
        System.out.println("Hello main");
    }
}

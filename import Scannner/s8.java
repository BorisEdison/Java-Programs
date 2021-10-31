import java.util.Scanner;
public class s8 {

    static void myMethod(){

        System.out.println("Enter your first name");
        Scanner sc = new Scanner(System.in);
        String fname=sc.nextLine();
        System.out.println(fname + " Wick");
        

    }

    public static void main(String args[]){
        myMethod();
       

    }
    
}

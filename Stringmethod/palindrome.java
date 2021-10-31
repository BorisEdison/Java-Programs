package Stringmethod;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the String: ");
        StringBuffer pal = new StringBuffer(st.nextLine()) ;

        StringBuffer lin = new StringBuffer(pal);
        pal.reverse();
        if(pal.compareTo(lin) == 0){
            System.out.println(pal + " is a palindrome");
        }
        else{
            System.out.println(pal + " is not a palindrome");
        }
        st.close();


    }
    
}

package Stringmethod;
import java.util.Scanner;

public class secondpro {
    public static void main(String args[]){
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String pal = st.nextLine() ;
        int num=0;
        int lowchar=0;
        int uppchar=0;
        int spe=0;
        int space=0;

        for(int i=0;i<pal.length();i++ ){
            char ch = pal.charAt(i);
            if(Character.isDigit(ch)){
                num++;
            }

            if(Character.isLowerCase(ch)){
                lowchar++;
            }
            if(Character.isUpperCase(ch)){
                uppchar++;
            }
            
            if(Character.isWhitespace(ch)){
                space++;
            }
        }
        spe= pal.length() - num - lowchar - uppchar - space;
        System.out.println(num + " is the number of digits present");
        System.out.println(lowchar + " is the number of lower characters present");
        System.out.println(uppchar + " is the number of upper character present");
        System.out.println(spe + " is the number of special characters present");
        st.close();


    }
    
}

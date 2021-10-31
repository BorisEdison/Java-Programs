import java.util.*;
class oddException extends Exception{
    oddException(String message){
        super(message);

    }
}
public class oddexcep {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner ob = new Scanner(System.in);
        int num = ob.nextInt();
        try{
            int odd = num%2;
            if(odd ==1 ){ 
                throw new oddException("Input cannot be odd");

            }
        }
        catch(oddException e){
            System.out.println(e.getMessage());
        }

    }
    
}

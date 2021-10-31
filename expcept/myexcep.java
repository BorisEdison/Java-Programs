
class myException extends Exception{
    myException(String message){
        super(message);
    }
}

public class myexcep {
    public static void main(String args[]){
        int i,j,k= 0;
        i = 8;
        j=9;
        try{
            k=i/j;
            if(k==0){
                throw new myException("k cannot be zero");

            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(myException e){
            System.out.println(e.getMessage());
        }
    }
}

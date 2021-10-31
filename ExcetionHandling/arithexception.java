public class arithexception {
    public static void main(String args[]){
        int i , j = 2, k = 0;
        i = 8;
        try{
            k = i/j;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        finally{       // exeuted irrespective of exception incurred or not 
            System.out.println("Value of k is "+ k);
        }
    }
    
}

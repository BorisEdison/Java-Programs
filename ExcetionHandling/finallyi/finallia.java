package finallyi;
public class finallia {

    public static void main(String args[]) throws Exception{
        try{
            int a[] = null;
            a[4] = 10;

        }
        catch(ArithmeticException e){
            System.out.println("Divde error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index exceeded Error");
        }
        catch(Exception e){
            System.out.println("Something wrong");
        }
        finally{
            System.out.println("The End");
        }

    }
    
}

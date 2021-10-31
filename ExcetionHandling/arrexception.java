public class arrexception {
    public static void main(String args[]){
        try{
            int a[] = new int[5];
            a[10] = 50; //arrayIndexOutOfBoundException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is 5..");
        }
    }

    
}

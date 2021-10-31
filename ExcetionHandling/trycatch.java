package ExcetionHandling;

public class trycatch {
    public static void main(String args[]){
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
            System.out.println(myNumbers[0]);
            System.out.println("Rest of the code");

        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}

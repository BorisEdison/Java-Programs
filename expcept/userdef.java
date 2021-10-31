package expcept;
public class userdef{
    public static void valiidate(int age){

        if(age<18){
            throw new ArithmeticException ("Person is not eligible to vote");

        }
        else{
            System.out.println("Person is eligible to vote");
        }
    }
    public static void main(String args[]){
        validate(15);
        System.out.println("REmaining code:");
    }
}
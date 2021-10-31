// Java program to read data of various types using Scanner Class

package buffferclass;
import java.util.*;
public class usingscanner {
    public static void main(String args[]){

        // Declare the object and initialize with 
        // predefined standard input object

        Scanner sc = new Scanner (System.in);

        // String input 
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        // Character input
        System.out.println("Enter Gender: ");
        char gender = sc.next().charAt(0);

        // Numerical data input
        // byte, short and float can be read 
        // using similar-named functions
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Mobile No: ");
        long mobileNo = sc.nextLong();

        System.out.println("Enter cgpa: ");
        double cgpa = sc.nextDouble();

        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " +cgpa);
        sc.close();
    }
    
}

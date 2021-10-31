
import java.util.Scanner;  // Import the Scanner class

public class S4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = sc.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    Scanner sg = new Scanner(System.in);
    System.out.println("Enter roll number");
    int rollno = sg.nextInt();
    System.out.println("Roll no is: " + rollno);
    sc.close();
    sg.close();
    
}
}

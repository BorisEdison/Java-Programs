// Program to Demonstrate BufferedReader

package buffferclass;
import java.io.*;
class Emp1{
    String name;
    int id; int age; 
    Emp1 ( String name, int age , int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }
    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Id: " + this.id);
    }
}
public class demonstratebuffreader {

    
    public static void main (String args[])  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = reader.readLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());      // it only reads character string
        
        System.out.println("Enter your Id: ");
        int id = Integer.parseInt(reader.readLine());
        Emp1 std = new Emp1(name,age,id);
        std.displayDetails();

    }
    
}

import java.util.Scanner;
class employee{
    Long empid;
    String empname;
    String designation;
    int salary;

    void Employe(){
        Scanner sb = new Scanner(System.in);

        
        System.out.println("Enter id:");
        empid = sb.nextLong();
        String ab = sb.nextLine();

        System.out.println("Enter your Name: ");
        empname = sb.nextLine();

        System.out.println("Enter your designation: ");
        designation = sb.nextLine();

        System.out.println("Enter your Salary: ");
        salary = sb.nextInt();
        
        
        grade(salary);
        
        
        sb.close();
    }
    void grade(int salary){
        int salar = salary;
        if(salary>=90000){

            System.out.println("Grade: A");
        }
        else if(salar>=80000){

            System.out.println("Grade: B");
        }
        else if(salar>=70000){

            System.out.println("Grade: C");
        }
        else{

            System.out.println("Grade: C");
        }
        
        
    }
    void details(long id,int sal,String nam,String desi){
        System.out.println("Your employee id: " + id);

        System.out.println("Your Name: " + nam);

        System.out.println("Your Designation: " + desi);

        System.out.println("Your Salary: " + sal);
    }
}
public class emp {
    public static void main(String args[])throws Exception{
        employee em = new employee();
        em.Employe();
        
        
    }
    
}

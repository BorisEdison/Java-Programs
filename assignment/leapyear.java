import java.util.*;

class leap{
    static void leapyr (int year){
        int ye=year;
        if(ye%100 == 0){
            if(ye%400 == 0){
                System.out.println(ye + " is a Leap Year");
            }
            else{
                System.out.println(ye + " is not a Leap Year");
            }
        }
        else{
            if(ye%4 == 0){
                System.out.println(ye + " is a Leap Year");
            }
            else{
                System.out.println(ye + " is not a Leap Year");
            }
        }
    }
}

public class leapyear {
    public static void main(String args[]){
        Scanner sb = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sb.nextInt();

        System.out.println();
        leap.leapyr(year);
        sb.close();
    }

    
}

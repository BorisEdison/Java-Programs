import java.util.Scanner;
public class oddeven {
    public static void main(String args[]){
        Scanner bw = new Scanner(System.in);

        System.out.print("Enter a number\n");
        
        int num =bw.nextInt();
        int i=1;
        while(true){
            if( i > num){
                break;
            }
            if(i%2==0){
                System.out.println("Even no.: " + i);
                i++;
                continue;
            }
            System.out.println("Odd no.: " + i);
            i++;
        }
    }
    
}

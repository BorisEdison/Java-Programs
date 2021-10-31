package Array;
import java.util.Scanner;

public class largesmall {
    public static void main(String args[]){
        System.out.println("Enter the number of values you want to insert: ");
        Scanner ob = new Scanner(System.in);
        int num = ob.nextInt();
        int arr[] = new int[num];
        
        System.out.println("Enter the values for the array: ");
        for(int i=0; i< num;i++){
            arr[i]=ob.nextInt();
        }
        int lar=arr[0];
        int small=arr[0];
        
        for(int i=0; i<num; i++){
            if(lar<arr[i]){
                lar=arr[i];

            }
            if(small>arr[i]){
                small = arr[i];
            }
        }
        System.out.println("The largest value in the array: " + lar);
        System.out.println("The smallest value in the array: " + small);
        ob.close();
    }
    
    
}

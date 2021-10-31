package Array;

import java.util.Scanner;

public class Transpose {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = a.nextInt();

        int arr[][] = new int [num][num];
        int brr[][] = new int [num][num];
        int crr[][] = new int [num][num];

        System.out.println("\nEnter the elements in the matrix " + num + "*" + num );
        
        for( int i = 0; i<num;i++){

            for(int j=0;j<num;j++){
                arr[i][j] = a.nextInt();
            }
            
        }
        System.out.println("\nOriginal matrix " );
        for( int i = 0; i<num;i++){

            for(int j=0;j<num;j++){
                System.out.print(arr[i][j]+ "\t");

            }
            System.out.println();
            
        }

        for( int i = 0; i< num; i++){
            for( int j=0; j< num;j++){
                brr[i][j] = arr[j][i];
               
            }
        }
        System.out.println("Transpose: ");
        for( int i = 0; i< num; i++){
            for( int j=0; j< num;j++){
               
                System.out.print(brr[i][j] + "\t");
               
            }
            System.out.println();
        }
        System.out.println("Addition of two matrices: ");
        for( int i = 0; i< num; i++){
            for( int j=0; j< num;j++){
                crr[i][j]= arr[i][j] + brr[i][j];
                System.out.print(crr[i][j] + "\t");
               
            }
            System.out.println();
        }
        a.close();
        


    }
    
}

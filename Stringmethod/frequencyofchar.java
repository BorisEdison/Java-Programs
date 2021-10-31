package Stringmethod;

public class frequencyofchar {
    public static void main(String args[]){
        String str = "Welcome to OOP Java Lab";
        int count = 0;
        for (int i = 0; i<=str.length()-1; i++){
            if(str.charAt(i) == 'O'){
                count++;
            }
        }

        System.out.println("Frequency of O is: " + count);
    }
    
}

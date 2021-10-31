package bankPro;

import java.util.Scanner;

class eBank{
    private String accno;
    private String name;
    private long balance;

    Scanner obj = new Scanner(System.in);

    //method to open an account
    void openAccount(){
        System.out.println("Enter Account No: ");
        accno = obj.next();
        System.out.println("Enter Name: ");
        name = obj.next();
        System.out.println("Enter Initial Amount: ");
        balance = obj.nextLong();
    }
    
    //Method to display account details
    void showAccount(){
        System.out.println(accno + "," + name + "," + balance);
    }

    //method to search an account number
    boolean search(String acn){
        if(accno.equals(acn)){
            showAccount();
            return(true);
        }
        return(false);
    }

    void viewBalance(){
        System.out.println("Updated Balance is: " + balance);
    }

    //method to deposit money
    void deposit(){
        long amt;
        System.out.println("Enter Amount U want to Deposit: ");
        amt = obj.nextLong();
        balance = balance + amt;
    }

    // method to withdraw money
    void withdrawal(){
        long amt;
        System.out.println("Enter Amount U want to withdraw: ");
        amt = obj.nextLong();
        if(balance >= amt){
            balance = balance - amt;
        }
        else{
            System.out.println("Less Balance.. Transaction Failed..");
        }
    }


}
public class bank {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        //create initial accounts
        System.out.println("How many customer do you want to add:");
        int n = obj.nextInt();
        eBank C[] = new eBank[n];

        for (int i=0; i< C.length ; i++){
            C[i] = new eBank();
            C[i].openAccount();;
        }

        // run loop until menu 6 is not pressed
        int ch;
        do{
            System.out.println("Main Menu\n1. Display All\n2. Search By Account\n 3. Deposit\n4. Withdraw\n5. Check Balance \n6. Exit");
            System.out.println("Ur Choice: "); 
            ch = obj.nextInt();
            switch(ch){
                case 1: 
                    for(int i = 0; i< C.length; i++){
                        C[i].showAccount();
                    
                    }
                    break;
                
                case 2: 
                    System.out.println("Enter Account No U want to Search...");
                    String acn = obj.next();
                    boolean found = false;
                    for ( int i = 0 ; i< C.length ; i++){
                        found = C[i].search(acn);
                        if(found){
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search Failed.. Account No does not exist..");

                    }
                    break;
                case 3:
                    System.out.println("Enter Account No: ");
                    acn = obj.next();
                    found= false;
                    for( int i = 0; i<C.length; i++){
                        found = C[i].search(acn);
                        if(found){
                            C[i].deposit();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search Failed..Account No.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Account No: ");
                    acn = obj.next();
                    found = false;
                    for(int i = 0; i< C.length; i++ ){
                        found = C[i].search(acn);
                        if( found ){
                            C[i].withdrawal();
                            break;
                        }

                    }
                    if(!found){
                        System.out.println("Search Failed.. Account NO does not exist");
                    }
                    break;
                case 5:
                    System.out.println("Enter Account No: ");
                    acn = obj.next();
                    found = false;
                    for( int i = 0 ; i< C.length; i++){
                        found = C[i].search(acn);
                        if(found){
                            C[i].viewBalance();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search Failed..Account No does not exist");
                    }
                    break;
                case 6:
                    System.out.println("Good Bye...");
                    break;
            }
        }
        while( ch != 6);
    obj.close();


    }
    
}

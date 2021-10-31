import java.util.*;

class Account{
    public String acc_name;
    public int acc_no;
    public int acc_type;
    public float balance;
    public void getdata(String name, int no, int type, float bal){
        acc_name = name;
        acc_no = no;
        acc_type = type;
        balance = bal;
    }
    public void deposit(float amt){
        balance = balance + amt;
        System.out.println("Total Balance is: " + balance);
    }
    public void display(){
        System.out.println("\t Account Information");
        System.out.println(" Custormer Name: " + acc_name);
        System.out.println(" Account no.: " + acc_no);
        System.out.println(" Type of Account: " + acc_type);
        System.out.println(" Total Balance: " + balance);
    }
}

class Savings extends Account{
    public void withdraw(float amt){
        if(balance >= amt){
            balance = balance - amt;
            System.out.println("Total Balance is: " + balance);
        }
        else{
            System.out.println("\n Insufficient Balnace\n The amount can't be withdrawn");
        }
    }
    public void interest(int time){
        float rate = 6;
        float intr;
        intr = balance*rate*time/100;
        System.out.println("Interest calculated is: " + intr);
        balance = balance + intr;
        System.out.println("The new balance is:" + balance);

    }
}
class Current extends Account{
    public int min_bal(float amt){
        int pen;
        if( (balance - amt)<= 1000){
            pen = 50;
            balance = balance -pen;
            System.out.println("Penalty imposed Rs.50, deducted from your account");
            System.out.println("Current Balance is " + balance);
            return 0;
        }
        else{
            System.out.println("\n No penalty imposed");
            return 1;
        }

    }
    public void withdraw(float amt){
        int k = min_bal(amt);
        if( k==1){
            if(balance>= amt){
                balance = balance - amt;
                System.out.println(" Amount withdrawn Successfully");
            }
        }
        else{
            System.out.println("The amount cannot be withdrawn");
        }
    }
}



public class bank{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        float amt = 0;
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Amount no.: ");
        int no = sc.nextInt();
        System.out.println("Select Amount Type:\n0: for Savings Account\n1: Current Account\n");
        System.out.println("Enter Selection: ");
        int type = sc.nextInt();
        int temp,temp2;
        
        if(type == 0){
            Savings s = new Savings();
            s.getdata(name,no,type,amt);
            do{
                System.out.println("\n1. Deposit \n2. Withdraw \n 3.Interest\n4. Display Account information\n5. Exit");
                temp = sc.nextInt();
                switch (temp){
                    case 1:{
                        System.out.println("Enter Amount to be Deposited ");
                        float amt1 = sc.nextFloat();
                        s.deposit(amt1);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter Amount to be Withdrawn: ");
                        float amt1 = sc.nextFloat();
                        s.withdraw(amt1);
                        break;
                    }
                    case 3:{
                        System.out.println("Enter time period: ");
                        int tp = sc.nextInt();
                        s.interest(tp);
                        break;
                    }
                    case 4:{
                        s.display();
                    }
                    case 5:{
                        System.out.println("Thank you, Have a Great Day !!");
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Invalid input entered");
                        break;
                    }
                }
            } while(true);
        }
        else if(type == 1){
            Current c = new Current();
            c.getdata(name, no, type, amt);
            System.out.println("You have to Desposit a min amount of 1000 to active your account");
            do{
                System.out.println("\n1. Deposit \n2. Withdraw \n 3. Display\n4. Exit");
                temp2 = sc.nextInt();
                switch (temp2){
                    case 1:{
                        System.out.println("Enter Amount to be Deposited ");
                        float amt1 = sc.nextFloat();
                        c.deposit(amt1);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter Amount to be Withdrawn: ");
                        float amt1 = sc.nextFloat();
                        c.withdraw(amt1);
                        break;
                    }
                    case 3:{
                        c.display();
                    }
                    case 4:{
                        System.out.println("Thank you, Have a Great Day !!");
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Invalid input entered");
                        break;
                    }
                }
            
            

            }while(true);
        }else{
            System.out.println("\nInvalid Account Type Selected\n");
        }
    }
    
    
}
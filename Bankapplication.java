import java.util.*;
class Bank{
    long balance=15000;
    long withdraw(double amount){
        if(balance>=amount){
            balance -=amount;
            System.out.println("Transaction successfull");
        }
        else{
            System.out.println("Insufficient funds");
        }
        return balance;
    }
    long deposit(double amount){
        balance +=amount;
        return balance;
    }
    public static void main(String args[]){
        Bank obj=new Bank();
        Scanner sc=new Scanner(System.in);
        int c=0;
        while(c<1){
            System.out.println("1.withdraw");
            System.out.println("2.deposit");
            System.out.println("Select an option");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.print("Enter withdraw amount :");
                System.out.println("Balance = "+obj.withdraw(sc.nextDouble()));
                c++;
            }
            else if(n==2)
            {
                System.out.print("Enter deposit amount :");
                System.out.println("Balance = "+obj.deposit(sc.nextDouble()));
                c++;
            }
            else{
                System.out.println("Select correct option");
            }
        }
    }
}
import java.util.Scanner;


class Account {
    private double userBalance;

    public Account(double startingBalance){
        this.userBalance = startingBalance;
    }
    public void putMoney(double amt){
        if(amt <= 0){
            System.out.println("Invalid Amount");
            return;
        }
        userBalance += amt;
        System.out.println("Deposited : ₹" + amt);
    }
    public void takeMoney(double amt){
        if(amt <= 0){
            System.out.println("Amount must be more than ₹0");
            return;
        }
        if(amt > userBalance){
            System.out.println("Insufficient balance!!");
        }else{
            userBalance -= amt;
            System.out.println("Withdrawn : ₹" + amt);
        }
    }
    public void shownBalance(){
        System.out.printf("Available Balance :  ₹%.2f\n", userBalance);
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAcc = new Account(3000);
        System.out.println("------- ATM MACHINE -------");
        
        boolean isRunning = true;

        while(isRunning){
            System.out.println("\nWhat would you like to do?");
            System.out.println("1 -> Withdraw");
            System.out.println("2 -> Deposit");
            System.out.println("3 -> Check Balance");
            System.out.println("4 -> Exit");
            System.out.print("Your choice : ");
            int userOption = sc.nextInt();
            switch (userOption) {
                case 1:
                    System.out.print("Enter amount to withdraw : ₹");
                    double withdraw = sc.nextDouble();
                    myAcc.takeMoney(withdraw);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ₹");
                    double deposit = sc.nextDouble();
                    myAcc.putMoney(deposit);
                    break;
                case 3:
                    myAcc.shownBalance();
                case 4:
                    System.out.println("Thanks for using the ATM. See you soon!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again!");
                    break;
            }
        }
        sc.close();
    }
}

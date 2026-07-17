import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double balance=1000.0;

        System.out.println("========================================");
        System.out.println("        WELCOME TO JAVA ATM SIMULATOR");
        System.out.println("========================================");

        while (true){
            System.out.println("\n----- MAIN MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Amount to deposit = ");
                    double depositAmount=sc.nextDouble();

                    if(depositAmount<=0){
                        System.out.println("Invalid Amount Deposit amount must be greater than 0");
                        continue;
                    }else{
                        balance +=depositAmount;
                        System.out.println("Your new balance  = " + balance);
                    }
                    break;
                case 2:
                    System.out.print("Enter Amount to withdraw = ");
                    double withdrawAmount=sc.nextDouble();

                    if(withdrawAmount>balance){
                        System.out.println("Insufficient Balance");
                        continue;
                    }else if(withdrawAmount<500){
                        System.out.println("Withdrw amount must be greater than 500");
                        continue;
                    }else {
                        balance -= withdrawAmount;
                        System.out.println("Your new balance  = " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Your balance  = " + balance);
                    break;
                case 4:
                    System.out.println("Thanks for using this ATM");
                    return;
                default:
                    System.out.println("Invalid choice must be from 1 to 4");

            }
        }
    }
}

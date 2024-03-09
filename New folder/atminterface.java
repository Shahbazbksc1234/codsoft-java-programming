import java.util.Scanner;

public class atminterface {

    public class UserData {
        public String username;
        public int ID;
        public int PIN;
    }


    public static void main(String[] args)

    {

        //Starting balance in the account
        int CurrentBalance = 100;

        //taking input from the user
        Scanner sc = new Scanner(System.in);

        //welcoming note for the user
        System.out.println("Welcome to Standard Charted Bank, Lahore Cantt. Branch : ");

        //Taking the Username from the user
        System.out.println("Enter your username: ");
        String username = sc.nextLine();

        //Saying Hello to the user
        System.out.println("Hello " + username);

        //Taking the pin of the account from the user
        System.out.println("Enter your pin: ");
        int Pin = sc.nextInt();

        //Asking the user what he want to perform in the ATM
        System.out.println("How can we help you. Please enter number for specific actions.");

        //Asking the operations user what to perform
        //showing the statement for amount Withdrawal
        System.out.println("Pick 1 for Withdraw");

        //showing the statement for amount deposit
        System.out.println("Choose 2 for Deposit");

        //showing the statement for checking the balance in the account
        System.out.println("Choose 3 for Check Balance");

        //showing the statement for existing and taking the card back from the ATM-Machine.
        System.out.println("Choose 4 for EXIT");

        //Once again repeating the same question.
        System.out.print("Choose the operation you want to perform:");

        //taking input from the user to what action he wanna perform in the machine
        int choice = sc.nextInt();

        //initializing the variables
        int withdraw, deposit;

        //here i have two choices either use methods to perform the tasks or use switch cases
        switch (choice)

        {

            //Switch case for the amount withdrawal task
            case 1 ->

            {
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();

                //checking whether the withdrawal amount is greater than the current balance.
                if (CurrentBalance >= withdraw) {
                    CurrentBalance = CurrentBalance - withdraw;
                    System.out.println("Collect your money from the machine.");
                    System.out.println("Do u wanna check your balance after deposit.");
                    System.out.println("Your Balance amount in the account is: " + CurrentBalance);

                } else
                {
                    System.out.println("Insufficient Balance");
                }

                System.out.println("");
            }

            //Switch case for the depositing amount in the account.
            case 2 ->

            {
                System.out.print("Enter money to be deposited:");
                deposit = sc.nextInt();
                CurrentBalance = CurrentBalance + deposit;

                System.out.println("Your Money has been successfully deposited.");
                System.out.println("Do u wanna check your balance after deposit.");
                System.out.println("Balance : " + deposit + CurrentBalance);

                System.out.println("");
            }

            //Switch case for checking the balance in the account
            case 3 ->

            {
                System.out.println("Balance : " + CurrentBalance);
                System.out.println("");
            }
            //Switch case for the existing the atm and taking the card out from the machine.
            case 4 -> System.exit(0);
        }




        }
}
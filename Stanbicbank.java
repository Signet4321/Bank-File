import java.util.Scanner;
public class Stanbicbank{

    public static void main(String args[] )
    { 
        int  balance=7000000,withdraw,deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {

            System.out.println("0Welcome to Stanbic AITI Teller Machine");
            System.out.println("Choose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to EXIT");
            System.out.print("Choose the operation you want to perform:");
              int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter amount to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
  {
          balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Your balance is not enough to make this transaction");

                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
              deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
               System.exit(0);
            }
}
}
}

            

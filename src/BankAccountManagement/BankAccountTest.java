package BankAccountManagement;

import java.util.*;

import static java.lang.System.exit;

public class BankAccountTest {
    public static void main(String[] args) {
        HashMap<Integer, AccountDetails> accountHolderDetails = AccountRepository.accountHolderDetails;
        while (true)
        {
            System.out.println("----Bank Account Management----- ");
            System.out.println("1.Add Bank Account Details \n2.Display Account Details\n3.Display Account Details By AccountNumber " + "\n4.Update Account Details \n5.Delete Account Details \n6.Exit");
            System.out.println("Enter the Valid Option for Actions : ");
            Scanner sc = new Scanner(System.in);
            try {
                int opt = sc.nextInt();
            switch (opt)
            {
                case 1 : AccountDetails accountDetails = BankAccountService.addAccount();
                         Random rand = new Random();
                         int accountNumber;
                         do {
                             accountNumber = rand.nextInt(90000) + 10000;
                         }while (accountHolderDetails.containsKey(accountNumber));
                         accountHolderDetails.put(accountNumber,accountDetails);
                         System.out.println("Account added successfully...");
                         break;
                case 2 : BankAccountService.displayAccountDetails(accountHolderDetails);
                         break;
                case 3 : System.out.println("Enter the Account Number : ");
                         int accountNo = sc.nextInt();
                         BankAccountService.displayAccountByNumber(accountHolderDetails,accountNo);
                         break;
                case 4 : System.out.println("Enter the Account Number to Update: ");
                         int acc = sc.nextInt();
                         System.out.println("Enter the PAN Number to Update: ");
                         String pan = sc.next();
                         BankAccountService.updateAccount(accountHolderDetails,acc,pan);
                         break;
                case 5 : System.out.println("Enter the Account Number to delete : ");
                         int a = sc.nextInt();
                         System.out.println("Enter the PAN Number to Update: ");
                         String Pan = sc.next();
                         BankAccountService.deleteAccount(accountHolderDetails,a,Pan);
                         break;
                case 6 : exit(0);
                default:
                    System.out.println("Enter the Valid Option");
            }
            }catch (InputMismatchException e)
            {
                System.out.println("Enter the Valid Option");
            }
        }
    }
}

package BankAccountManagement;

import java.util.*;

import static java.lang.System.exit;

public class UserAccountTest {
    public static void main(String[] args) {
        HashMap<Integer,AccountDetails> data = AccountRepository.accountHolderDetails;
        while (true) {
            System.out.println("----User Account Management----- ");
            System.out.println("1.Display Account Details \n2.Check Balance \n3.Debit Amount" + "\n4.Credit Amount \n5.Add Account \n6.Exit");
            System.out.println("Enter the Valid Option for Actions : ");
            Scanner sc = new Scanner(System.in);
            try {
                int opt = sc.nextInt();
                switch (opt) {
                    case 1: System.out.println("Enter the Account Number : ");
                            int accountNo = sc.nextInt();
                            System.out.println("Enter the Password");
                            String pass = sc.next();
                            UserAccountService.userDetails(data,accountNo,pass);
                            break;
                    case 2: System.out.println("Enter the Account Number : ");
                            int accountno = sc.nextInt();
                            System.out.println("Enter the Password");
                            String password = sc.next();
                            UserAccountService.checkBalance(data,accountno,password);
                            break;
                    case 3: System.out.println("Enter the Account Number : ");
                            int acc = sc.nextInt();
                            System.out.println("Enter the Password");
                            String PASS = sc.next();
                            System.out.println("Enter the Amount to Debit : ");
                            double amount = sc.nextDouble();
                            UserAccountService.DebitAmount(data, acc,amount,PASS);
                            break;
                    case 4: System.out.println("Enter the Account Number : ");
                            int accNo = sc.nextInt();
                            System.out.println("Enter the Password");
                            String Pass = sc.next();
                            System.out.println("Enter the Amount to Credit : ");
                            double amt = sc.nextDouble();
                            UserAccountService.CreditAmount(data, accNo,amt,Pass);
                            break;
                    case 5: AccountDetails accountDetails = UserAccountService.addAccount();
                            Random rand = new Random();
                            int accountNumber;
                            do {
                            accountNumber = rand.nextInt(90000) + 10000;
                            }while (data.containsKey(accountNumber));
                            data.put(accountNumber,accountDetails);
                            System.out.println(data);
                            System.out.println("Account added successfully...");
                            break;
                    case 6:
                            exit(0);
                    default:
                        System.out.println("Enter the Valid Option");

                }
            } catch (InputMismatchException e) {
                System.out.println("Enter the Valid Option");
            }
        }
    }
}

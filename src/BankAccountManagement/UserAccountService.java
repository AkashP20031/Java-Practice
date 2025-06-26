package BankAccountManagement;

import java.util.*;

public class UserAccountService {
    static Scanner sc = new Scanner(System.in);

    public static void userDetails(HashMap<Integer,AccountDetails> details, int accountNo,String pass)
    {
        for(Map.Entry<Integer, AccountDetails> i : details.entrySet())
        {
            if( i.getKey()== accountNo)
            {
                AccountDetails account = details.get(accountNo);
                if(Objects.equals(account.getPassword(), pass)) {
                    System.out.println("Account Number: " + i.getKey() + "\nAccount Details: " + "\nName : "
                            + account.getName() + "\nAge : " + account.getAge() + "\nAadhar Number : " + account.getAadharNo() +
                            "\nPAN Number : " + account.getPanNo());
                }else{
                    System.out.println("Incorrect Password");
                }
            }
            else {
                System.out.println("Account Number Not Found");
            }
        }
    }

    public static void checkBalance(HashMap<Integer,AccountDetails> details, int accountNo, String pass)
    {
        for(Map.Entry<Integer, AccountDetails> i : details.entrySet())
        {
            if( i.getKey()== accountNo)
            {
                AccountDetails account = details.get(accountNo);
                if(Objects.equals(account.getPassword(), pass)) {
                System.out.println("\nBalance : "+account.getBalance());
                }else{
                    System.out.println("Incorrect Password");
                }
            }
            else {
                System.out.println("Account Number Not Found");
            }
        }
    }

    public static void DebitAmount(HashMap<Integer,AccountDetails> details,int accountNo, double amount, String pass)
    {
        for(Map.Entry<Integer, AccountDetails> i : details.entrySet())
        {
            if( i.getKey()== accountNo)
            {
                AccountDetails account = details.get(accountNo);
                if(Objects.equals(account.getPassword(), pass)) {
                if(account.getBalance()>amount) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Balance : " + account.getBalance());
                }else {
                    System.out.println("Insufficient Balance");
                }
                }else{
                    System.out.println("Incorrect Password");
                }
            }
            else {
                System.out.println("Account Number Not Found");
            }
        }
    }
    public static void CreditAmount(HashMap<Integer,AccountDetails> details,int accountNo, double amount,String pass) {
        for (Map.Entry<Integer, AccountDetails> i : details.entrySet()) {
            if (i.getKey() == accountNo) {
                AccountDetails account = details.get(accountNo);
                if(Objects.equals(account.getPassword(), pass)) {
                    account.setBalance(account.getBalance() + amount);
                    System.out.println("Balance : " + account.getBalance());
                }else{
                    System.out.println("Incorrect Password");
                }
            } else {
                System.out.println("Account Number Not Found");
            }
        }
    }

    public static AccountDetails addAccount(){
        AccountDetails account = new AccountDetails();
        System.out.println("Enter the Name : ");
        account.setName(sc.next());
        System.out.println("Enter the Age : ");
        account.setAge(sc.nextInt());
        System.out.println("Enter the Aadhar Number : ");
        account.setAadharNo(sc.next());
        System.out.println("Enter the Pan Number : ");
        account.setPanNo(sc.next());
        System.out.println("Enter the password : ");
        account.setPassword(sc.next());
        return account;
    }

}

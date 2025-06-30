package BankAccountManagement;

import java.util.*;

public class BankAccountService {
    static Scanner sc = new Scanner(System.in);

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
        return account;
    }

    public static void displayAccountDetails(HashMap<Integer, AccountDetails> details)
    {
        if(!details.isEmpty()) {
            for (Map.Entry<Integer, AccountDetails> i : details.entrySet()) {
                    System.out.println("Account Number: " + i.getKey() + " -->  Account Details: " + i.getValue());
            }
        }else {
            System.out.println("Accounts Not added");
        }
    }
    public static void displayAccountByNumber(HashMap<Integer, AccountDetails> details, int accountNumber)
    {
        if(!details.isEmpty()) {
        for(Map.Entry<Integer, AccountDetails> i : details.entrySet())
        {
            if( i.getKey()== accountNumber)
            {
                System.out.println("Account Number: " + i.getKey() + "  -->  Account Details: " + i.getValue());
            }
            else {
                System.out.println("Account Number Not Found");
            }
        }
        }else {
            System.out.println("Account Number is Not In DataBase");
        }
    }
    public static void deleteAccount(HashMap<Integer, AccountDetails> details, int accountNumber,String pan)
    {
        if(!details.isEmpty()) {
        if(details.containsKey(accountNumber))
        {
            AccountDetails account = details.get(accountNumber);
            if(Objects.equals(account.getPanNo(), pan)) {
                details.remove(accountNumber);
                System.out.println("Account with accountNumber " + accountNumber + " Deleted Successfully ");
            }else {
                System.out.println("PAN not matching");
            }
        }
        else {
            System.out.println("Account not found");
        }
    }else {
            System.out.println("Account Number is Not In DataBase");
        }
    }
    public static void updateAccount(HashMap<Integer, AccountDetails> details, int accountNumber,String pan)
    {
        if(!details.isEmpty()) {
        if(details.containsKey(accountNumber))
        {
            AccountDetails account = details.get(accountNumber);
            System.out.println("you have to update please press y else n");
            String y = sc.next();
            if(Objects.equals(y, "y")) {
                if(Objects.equals(account.getPanNo(), pan)) {
                    System.out.println("Enter new Name: ");
                    account.setName(sc.next());
                    System.out.println("Enter new Age: ");
                    account.setAge(sc.nextInt());
                    System.out.println("Enter new Aadhar Number: ");
                    account.setAadharNo(sc.next());
                    System.out.println("Enter new Pan Number: ");
                    account.setPanNo(sc.next());
                    System.out.println("Account no " + accountNumber + " updated successfully");
                }
                else {
                    System.out.println("Pan not matching");
                }
            }else
            {
                System.out.println("Account no " + accountNumber + " updated Declined");
            }
        }
        else
        {
            System.out.println("Account fon found");
        }
    }else {
            System.out.println("Account Number is Not In DataBase");
        }
    }
}

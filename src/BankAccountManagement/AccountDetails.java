package BankAccountManagement;

public class AccountDetails {
    private String name;
    private int age;
    private String aadharNo;
    private String panNo;
    private double balance = 0.0;
    private String password ;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Age=" + age +
                ", AadharNo='" + aadharNo + '\'' +
                ", PanNo='" + panNo + '\'' ;
    }


}

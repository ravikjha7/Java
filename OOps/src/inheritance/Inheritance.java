package inheritance;

class Account {
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;

    // Protected Keyword allows variable to be accessed in Child Class Also
    protected long balance;

    public Account(String a,String n,String ad,String p,String d) {
        accountNo = a;
        name = n;
        address = ad;
        phoneNo = p;
        dob = d;
        balance = 0;
    }

    // You need to make a Default Constructor in order to Make a Child Class
    // Whenever a Child Class Object is made, it will First Call The Constructor Of Parent Class
    public Account() {
        System.out.println("Hey I am Called");
    }

    public String getAccountNo() {
        return accountNo;
    }
    public long getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public String getDob() {
        return dob;
    }
    public void setPhoneNo(String p) {
        phoneNo = p;
    }
    public void setAddress(String a) {
        address = a;
    }
    public void close() {
        System.out.println("Your inheritance.Account is Closed SuccessFully !!!");
    }

}

class SavingsAccount extends Account {
    private long fD;

    public SavingsAccount(String a,String n,String ad,String p,String d) {
        // Super Keyword is Used To Call Constructor Of Parent Class
        super(a,n,ad,p,d);
    }

    void deposit(long n) {
        super.balance += n;
    }
    void withdraw(long n) {
        super.balance -= n;
    }
    void fixedDeposit(long n) {
        fD += n;
    }
    void liquidate(long n) {
        fD -= n;
    }
}

class LoanAccount extends  Account {
    private long emi;

    public LoanAccount(String a,String n,String ad,String p,String d) {
        // ssuper(a,n,ad,p,d);
    }

    long totalEMI() {
        return emi;
    }

    void payEMI(long n) {
        emi -= n;
    }
    void topUpLoan(long n) {
        emi += n;
    }
    void rePayment(long n) {
        emi -= n;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("0134","Ravi","Mumbai","7506561817","08/12/2002");
        s.deposit(100);
        s.withdraw(5);
        System.out.println(s.getBalance());

        LoanAccount l = new LoanAccount("0133","Sumant","Virar","8855991768","07/02/2002");
        l.topUpLoan(100);
        l.rePayment(10);
        l.payEMI(40);
        System.out.println(l.totalEMI());
    }
}

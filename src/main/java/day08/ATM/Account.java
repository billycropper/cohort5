package day08.ATM;

public abstract class Account {

    private int accountNum;
    private String name;
    private double withdraw;
    private double deposit;
    private double acctAmo;
    private double lastWithdraw;
    private double lastDeposit;

    public Account(int accountNum, String name) {
        this.accountNum = accountNum;
        this.name = name;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getAcctAmo() {
        return acctAmo;
    }

    public double getLastWithdraw() {
        return lastWithdraw;
    }

    public double getLastDeposit() {
        return lastDeposit;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setAcctAmo(double acctAmo) {
        this.acctAmo = acctAmo;
    }

    public void setLastWithdraw(double lastWithdraw) {
        this.lastWithdraw = lastWithdraw;
    }

    public void setLastDeposit(double lastDeposit) {
        this.lastDeposit = lastDeposit;
    }

    public double withdraw(double minus){
        double amount = getAcctAmo() - minus;
        setAcctAmo(amount);
        setLastWithdraw(minus);
        return amount;
    }

    public double deposit(double plus){
        double amount = getAcctAmo() + plus;
        setAcctAmo(amount);
        setLastDeposit(plus);
        return amount;
    }

    double balance(){
        return getAcctAmo();
    }
}

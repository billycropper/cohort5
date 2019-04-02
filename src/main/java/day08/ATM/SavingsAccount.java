package day08.ATM;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNum, String name) {
        super(accountNum, name);
    }

    @Override
    public String toString() {
        return  "SavingsAccount" + '\n' +
                "Account amount: " + getAcctAmo() + '\n' +
                "Account number: " + getAccountNum() + '\n' +
                "Last withdraw amount: " + getLastWithdraw() + '\n' +
                "Last deposit amount: " + getLastDeposit();
    }
}

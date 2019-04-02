package day08.ATM;

public class CheckingAccount extends Account {

    public CheckingAccount(int accountNum, String name) {
        super(accountNum, name);
    }

    @Override
    public String toString() {
        return  "CheckingAccount" + '\n' +
                "Account amount: " + getAcctAmo() + '\n' +
                "Account number: " + getAccountNum() + '\n' +
                "Last withdraw amount: " + getLastWithdraw() + '\n' +
                "Last deposit amount: " + getLastDeposit();
    }
}

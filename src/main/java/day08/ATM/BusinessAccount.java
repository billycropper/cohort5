package day08.ATM;

public class BusinessAccount extends Account {

    public BusinessAccount(int accountNum, String name) {
        super(accountNum, name);
    }

    @Override
    public String toString() {
        return "BusinessAccount" + '\n' +
                "Account amount: " + getAcctAmo() + '\n' +
                "Account number: " + getAccountNum() + '\n' +
                "Last withdraw amount: " + getLastWithdraw() + '\n' +
                "Last deposit amount: " + getLastDeposit();
    }
}

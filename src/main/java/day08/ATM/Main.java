package day08.ATM;

public class Main {
    public static void main(String[] args) {

        BusinessAccount bus = new BusinessAccount(12345, "William");
        bus.setAcctAmo(1000.00);
        bus.deposit(200.00);
        bus.withdraw(100.00);
        System.out.println(bus);

        CheckingAccount check = new CheckingAccount(43975, "William");
        check.setAcctAmo(34000.00);
        check.deposit(54.00);
        check.withdraw(23456.00);
        System.out.println(check);

        SavingsAccount sav = new SavingsAccount(123490945, "William");
        sav.setAcctAmo(94392.00);
        sav.deposit(590022.00);
        sav.withdraw(1000.00);
        System.out.println(sav);

    }
}

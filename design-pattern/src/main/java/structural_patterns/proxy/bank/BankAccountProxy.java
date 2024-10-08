package structural_patterns.proxy.bank;

public class BankAccountProxy implements BankAccount {

    private RealBankAccount realBankAccount;
    private String userRole;

    public BankAccountProxy(String userRole, double initialBalance) {
        this.userRole = userRole;
        this.realBankAccount = new RealBankAccount(initialBalance);
    }

    private boolean hasAccess () {
        return "Admin".equalsIgnoreCase(userRole);
    }

    @Override
    public void withdraw(double amount) {
        if (hasAccess()) {
            realBankAccount.withdraw(amount);
        } else {
            System.out.println("Access denied. Only Admin can withdraw.");
        }
    }

    @Override
    public void deposit(double amount) {
        realBankAccount.deposit(amount);
    }
}

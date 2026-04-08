public class CheckingsAccount extends BankAccount{
    private BigDecimal monthlyFee;

    public checkingsAccount(String accountNumber, BigDecimal balance, BigDecimal monthlyFee) {
        super(accountNumber,balance);
        this.monthlyFee = monthlyFee;
    }

    public void applyMonthlyFee() {
        super.getBalance().subtract(monthlyFee);
    }

    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(BigDecimal monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CheckingsAccount{" +
                "monthlyFee=" + monthlyFee +
                '}';
    }
}

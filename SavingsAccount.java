public class SavingsAccount extends BankAccount {
    private BigDecimal interestRate;

    public SavingsAccount(String accountNumber, BigDecimal balance, BigDecimal interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
        public void applyInterest(){
        BigDecimal result = (super.getBalance()
                .divide(new BigDecimal ( val:"100"), RoundingMode.HALF_EVEN);
        super.getBalance().add
        }

    @java.lang.Override
    public java.lang.String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}

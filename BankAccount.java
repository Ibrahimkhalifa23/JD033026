//Design a BankAccount Class with Correct Types

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;
    private boolean isActive;

    public BankAccount(BigDecimal balance, String accountNumber, boolean isActive) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.isActive = isActive;
    }

    public void deposit(BigDecimal amount){
        if (amount.compareTo(BigDecimal.Zero)< 0){
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
    public void withdrawal(BigDecimal amount) {
            if(amount.compareTo(BigDecimal.Zero)<0)
                System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public bigDecimal getBalance() {
            return balance;
        }

        public void setBalance(bigDecimal balance) {
            this.balance = balance;
        }

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }

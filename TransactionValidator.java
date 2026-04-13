// Lab - Redesign the Fintech Services Using Compositions

import java.math.BigDecimal;


// Lab 1 - TransactionValidator - Extract and Compose
public class TransactionValidator {

    public boolean isValid(BigDecimal amount, BankAccount account) {
        return amount.compareTo(BigDecimal.ZERO) > 0;
    }
}

// Lab 2 - BankAccount - Static Factory Methods
public class PaymentService {

    public class BankAccount {
        private final String accountId;
        private final BigDecimal balance;

        private BankAccount(String accountId, BigDecimal balance) {
            this.accountId = accountId;
            this.balance = balance;
        }

        public static BankAccount newChecking(String num, BigDecimal balance) {
            return new BankAccount(num, balance);
        }

        public static BankAccount newSavings(String num, BigDecimal balance) {
            return new BankAccount(num, balance);
        }

        public static BankAccount empty(String num) {
            return new BankAccount(num, BigDecimal.ZERO);
        }

        public String getAccountId() { return accountId; }
        public BigDecimal getBalance() { return balance; }
    }

// Lab 3 - TransferRequest - Builder Pattern
    public class BankAccount{
    private String id;
    private BigDecimal balance;

    private BankAccount(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public static BankAccount newChecking(String id, BigDecimal balance) {
        return new BankAccount(id, balance);
    }

    public static BankAccount newSavings(String id, BigDecimal balance) {
        return new BankAccount(id, balance);
    }

    public static BankAccount empty(String id) {
        return new BankAccount(id, BigDecimal.ZERO);
    }
}

public class TransferRequest {
    private final String fromAccount;
    private final String toAccount;
    private final BigDecimal amount;

    private TransferRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.amount = builder.amount;
    }

    public static class Builder {
        private String fromAccount;
        private String toAccount;
        private BigDecimal amount;

        public Builder from(String from) {
            this.fromAccount = from;
            return this;
        }

        public TransferRequest build() {
            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Amount must be > 0");
            }
            return new TransferRequest(this);
        }
    }
}


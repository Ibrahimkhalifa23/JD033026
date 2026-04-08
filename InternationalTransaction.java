import java.math.BigDecimal;
import java.util.Objects;

public class InternationalTransaction extends Transaction {
    private String currencyCode;

    public InternationalTransaction(String id, BigDecimal amount, String currencyCode) {
        super(id,amount);

        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InternationalTransaction that = (InternationalTransaction) o;
        return Objects.equals(currencyCode, that.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(currencyCode);
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;


    }
}



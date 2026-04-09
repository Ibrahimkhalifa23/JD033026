import java.math.BigDecimal;
import java.util.Objects;

public class HomeLoan extends Loan{
    private String propertyAddress;

    public HomeLoan(BigDecimal loanAmount, double interestRate, String propertyAddress){
        super(loanAmount, interestRate);

        this.propertyAddress = propertyAddress;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HomeLoan homeLoan = (HomeLoan) o;
        return Objects.equals(propertyAddress, homeLoan.propertyAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(propertyAddress);
    }

    public HomeLoan(BigDecimal loanAmount, double interestRate, String propertyAddress){
        super(loanAmount,interestRate);

        this.propertyAddress = propertyAddress;




    }
}



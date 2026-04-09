import java.util.Objects;

public class PromotionalRate extends InterestRate{
    private String expirationDate;

    public PromotionalRate(double percentage, String date){
        super(percentage);

        this.expirationDate = date;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PromotionalRate that = (PromotionalRate) o;
        return Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(expirationDate);
    }
}

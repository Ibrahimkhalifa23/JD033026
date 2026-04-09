import java.math.BigDecimal;
import java.util.Objects;

public class RewardsCard extends CreditCard{
    private double cashBackPercentage;

    public double getCashBackPercentage() {
        return cashBackPercentage;
    }

    public void setCashBackPercentage(double cashBackPercentage) {
        this.cashBackPercentage = cashBackPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RewardsCard that = (RewardsCard) o;
        return Double.compare(cashBackPercentage, that.cashBackPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cashBackPercentage);
    }

    public RewardsCard(double rewardRate, BigDecimal limit){
        super(limit);

        this.cashBackPercentage = rewardRate;


    }
}

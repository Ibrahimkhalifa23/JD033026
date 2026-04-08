import java.util.Objects;

public class PremiumCustomer extends Customer {
    private String personalBankerName;

    public PremiumCustomer(String name, String customerID, String password, String personalBankerName) {
        super(name, customerID, password);
        this.personalBankerName = personalBankerName;
    }

    public String getPersonalBankerName() {
        return personalBankerName;
    }

    public void setPersonalBankerName(String personalBankerName) {
        this.personalBankerName = personalBankerName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PremiumCustomer that = (PremiumCustomer) o;
        return Objects.equals(personalBankerName, that.personalBankerName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(personalBankerName);
    }
}


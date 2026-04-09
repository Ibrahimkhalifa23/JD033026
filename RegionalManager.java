import java.math.BigDecimal;
import java.util.Objects;

public class RegionalManager extends BankManager {
    private String regionManager;

    public RegionalManager(String name, BigDecimal salary, String departmentName, String regionManager){
        super(name, salary, departmentName);

        this.regionManager = regionManager;
    }

    public String getRegionManager() {
        return regionManager;
    }

    public void setRegionManager(String regionManager) {
        this.regionManager = regionManager;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RegionalManager that = (RegionalManager) o;
        return Objects.equals(regionManager, that.regionManager);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regionManager);
    }
}

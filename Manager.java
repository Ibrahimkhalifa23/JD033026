import java.math.BigDecimal;
import java.util.Objects;

public class Manager extends Employee {
    private BigDecimal annualBonus;

    public BigDecimal getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(BigDecimal annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(annualBonus, manager.annualBonus);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(annualBonus);
    }

    public Manager(String name, BigDecimal salary, BigDecimal annualBonus){
        super(name,salary);

        this.annualBonus = annualBonus;


    }
}



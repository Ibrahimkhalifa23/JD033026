import java.math.BigDecimal;

public class BankManager {
    private String name;
    private BigDecimal salary;
    private String departmentName;

    public BankManager(String name, BigDecimal salary, String departmentName){
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }
}

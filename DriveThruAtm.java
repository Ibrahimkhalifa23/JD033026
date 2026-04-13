import java.math.BigDecimal;
import java.util.Objects;

public class DriveThruAtm extends AtmMachine{
    private double clearanceHeight;

    public DriveThruAtm(String id, double height){
        super(id);

        this.clearanceHeight = height;
    }

    public double getClearanceHeight() {
        return clearanceHeight;
    }

    public void setClearanceHeight(double clearanceHeight) {
        this.clearanceHeight = clearanceHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DriveThruAtm that = (DriveThruAtm) o;
        return Double.compare(clearanceHeight, that.clearanceHeight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clearanceHeight);
    }
}
public class BiometricCheck extends Security {
    @Override
    public void verifyCredentials() {
        System.out.println("Scanning fingerprint and matching ID...");
    }
    public void logActivity(){
            System.out.println("Logging biometric success to secure vault...");
    }
}

public class SmallBusinessTax extends TaxReturn{
    @Override
    public void calculateTax() {
        System.out.println("Calculating business expenses...");
    }

        @Override
        public void submit(){
                System.out.println("Sending to IRS Business Division...");}
    }
}

public class MobileApp extends BankApp {
    @Override
    public void login() {
        System.out.println("Logging in with FaceID...");
    }
}
public class Teller extends BankEmployee{
    @Override
    public void performDuty(){
        System.out.println("Processing cash deposit for customer...");
        public abstract void clockIn();
        }
    }


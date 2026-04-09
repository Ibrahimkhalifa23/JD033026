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

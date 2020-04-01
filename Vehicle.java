import java.util.Objects;

public class Vehicle {

    private double price;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColor;

    public Vehicle() {
    }

    public Vehicle(double price, String vehicleModel, String vehicleMake) {
        this.price = price;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 &&
                Objects.equals(vehicleMake, vehicle.vehicleMake) &&
                Objects.equals(vehicleModel, vehicle.vehicleModel) &&
                Objects.equals(vehicleColor, vehicle.vehicleColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, vehicleMake, vehicleModel, vehicleColor);
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                '}';
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleColor() {
        return this.vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}

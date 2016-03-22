package strategy.models.vehicles;

public abstract class Vehicle {

    private String vehicleType;

    public String getVehicleType(){
        return vehicleType;
    }

    protected Vehicle(String vehicleType){
        this.vehicleType = vehicleType;
    }
}

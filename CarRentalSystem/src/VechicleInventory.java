import java.util.ArrayList;
import java.util.List;

public class VechicleInventory {

    List<Vehicle> vehicleList;

    public VechicleInventory(){
        vehicleList = new ArrayList<>();
    }

    public VechicleInventory(List<Vehicle>vehicleList){
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList(){
        return this.vehicleList;
    }

    public void setAvailable(Vehicle vehicle,boolean val){
        for(Vehicle vehicle1: vehicleList){
            if(vehicle1.getName() == vehicle.getName()){
                vehicle1.setAvailable(val);
            }
        }
    }
}

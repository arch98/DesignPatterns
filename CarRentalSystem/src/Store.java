import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {

    VechicleInventory inventory;
    List<Reservation> reservationList;

    public List<Vehicle> getAvailableVehicles(){
        List<Vehicle> vehicleList = this.inventory.getVehicleList();
        List<Vehicle>availableVehicles = new ArrayList<>();
        for(Vehicle vehicle:vehicleList){
            if(vehicle.isAvailable){
                availableVehicles.add(vehicle);
            }
        }

        return availableVehicles;
    }

    public void reserveVehicle(Vehicle vehicle, Date to, Date from){
        inventory.setAvailable(vehicle,false);
        Reservation reservation = new Reservation();
        reservation.vehicle = vehicle;
        reservation.to = to;
        reservation.from = from;
        reservationList.add(reservation);
    }
}

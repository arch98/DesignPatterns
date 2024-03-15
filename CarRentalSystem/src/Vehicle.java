public class Vehicle {
    String name;
    VehicleType type;
    boolean isAvailable;

    public boolean getAvailable(){
        return this.isAvailable;
    }

    public void setAvailable(boolean val){
        this.isAvailable = val;
    }

    public String getName(){
        return this.name;
    }
}

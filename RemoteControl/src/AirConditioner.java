public class AirConditioner {
    boolean state;

    AirConditioner(){
        this.state = false;
    }

    public  void turnOn(){
        this.state = true;
    }

    public void turnOff(){
        this.state = false;
    }

}

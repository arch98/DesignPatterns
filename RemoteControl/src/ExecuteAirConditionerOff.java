public class ExecuteAirConditionerOff implements ICommand{
    AirConditioner conditioner;

    ExecuteAirConditionerOff(AirConditioner conditioner){
        this.conditioner = conditioner;
    }

    public void execute(){
        this.conditioner.turnOff();
    }

    public void undo(){
        this.conditioner.turnOn();
    }
}

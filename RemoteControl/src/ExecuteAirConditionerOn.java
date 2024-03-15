import java.text.AttributedCharacterIterator;

public class ExecuteAirConditionerOn implements ICommand{
    AirConditioner conditioner;

    ExecuteAirConditionerOn(AirConditioner airConditioner){
        this.conditioner = airConditioner;
    }

    public void execute(){
        this.conditioner.turnOn();
    }

    public void undo(){
        this.conditioner.turnOff();
    }
}

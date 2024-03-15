import java.util.Stack;

public class RemoteControl {
    ICommand command;
    Stack<ICommand>commandStack = new Stack<>();
    RemoteControl(){

    }

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
        this.commandStack.add(command);
    }

    public void undo(){
        if(!commandStack.empty()){
            ICommand lastCommand = commandStack.pop();
            lastCommand.undo();
        }
    }
}

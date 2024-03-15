import LogType.LogType;

public class DebugLogHandler extends LogProcessor{

    DebugLogHandler(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(String message, LogType type){
        if(type == LogType.DEBUG){
            System.out.println(LogType.DEBUG+message);
        }else{
            super.log(message,type);
        }
    }
}
import LogType.LogType;

public class ErrorLogHandler extends LogProcessor{
    ErrorLogHandler(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(String message, LogType type){
        if(type == LogType.ERROR){
            System.out.println(LogType.ERROR+message);
        }else{
            super.log(message,type);
        }
    }
}

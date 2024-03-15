import LogType.LogType;

public abstract  class LogProcessor{
    private LogProcessor nextlogProcessor;

    public LogProcessor(LogProcessor logProcessor){
        this.nextlogProcessor = logProcessor;
    }

    public void log(String message, LogType type){
        if(nextlogProcessor != null){
            nextlogProcessor.log(message,type);
        }
    }
}

import LogType.LogType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

       LogProcessor logProcessor = new ErrorLogHandler(new DebugLogHandler(null));

        logProcessor.log("hi",LogType.DEBUG);
        logProcessor.log("hi again",LogType.ERROR);
    }
}
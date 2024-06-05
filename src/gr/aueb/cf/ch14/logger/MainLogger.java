package gr.aueb.cf.ch14.logger;

public class MainLogger {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logMessage("\nThis is a test message.");
    }
}

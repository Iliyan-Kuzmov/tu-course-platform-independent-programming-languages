package ex2;
import ex2.Logger;
public class classes {
    public class ConsoleLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("Console: "+message);
        }
    }
    public class FileLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("File: "+message);
        }
    }
    public class Application{
        private Logger logger;
        public Application(Logger logger) {
            this.logger = logger;
        }
        public void logInfo(String message) {
            this.logger.log(message);
        }
    }
}

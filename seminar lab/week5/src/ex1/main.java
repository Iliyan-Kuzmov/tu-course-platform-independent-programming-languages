package ex1;
import ex1.Message;

public class main {
    static class EmailMessage implements Message {
        @Override
        public String send() {
            return "Email Message";
        }
    }
    static class SMSMessage implements Message {
        @Override
        public String send() {
            return "SMS Message";
        }
    }
    static class PushNotification implements Message {
        @Override
        public String send() {
            return "Push Notification";
        }
    }
    public static class MessageFactory {
        public static Message createMessage(String message) {
            switch (message) {
                case "Email Message":
                    return new EmailMessage();
                case "SMS Message":
                    return new SMSMessage();
                case "Push Notification":
                    return new PushNotification();
                default:
                    return null;
            }
        }
    }

}

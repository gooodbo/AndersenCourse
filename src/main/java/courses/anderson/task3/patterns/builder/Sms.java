package courses.anderson.task3.patterns.builder;

public class Sms {
    private final String receiverName;
    private final String phoneNumber;
    private final String message;

    public Sms(String receiverName, String phoneNumber, String message) {
        this.receiverName = receiverName;
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "receiverName='" + receiverName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

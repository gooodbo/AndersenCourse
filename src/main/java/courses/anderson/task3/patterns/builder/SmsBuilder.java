package courses.anderson.task3.patterns.builder;

public class SmsBuilder {

    private String receiverName;
    private String phoneNumber;
    private String code;
    private String message;

    public SmsBuilder setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    public SmsBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public SmsBuilder setCode(int code) {
        this.code = "+" + code;
        return this;
    }

    public SmsBuilder setMessage(String message) {
        this.message = "Dear client,\n" + message + "\nBest regards";
        return this;
    }

    public Sms build() {
        String phoneNumber = this.code + this.phoneNumber;
        return new Sms(receiverName, phoneNumber, message);
    }

}

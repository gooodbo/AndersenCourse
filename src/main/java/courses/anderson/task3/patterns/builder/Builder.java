package courses.anderson.task3.patterns.builder;

public class Builder {
    public static void main(String[] args) {
        Sms sms = new SmsBuilder()
                .setCode(375)
                .setPhoneNumber("291234567")
                .setReceiverName("Ivan Ivanov")
                .setMessage("Your payment has been received")
                .build();

        System.out.println(sms);
    }
}

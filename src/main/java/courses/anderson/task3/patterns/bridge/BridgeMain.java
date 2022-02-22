package courses.anderson.task3.patterns.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Mail mail = new MessageManager(1);

        System.out.println(mail.sendMail());
    }
}

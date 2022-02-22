package courses.anderson.task3.patterns.bridge;

public class Sms extends MessageManager {

    public Sms(int symbolsCount) {
        super(symbolsCount);
    }

    @Override
    public String toString() {
        return "Sms";
    }
}

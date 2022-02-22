package courses.anderson.task3.patterns.bridge;

public class Email extends MessageManager {

    public Email(int symbolsCount) {
        super(symbolsCount);
    }

    @Override
    public String toString() {
        return "Email";
    }
}

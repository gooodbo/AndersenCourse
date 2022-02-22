package courses.anderson.task3.patterns.bridge;

public class Telegram extends MessageManager {

    public Telegram(int symbolsCount ) {
        super(symbolsCount);
    }

    @Override
    public String toString() {
        return "Telegram";
    }
}

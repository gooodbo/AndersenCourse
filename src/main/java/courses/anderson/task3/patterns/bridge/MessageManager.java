package courses.anderson.task3.patterns.bridge;

public class MessageManager implements Mail {

    protected int symbolsCount;

    public MessageManager(int symbolsCount) {
        this.symbolsCount = symbolsCount;
    }

    Mail setMessengerName() {
        Mail mail = null;
        if (symbolsCount <= 50) {
            mail = new Sms(symbolsCount);
        }
        if (symbolsCount > 50) {
            mail = new Telegram(symbolsCount);
        }
        if (symbolsCount > 200) {
            mail = new Email(symbolsCount);
        }
        return mail;
    }

    @Override
    public String sendMail() {
        return "The mail with " + symbolsCount + " symbol(s) has been sent by " + setMessengerName();
    }

}

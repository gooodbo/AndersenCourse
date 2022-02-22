package courses.anderson.task3.patterns.adapter;

public abstract class BaseCharger implements Charger {
    protected String type;
    protected int voltage;

    protected BaseCharger(String type, int voltage) {
        this.type = type;
        this.voltage = voltage;
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public int voltage() {
        return voltage;
    }
}

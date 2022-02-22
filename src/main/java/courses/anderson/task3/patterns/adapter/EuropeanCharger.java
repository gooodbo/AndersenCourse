package courses.anderson.task3.patterns.adapter;

public class EuropeanCharger extends BaseCharger {
    private static final String EUROPEAN_CHARGER_TYPE = "European";
    private static final int EUROPEAN_CHARGER_VOLTAGE = 220;

    public EuropeanCharger() {
        super(EUROPEAN_CHARGER_TYPE, EUROPEAN_CHARGER_VOLTAGE);
    }


}

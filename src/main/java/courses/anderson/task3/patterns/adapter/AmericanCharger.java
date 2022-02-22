package courses.anderson.task3.patterns.adapter;

public class AmericanCharger extends BaseCharger {
    private static final String AMERICAN_CHARGER_TYPE = "American";
    private static final int AMERICAN_CHARGER_VOLTAGE = 110;

    public AmericanCharger() {
        super(AMERICAN_CHARGER_TYPE, AMERICAN_CHARGER_VOLTAGE);
    }

}

package courses.anderson.task3.patterns.adapter;

public class Adapter {
    public static void main(String[] args) {
        Charger americanCharger = new AmericanCharger();
        Charger europeanCharger = new EuropeanCharger();

        System.out.println("Initial " + europeanCharger.type() + " charger : " + europeanCharger.voltage());
        System.out.println("Initial " + americanCharger.type() + " charger : " + americanCharger.voltage());

        ChargerAdapter americanChargerAdapter = new AmericanChargerAdapter();
        ChargerAdapter europeanChargerAdapter = new EuropeanChargerAdapter();

        Charger adaptedEuropeanCharger = americanChargerAdapter.adapt(europeanCharger);
        Charger adaptedAmericanCharger = europeanChargerAdapter.adapt(americanCharger);

        System.out.println("American adapted " + europeanCharger.type() + " charger : "  + adaptedEuropeanCharger.voltage());
        System.out.println("European adapted " + americanCharger.type() + " charger : "  + adaptedAmericanCharger.voltage());

    }
}

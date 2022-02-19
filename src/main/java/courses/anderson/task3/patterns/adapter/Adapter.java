package courses.anderson.task3.patterns.adapter;

public class Adapter {
    public static void main(String[] args) {
        Charger americanCharger = new AmericanCharger();
        Charger europeanCharger = new EuropeanCharger();

        System.out.println("Initial " + europeanCharger.type() + " charger : " + europeanCharger.voltage());
        System.out.println("Initial " + americanCharger.type() + " charger : " + americanCharger.voltage());

        OutletAdapter americanOutletAdapter = new AmericanOutletAdapter();
        OutletAdapter europeanOutletAdapter = new EuropeanOutletAdapter();

        Charger adaptedEuropeanCharger = americanOutletAdapter.adapt(europeanCharger);
        Charger adaptedAmericanCharger = europeanOutletAdapter.adapt(americanCharger);

        System.out.println("American adapted " + europeanCharger.type() + " charger : "  + adaptedEuropeanCharger.voltage());
        System.out.println("European adapted " + americanCharger.type() + " charger : "  + adaptedAmericanCharger.voltage());

    }
}

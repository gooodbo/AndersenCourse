package courses.anderson.task3.patterns.adapter;

class AmericanOutletAdapter implements OutletAdapter {
    @Override
    public Charger adapt(Charger charger) {
        if(charger instanceof EuropeanCharger){
            return new AmericanCharger();
        }
        return charger;
    }
}

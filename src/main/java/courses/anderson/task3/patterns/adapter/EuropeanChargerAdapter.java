package courses.anderson.task3.patterns.adapter;

class EuropeanChargerAdapter implements ChargerAdapter {
    @Override
    public Charger adapt(Charger charger) {
        if(charger instanceof AmericanCharger){
            return new EuropeanCharger();
        }
        return charger;
    }
}

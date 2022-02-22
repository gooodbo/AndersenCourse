package courses.anderson.task3.patterns.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void testEuropeanChargerAdapter_shouldReturnEuropeanCharger() {
        // 1. create american charger
        Charger americanCharger = new AmericanCharger();
        // 2. create expected charger
        Charger expectedEuropeanCharger = new EuropeanCharger();
        // 3. create tested adapter
        ChargerAdapter europeanChargerAdapter = new EuropeanChargerAdapter();

        // 4. european charger adapter test
        Charger actualEuropeanCharger = europeanChargerAdapter.adapt(americanCharger);

        // 5. verify result
        Assert.assertEquals(expectedEuropeanCharger.type(), actualEuropeanCharger.type());
        Assert.assertEquals(expectedEuropeanCharger.voltage(), actualEuropeanCharger.voltage());
    }

    @Test
    public void testAmericanChargerAdapter_shouldReturnAmericanCharger() {
        // 1. create european charger
        Charger europeanCharger = new EuropeanCharger();
        // 2. create expected charger
        Charger expectedAmericanCharger = new AmericanCharger();
        // 3. create tested adapter
        ChargerAdapter americanChargerAdapter = new AmericanChargerAdapter();

        // 4. american charger adapter test
        Charger actualAmericanCharger = americanChargerAdapter.adapt(europeanCharger);

        // 5. verify result
        Assert.assertEquals(expectedAmericanCharger.type(), actualAmericanCharger.type());
        Assert.assertEquals(expectedAmericanCharger.voltage(), actualAmericanCharger.voltage());
    }

    @Test
    public void testAmericanChargerAdapter_shouldReturnIncomingCharger() {
        // 1. create american charger
        // 2. create expected(american) charger
        Charger americanCharger = new AmericanCharger();
        // 3. create tested adapter
        ChargerAdapter americanChargeAdapter = new AmericanChargerAdapter();

        // 4. american charger adapter test
        Charger actualAmericanCharger = americanChargeAdapter.adapt(americanCharger);

        // 5. verify result
        Assert.assertEquals(americanCharger.type(), actualAmericanCharger.type());
        Assert.assertEquals(americanCharger.voltage(), actualAmericanCharger.voltage());
    }

    @Test
    public void testEuropeanChargerAdapter_shouldReturnIncomingCharger(){
        // 1. create european charger
        // 2. same
        Charger europeanCharger = new EuropeanCharger();
        // 3. create tested adapter
        ChargerAdapter europeanChargerAdapter = new EuropeanChargerAdapter();

        // 4. european charger adapter test
        Charger actualEuropeanCharger = europeanChargerAdapter.adapt(europeanCharger);

        // 5. verify result
        Assert.assertEquals(europeanCharger.type(), actualEuropeanCharger.type());
        Assert.assertEquals(europeanCharger.voltage(), actualEuropeanCharger.voltage());
    }

}
package task4.ivan.facade;

public class Main {
    public static void main(String... args){
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();

        GPSInterface gps = new GPSInterface(power, notifier, advisor);


//        power.powerOn();
//        notifier.downloadRoadInfo();
//        advisor.route();
//        Слишком много однотипных взаимодействий водителя с системой, которые можено заменить одним gps.activate();

        gps.activate();;
        power.powerOff();
    }
}

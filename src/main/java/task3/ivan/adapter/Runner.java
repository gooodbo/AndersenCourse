package task3.ivan.adapter;

public class Runner {
    private Road road;

    public Runner(){}

    public Runner(Road road){
        this.road = road;
    }

    public void runOnTheRoad() {
        System.out.println("Let's run");
        road.run();
        System.out.println("Finish");
    }
}

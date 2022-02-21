package task3.ivan.adapter;

public class IceRoadAdapter implements Road {
    private IceRoad road;

    public IceRoadAdapter() {
        road = new IceRoad();
    }

    public void run() {
        road.walk();
    }
}

package task3.ivan.adapter;

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner(new IceRoadAdapter());
        runner.runOnTheRoad();
    }
}

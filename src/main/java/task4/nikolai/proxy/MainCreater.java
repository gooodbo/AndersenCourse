package task4.nikolai.proxy;

import task4.nikolai.proxy.builders.Director;
import task4.nikolai.proxy.builders.SkateBuilder;
import task4.nikolai.proxy.builders.SnowboardBuilder;
import task4.nikolai.proxy.decks.SkateBoard;
import task4.nikolai.proxy.decks.Snowboard;


//Создатель досок, для создания объектов был использован паттерн строитель
public class MainCreater implements BoardsCreater {

    private Director director;

    public MainCreater() {
        this.director = new Director();
    }

    @Override
    public Snowboard takeSnowboard(String brand, String matrial, int inchlong, int width) {
        SnowboardBuilder snowboardBuilder = new SnowboardBuilder();
        director.createASnowboard(snowboardBuilder, matrial, inchlong, width);
        return snowboardBuilder.getResult();
    }

    @Override
    public SkateBoard takeSkateboard(String brand, String matrial,int numberOfWheels, int inchlong, int width) {
        SkateBuilder skateBuilder = new SkateBuilder();
        director.createASkateboard(skateBuilder, matrial, numberOfWheels, inchlong, width);
        return skateBuilder.getResult();
    }

}

package task4.nikolai.proxy_builder;

import task4.nikolai.proxy_builder.decks.SkateBoard;
import task4.nikolai.proxy_builder.decks.Snowboard;



//интерфейс выдающий доски
public interface BoardsCreater {

        Snowboard takeSnowboard(String brand, String matrial, int inchlong, int width);
        SkateBoard takeSkateboard(String brand, String matrial,int numberOfWheels, int inchlong, int widt);

}

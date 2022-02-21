package proxytests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task4.nikolai.proxy.BoardsCreater;
import task4.nikolai.proxy.LandingOfDecks;
import task4.nikolai.proxy.decks.SkateBoard;
import task4.nikolai.proxy.decks.Snowboard;

import java.util.ArrayList;
import java.util.List;

public class ProxyTest extends Assert {

    BoardsCreater landing = new LandingOfDecks();

    @Before
    public void addingBoards(){
        landing.takeSkateboard("unoin", "wood", 4, 31, 8);
        landing.takeSkateboard("unoin", "plastic", 2, 30, 7);
        landing.takeSkateboard("unoin", "wood", 4, 31, 7);
        landing.takeSkateboard("element", "wood", 4, 31, 8);
        landing.takeSkateboard("element", "plastic", 2, 30, 7);
        landing.takeSkateboard("element", "wood", 4, 31, 7);
        landing.takeSnowboard("burtan","steel", 80, 9);
        landing.takeSnowboard("burtan","plastic", 88, 7);
        landing.takeSnowboard("burtan","composite", 89, 7);
        landing.takeSnowboard("drake","steel", 85, 9);
        landing.takeSnowboard("drake","plastic", 90, 7);
        landing.takeSnowboard("drake","composite", 93, 7);
    }




    //Берем в аренду то что есть на складе дваждый. Должен вернуться один и тот же объект
    @Test
    public void equalsObject(){
        Snowboard snowboard = landing.takeSnowboard("burtan","steel", 80, 9);
        Snowboard snowboard1 = landing.takeSnowboard("burtan","steel", 80, 9);
        assertEquals(snowboard, snowboard1);
        assertEquals(snowboard.hashCode(), snowboard1.hashCode());
        SkateBoard skateBoard = landing.takeSkateboard("unoin", "wood", 4, 31, 8);
        SkateBoard skateBoard1 = landing.takeSkateboard("unoin", "wood", 4, 31, 8);
        assertEquals(snowboard, snowboard1);
        assertEquals(skateBoard.hashCode(), skateBoard1.hashCode());
    }

    //Берем то чего нет. Объект создается и созраняется . При последующем обращении будет выдан тот же объект , а не создатся новый.
    @Test
    public void equalsAddedObject(){
        Snowboard snowboard = landing.takeSnowboard("burtan","steel", 85, 10);
        Snowboard snowboard1 = landing.takeSnowboard("burtan","steel", 85, 10);
        assertEquals(snowboard, snowboard1);
        assertEquals(snowboard.hashCode(), snowboard1.hashCode());
        SkateBoard skateBoard = landing.takeSkateboard("footwork", "wood", 4, 31, 8);
        SkateBoard skateBoard1 = landing.takeSkateboard("footwork", "wood", 4, 31, 8);
        assertEquals(skateBoard1, skateBoard);
        assertEquals(skateBoard.hashCode(), skateBoard1.hashCode());
    }



}

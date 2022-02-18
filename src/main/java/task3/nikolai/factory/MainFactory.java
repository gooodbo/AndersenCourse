package task3.nikolai.factory;

import task3.nikolai.factory.factories.HoodieFactory;
import task3.nikolai.factory.factories.LongSleeveFactory;
import task3.nikolai.factory.factories.TshirtFactory;

import java.util.NoSuchElementException;

public class MainFactory {

    ClothFactory[] factories = new ClothFactory[3];


    public MainFactory() {
        factories[0] = new HoodieFactory();
        factories[1] = new LongSleeveFactory();
        factories[2] = new TshirtFactory();
    }

    public Clothes create(String typeOfClothes, String color){
        switch (typeOfClothes){
            case ("Hoodie"):
                return factories[0].createCloth(color);
            case ("LongSleeve"):
                return factories[1].createCloth(color);
            case ("Tshirt"):
                return factories[2].createCloth(color);
            default:
                System.out.println("Такое мы не производим");
        }
        throw new NoSuchElementException();
    }

}

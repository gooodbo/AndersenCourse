package task3.nikolai.factory.factories;

import task3.nikolai.factory.ClothFactory;
import task3.nikolai.factory.Clothes;
import task3.nikolai.factory.clothes.Hoodie;

public class HoodieFactory extends ClothFactory {



    @Override
    public Clothes createCloth(String color) {
        return new Hoodie(color);
    }
}

package task3.nikolai.factory.factories;

import task3.nikolai.factory.ClothFactory;
import task3.nikolai.factory.Clothes;
import task3.nikolai.factory.clothes.Hoodie;
import task3.nikolai.factory.clothes.Tshirt;

public class TshirtFactory extends ClothFactory {


    @Override
    public Clothes createCloth(String color) {
        return new Tshirt(color);
    }

}

package task3.nikolai.factory.clothes;

import task3.nikolai.factory.Clothes;

public class Hoodie implements Clothes {

    private String color;

    public Hoodie(String color) {
        this.color = color;
    }

    @Override
    public void created() {
        System.out.println("Произведен худак, цвет :" + color);
    }
}

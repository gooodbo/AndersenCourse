package task3.nikolai.factory.clothes;

import task3.nikolai.factory.Clothes;

public class Tshirt implements Clothes {

    private String color;

    public Tshirt(String color) {
        this.color = color;
    }


    @Override
    public void created() {
        System.out.println("Произведена тишка, цвет :" + color);
    }

}

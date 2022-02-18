package task3.nikolai.factory.clothes;

import task3.nikolai.factory.Clothes;

public class LongSleeve implements Clothes {

    private String color;

    public LongSleeve(String color) {
        this.color = color;
    }


    @Override
    public void created() {
        System.out.println("Произведен лонг, цвет : " + color);
    }
}

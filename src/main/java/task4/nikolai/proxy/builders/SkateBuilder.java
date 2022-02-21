package task4.nikolai.proxy.builders;

import task4.nikolai.proxy.decks.SkateBoard;

public class SkateBuilder implements BoardBuilder<SkateBoard> {

    private String material;
    private int wheels;
    private int inchLong;
    private int width;


    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setNumberOfWheels(int i) {
        this.wheels = i;
    }

    @Override
    public void setLong(int i) {
        this.inchLong = i;
    }

    @Override
    public void setWidth(int i) {
        this.width = i;
    }

    public SkateBoard getResult(){
        return new SkateBoard(material,wheels,inchLong,width);
    }


}

package task4.nikolai.proxy.builders;

import task4.nikolai.proxy.decks.Snowboard;

public class SnowboardBuilder implements BoardBuilder<Snowboard> {

    private String material;
    private int inchLong;
    private int width;


    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setNumberOfWheels(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setLong(int i) {
        this.inchLong = i;
    }

    @Override
    public void setWidth(int i) {
        this.width = i;
    }

    public Snowboard getResult(){
        return new Snowboard(material,inchLong,width);
    }


}

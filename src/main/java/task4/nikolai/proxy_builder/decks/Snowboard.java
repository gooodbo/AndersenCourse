package task4.nikolai.proxy_builder.decks;


//Создаваемые объекты
public class Snowboard{

    private String material;
    private int inchLong;
    private int inchWidth;


    public Snowboard(String material, int inchLong, int inchWidth) {
        this.material = material;
        this.inchLong = inchLong;
        this.inchWidth = inchWidth;
    }

    public void doTrick(){
        System.out.println("*sounds of doing trick");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getInchLong() {
        return inchLong;
    }

    public void setInchLong(int inchLong) {
        this.inchLong = inchLong;
    }

    public int getInchWidth() {
        return inchWidth;
    }

    public void setInchWidth(int inchWidth) {
        this.inchWidth = inchWidth;
    }
}

package task4.nikolai.proxy.decks;


//Создаваемые объекты
public class SkateBoard{

    private String material;
    private int nuberOfweels;
    private int inchLong;
    private int inchWidth;

    public SkateBoard(String material, int nuberOfweels, int inchLong, int inchWidth) {
        this.material = material;
        this.nuberOfweels = nuberOfweels;
        this.inchLong = inchLong;
        this.inchWidth = inchWidth;
    }

    public void doTrick(){
        System.out.println("flip");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNuberOfweels() {
        return nuberOfweels;
    }

    public void setNuberOfweels(int nuberOfweels) {
        this.nuberOfweels = nuberOfweels;
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

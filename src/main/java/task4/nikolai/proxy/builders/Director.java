package task4.nikolai.proxy.builders;


//Директор создателя досок
public class Director {

    public void createASkateboard(BoardBuilder builder, String matrial, int numberOfWheels, int inchlong, int width){
        builder.setMaterial(matrial);
        builder.setLong(inchlong);
        builder.setNumberOfWheels(numberOfWheels);
        builder.setWidth(width);
    }

    public void createASnowboard(BoardBuilder builder, String matrial, int inchlong, int width){
        builder.setMaterial(matrial);
        builder.setLong(inchlong);
        builder.setWidth(width);
    }

}

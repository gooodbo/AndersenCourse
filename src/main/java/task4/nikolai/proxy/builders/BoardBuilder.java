package task4.nikolai.proxy.builders;

//Интерфейс строителя досок
public interface BoardBuilder<T> {


    void setMaterial(String material);
    void setNumberOfWheels(int i);
    void setLong(int i);
    void setWidth(int i);
    T getResult();

}

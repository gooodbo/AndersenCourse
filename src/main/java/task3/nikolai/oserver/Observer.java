package task3.nikolai.oserver;

public interface Observer {

    void addListner(Listner listner);
    void deleteListner(Listner listner);
    void notifyListner(int i);

}

package task3.nikolai.oserver;

import java.util.ArrayList;

public class ObserveredArray implements Observer{

    ArrayList<Listner> listnerArrayList;
    ArrayList<Integer> array;

    public ObserveredArray() {
        this.listnerArrayList = new ArrayList<Listner>();
        this.array = new ArrayList<Integer>();
    }

    public void addNumber(int i){
        this.array.add(i);
        notifyListner(i);
    }


    @Override
    public void addListner(Listner listner) {
        this.listnerArrayList.add(listner);
    }

    @Override
    public void deleteListner(Listner listner) {
        this.listnerArrayList.remove(listner);
    }

    @Override
    public void notifyListner(int i) {
        for (Listner l : listnerArrayList){
            l.handle(i);
        }
    }


}

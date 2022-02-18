package task3.nikolai.oserver.listners;

import task3.nikolai.oserver.Listner;

import java.util.ArrayList;

public class EvenNumbersListner implements Listner {

    ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    public void handle(int i) {
        if ( i % 2 == 0){
            System.out.println("В массив было добавлено четное чилсло");
        }
        arrayList.add(i);
    }

    @Override
    public String stateOfArray() {
        return arrayList.toString();
    }


}

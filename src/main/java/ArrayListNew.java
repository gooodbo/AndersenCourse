import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListNew<T> implements MyArrayList<T>{

    private static final int DEFAULT_SIZE = 5;

    private T[] array;

    private int size;


    public ArrayListNew() {
        this.array = (T[]) new Object[0];
        this.size = 0;
    }

    @Override
    public void add(T t) {

    }



    @Override
    public void add(T t, int index) {

    }

    @Override
    public void sort(Comparator<T> comparator) {

    }

    @Override
    public void concat(MyArrayList<T> newList) {

    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

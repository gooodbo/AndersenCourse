import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ArrayListNew<T> implements MyArrayList<T> {

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
    public void addAll(Collection<T> c) {

    }

    @Override
    public void sort(Comparator<T> comparator) {

    }

    @Override
    public void concat(MyArrayList<T> newList) {

    }

    @Override
    public boolean delete(int index) {
        try {
            T[] newArray = array;
            array = (T[]) new Object[newArray.length - 1];
            System.arraycopy(newArray, 0, array, 0, index);
            System.arraycopy(newArray, index + 1, array, index, newArray.length - index - 1);
            size--;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public boolean deleteAll(Collection<T> c) {
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

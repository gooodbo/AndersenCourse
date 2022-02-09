import java.util.Collection;
import java.util.Comparator;

public interface MyArrayList<T> {
    void add(T t);

    void add(T t, int index);

    void addAll(Collection<T> c);

    void sort(Comparator<T> comparator);

    void concat(MyArrayList<T> newList);

    boolean delete(int index);

    boolean delete(Object o);

    boolean deleteAll(Collection<T> c)
            ;

    T get(int index);

    int size();


}

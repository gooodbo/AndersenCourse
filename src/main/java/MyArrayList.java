public interface MyArrayList<T> {
    void add(T t);

    void add(T t, int index);

    void sort();

    void concat(MyArrayList<T> newList);

    boolean delete(int index);

    T get(int index);

    int size();


}

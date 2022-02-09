import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ArrayListNew<T> implements MyArrayList<T>{

    private static final int DEFAULT_SIZE = 5;

    private T[] array;

    private int size;


    public ArrayListNew() {
        this.array = (T[]) new Object[0];
        this.size = 0;
    }

    //Добавляем в конец списка
    @Override
    public void add(T t) {
        if (array.length == size){
            this.array = growAndCopy(array);
        }
        array[size] = t;
        size++;
    }

    //Увеличиваем массив, если закончился
    private T[] growAndCopy(T[] original){
        T[] newArray = (T[]) new Object[array.length + DEFAULT_SIZE];
        for (int i = 0; i < original.length ; i++){
            newArray[i] = original[i];
        }
        return newArray;
    }
    //Увеличиваем массив если закончился и добавляем новый элемент
    private T[] growAndCopyAndPaste(T[] original, int index, T t){
        T[] newArray = (T[]) new Object[array.length + DEFAULT_SIZE];
        for (int i = 0; i < index; i++){
            newArray[i] = original[i];
        }
        newArray[index] = t;
        for (int i = index + 1; i < size + 1; i++){
            newArray[i] = original[i-1];
        }
        return newArray;
    }

    //Если массив еще не закончился просто вставляем элемент
    private void insertByIndex(int index, T[] array, T t){
        for (int i = size ; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = t;
    }

    //Вставляем элемент по индексу
    @Override
    public void add(T t, int index) {
        if (index > size) throw new ArrayIndexOutOfBoundsException();
        if (array.length == size){
            this.array = growAndCopyAndPaste(array, index, t);
            return;
        }
        insertByIndex(index, array, t);
        size++;
    }
    //Обязательное условие работы алгоритма что компаратор возвращает 1 если (о1 > o2)
    // и -1 если (o1 < o2) , при o1 == o2 возвращаем 0
    @Override
    public void sort(Comparator<T> comparator) {
        quickSort(array, 0, size - 1, comparator);
    }

    //Алгоритм быстрой сортировки, такой же используется в классе Arrays.sort()
    private void quickSort(T[] source, int leftBorder, int rightBorder, Comparator<T> comparator) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        T pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot source[leftMarker] < pivot;
            while (comparator.compare(source[leftMarker], pivot) == -1) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot source[rightMarker] > pivot
            while (comparator.compare(source[rightMarker], pivot) == 1) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    T tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder, comparator);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker, comparator);
        }
    }

    @Override
    public void concat(Collection<T> newList) {

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
        return size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (size == 0) return "[]";
        sb.append("[");
        for (int i = 0; i < size - 1; i++){
            sb.append(array[i].toString() + ", ");
        }
        sb.append(array[size - 1] + "]");
        return sb.toString();
    }
}

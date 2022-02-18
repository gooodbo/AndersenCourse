package task1;

import java.util.*;

public class ArrayListNew<T> implements MyArrayList<T> {

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
        if (array.length == size) {
            this.array = growAndCopy(array, 0);
        }
          array[size] = t;
          size++;
    }

    //Увеличиваем массив, если закончился
    private T[] growAndCopy(T[] original, int number) {
        T[] newArray = (T[]) new Object[array.length + DEFAULT_SIZE + number];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

    //Увеличиваем массив если закончился и добавляем новый элемент
    private T[] growAndCopyAndPaste(T[] original, int index, T t) {
        T[] newArray = (T[]) new Object[array.length + DEFAULT_SIZE];
        for (int i = 0; i < index; i++) {
            newArray[i] = original[i];
        }
        newArray[index] = t;
        for (int i = index + 1; i < size + 1; i++) {
            newArray[i] = original[i - 1];
        }
        return newArray;
    }

    //Если массив еще не закончился просто вставляем элемент
    private void insertByIndex(int index, T[] array, T t) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = t;
    }

    //Вставляем элемент по индексу
    @Override
    public void add(T t, int index) {
        if (index > size || index < 0 ) throw new ArrayIndexOutOfBoundsException();
        if (array.length == size) {
            this.array = growAndCopyAndPaste(array, index, t);
            return;
        }
        insertByIndex(index, array, t);
        size++;
    }

    @Override
    public void addAll(Collection<T> c) {

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

    //Итерируемся по переданной коллекции и добавляем элеметы в массив. Если масив переполнен , слздаем новый и копируем туда старый.
    @Override
    public void concat(Collection<T> newList) {
        if (newList.size() > array.length) {
            this.array = growAndCopy(array, newList.size());
            for (T t : newList) {
                array[size] = t;
                size++;
            }
            return;
        }
        for (T t : newList) {

            array[size] = t;
            size++;
        }
    }


    public void concat(ArrayListNew<T> newList) {
        if (newList.size() > array.length) {
            this.array = growAndCopy(array, newList.size());
            for (int i = 0; i < newList.size; i++) {
                array[size] = newList.get(i);
                size++;
            }
            return;
        }
        for (int i = 0; i < newList.size; i++) {
            array[size] = newList.get(i);
            size++;
        }
    }

    //создаём новый массив на 1 элемент меньше в главную переменную, а данные из неё в новую переносим
    //копируем данные до индекса и после него в пустой массив
    @Override
    public boolean delete(int index) {
        if (index >= size || index < 0 ) throw new ArrayIndexOutOfBoundsException();
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

    //проходим по массиву и ищем наш элемент и отправляем его в метод delete
    @Override
    public boolean delete(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delete(i);
                break;
            }
        }

        return true;
    }

    //тут тоже все просто, каждый элемент коллекции отправляем в delete(o) и там он удаляет объекты, если они есть
    @Override
    public boolean deleteAll(Collection<T> c) {
        for (T t : c) {
            delete(t);
        }
        return true;
    }

    @Override
    public T get(int index) {
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }


    @Override
    public int size() {
        return size;
    }

    //Removes all elements from list
    @Override
    public void clear() {
        Object[] data = array;
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    //This method goes through the list and returns the index of the impacted
    // element or -1 if there wasn't such element
    @Override
    public int indexOf(Object o) {
        Object[] data = array;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(data[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Return true if List is empty and false if doesn't empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != null && array[i].equals(o)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size == 0) return "[]";
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i].toString() + ", ");
        }
        sb.append(array[size - 1] + "]");
        return sb.toString();
    }
}

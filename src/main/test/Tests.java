import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests extends Assert {

    private ArrayList<Integer> originalArrayList = new ArrayList<>();
    private ArrayListNew<Integer> myArrayList = new ArrayListNew<>();

    @Before
    public void  addingElements() {
        originalArrayList.addAll(List.of(1, 5, 8, 185, 361, 478, 78, 15, 6, 7, 12, 1, 68, 78));
        myArrayList.concat(List.of(1, 5, 8, 185, 361, 478, 78, 15, 6, 7, 12, 1, 68, 78));
    }

    @Test
    public void sizeText() {
        assertEquals(originalArrayList.size(), myArrayList.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getOutOfBound(){
        myArrayList.get(myArrayList.size());
    }

    @Test
    public void SortAndToString(){
        originalArrayList.sort(Integer::compareTo);
        myArrayList.sort(Integer::compareTo);
        assertEquals(originalArrayList.toString(), myArrayList.toString());
    }

    @Test
    public void getIndexOfObject(){
        assertEquals(originalArrayList.indexOf(15), myArrayList.indexOf(15));
    }

    @Test
    public void remove(){
        originalArrayList.remove(1);
        myArrayList.delete(1);
        originalArrayList.remove(5);
        myArrayList.delete(5);
        assertEquals(originalArrayList.toString(), myArrayList.toString());
        originalArrayList.removeAll(List.of(1, 5, 8, 185, 361, 478));
        myArrayList.deleteAll(List.of(1, 5, 8, 185, 361, 478));
        assertEquals(originalArrayList.toString(), myArrayList.toString());
    }


    @Test
    public void get(){
        assertEquals(originalArrayList.get(5), myArrayList.get(5));
    }

    @Test
    public void contains(){
        assertEquals(originalArrayList.contains(85), myArrayList.contains(85));
        assertEquals(originalArrayList.contains(78), myArrayList.contains(78));
    }

    @Test
    public void addByIndex(){
        myArrayList.add(10, 5);
        assertEquals(10, (int) myArrayList.get(5));
        myArrayList.add(15, 8);
        assertEquals(15, (int) myArrayList.get(8));
    }

    @Test
    public void clear(){
        originalArrayList.clear();
        myArrayList.clear();
        assertEquals(originalArrayList.size(), myArrayList.size());
    }

}

package observertest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task3.nikolai.oserver.ObserveredArray;
import task3.nikolai.oserver.listners.EvenNumbersListner;
import task3.nikolai.oserver.listners.OddNumbersListner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ObserverTest extends Assert {


    private ObserveredArray observeredArray = new ObserveredArray();

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
        observeredArray.addListner(new EvenNumbersListner());
        observeredArray.addListner(new OddNumbersListner());
    }


    @Test
    public void oddNumbersText1(){
        observeredArray.addNumber(1);
        assertEquals("В массив было добавлено нечетное чилсло", output.toString().split("\r")[0]);
    }

    @Test
    public void oddNumbersText2(){
        observeredArray.addNumber(2);
        assertNotEquals("В массив было добавлено нечетное чилсло", output.toString().split("\r")[0]);
    }

    @Test
    public void EvenNumbersText(){
        observeredArray.addNumber(2);
        assertEquals("В массив было добавлено четное чилсло", output.toString().split("\r")[0]);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}

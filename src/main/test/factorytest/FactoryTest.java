package factorytest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task3.nikolai.factory.MainFactory;
import task3.nikolai.factory.clothes.Hoodie;
import task3.nikolai.factory.clothes.LongSleeve;
import task3.nikolai.factory.clothes.Tshirt;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;


public class FactoryTest extends Assert {

    private MainFactory mainFactory= new MainFactory();

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }


    @Test
    public void TypeTest(){
        assertEquals(Hoodie.class, mainFactory.create("Hoodie", "Red").getClass());
        assertEquals(LongSleeve.class, mainFactory.create("LongSleeve", "Red").getClass());
        assertEquals(Tshirt.class, mainFactory.create("Tshirt", "Red").getClass());
    }

    @Test
    public void createdMethodTest(){
        mainFactory.create("LongSleeve", "Red").created();
        assertEquals("Произведен лонг, цвет : Red", output.toString().split("\r")[0]);
    }

    @Test
    public void differentClothesTest(){
        assertNotEquals(mainFactory.create("Tshirt", "Brown"), mainFactory.create("Tshirt", "Red"));
    }

    @Test(expected = NoSuchElementException.class)
    public void cantCreateThisClotheTest(){
        mainFactory.create("Шапка", "Коричневая");
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}

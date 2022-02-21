package decoratortests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task4.nikolai.decorator.Additor;
import task4.nikolai.decorator.LoggedAdditor;
import task4.nikolai.decorator.SimpleAdditor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class DecoratorTest extends Assert {



    @Test
    public void additionTest(){
        Additor additor = new SimpleAdditor();
        assertEquals(10, additor.sum(5,5));
    }


    @Test
    public void logsTest(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Additor additor = new LoggedAdditor(new SimpleAdditor());
        int a = 5;
        int b = 5;
        assertEquals(a + b ,additor.sum(a, b));
        assertEquals("Время : " + new Date() + " ;\nСкладываемые числа: " + a + ", " + b +";", output.toString().split("\r")[0]);
    }
}

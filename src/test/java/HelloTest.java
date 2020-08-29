import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Before
    public void beforeTestDo(){
        System.out.println("Antes del Test");
    }

    @Test
    public void testGetHello(){
        System.out.println("Durante el Test");
        assertEquals("Hello Mundito", new Hello().getHello());

    }

    @After
    public  void afterTestDo(){
        System.out.println("Despues de Test");
    }
}

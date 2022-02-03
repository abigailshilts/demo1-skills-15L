import static org.junit.Assert.*;
import org.junit.*;

public class TestDemoClass {
    private DemoClass test1;

    @Before
    public void setUp(){
        test1 = new DemoClass();
    }

    @Test
    public void testAddToY(){
        test1.addToY(4);
        assertEquals(test1.x, 4);
    }
}

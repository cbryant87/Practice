import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chris on 3/9/2018.
 */
class mathTestTest extends mathTest {
//    @BeforeEach
//    void setUp() {
//        double a = 4.0;
//        double b = 5.0;
//    }
    @Test
    void testMultiply()
    {
        double a = 4.0;
        double b = 5.0;

        double expected = 20.0;
        double actualResult =  multiply(a,b);

        assertEquals(expected,actualResult);//expected goes first result next. Testing that the multiply method is
    }
    @Test
    void  testAdd()
    {
        int a = 5;
        int b = 10;

        int expected = 15;
        int actual = add(a,b);

        assertEquals(expected,actual);
    }
    @AfterEach
    void tearDown() {
    }

}
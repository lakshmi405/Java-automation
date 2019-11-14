package keyprocesser;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyprocesserTest extends BaseTest {
    @Test
    public void testInputfield(){
        var input=homePage.keyProcessers();
        input.verfyKey("A"+ Keys.SPACE);
        assertEquals(input.getResult(),"You entered: SPACE");

    }
    @Test
    public  void testEnterpi(){
         var pi=homePage.keyProcessers();
         pi.enterPi();
    }

}

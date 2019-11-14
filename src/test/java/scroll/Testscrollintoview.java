package scroll;

import base.BaseTest;
import org.testng.annotations.Test;

public class Testscrollintoview extends BaseTest {
    @Test
    public void testForScrolling(){
        var scroll=homePage.Scrollings();
        scroll.scrollmethod();
    }

}

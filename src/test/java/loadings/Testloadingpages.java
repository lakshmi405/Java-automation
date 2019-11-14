package loadings;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testloadingpages extends BaseTest {
    @Test
    public void testloadings(){
         var load=homePage.loadingsMethod();
         load.clickLoading();
         load.clickStart();
        Assert.assertEquals(load.gettext(),"Hello World!","in-correct");
    }
}

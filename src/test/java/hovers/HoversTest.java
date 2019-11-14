package hovers;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTest extends BaseTest {
    @Test
    public void testHoverUser1()
    {
        var hoversPage=homePage.hoversLink();
       var  caption=hoversPage.mouseOverActions(1);
       assertTrue(caption.isCaptionDisplyed(),"Caption is not displying");
       assertEquals(caption.getTitle(),"name: user1","Title is incorrect");
       assertEquals(caption.getlinkText(),"View profile","caption link text is incorrect");
       assertTrue(caption.getLink().endsWith("/users/1"),"caption link text is not ending with users1");

    }

}

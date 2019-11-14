package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testFrame extends BaseTest {
    @Test
    public void testFramepage(){
       var test= homePage.frames();
       var test1=test.iframeMethod();
       test1.clearText();
       test1.enterText("hello world");
       test1.clickIncreaseIndent();

        Assert.assertEquals(test1.getTextMethod(),"hello world","incorrect");

    }
    @Test
    public void testNestedFrames(){
       var nested= homePage.frames();
      var nested_frames= nested.nestedframeMethod();
      var data=nested_frames.getTextframe1();
      var data2=nested_frames.getTestframe2();
      System.out.println(data+data2);

    }
}

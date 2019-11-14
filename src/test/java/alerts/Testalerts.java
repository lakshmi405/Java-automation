package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testalerts extends BaseTest {
    @Test
    public void testAlertsMethod(){
         var firstalert=homePage.Alerts();
         firstalert.firstClick(1);
         firstalert.acceptAlert();

        Assert.assertEquals(firstalert.testMethod(),"You successfuly clicked an alert","not handled");
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void testSecondAlert(){
       var second=homePage.Alerts();
       second.secondClick();
       second.rejectAlert();
    }
    @Test
    public void testThirdalert(){
        var third=homePage.Alerts();
        third.thirdAlert();
        String text="this third alert";
        third.enterData(text);
        third.acceptAlert();
        Assert.assertEquals(third.testMethod(),"You entered: this third alert","ncorrect");


    }


    /*@Test
    public void testSecondAlert(){

        var secondalert=homePage.Alerts();
        secondalert.firstClick(2);
        secondalert.acceptAlert();

        Assert.assertEquals(secondalert.testMethod(),"You clicked: Ok","not handled");
    }*/
}

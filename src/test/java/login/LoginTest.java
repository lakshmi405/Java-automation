package login;

import base.BaseTest;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SourcePage;

import java.util.Collections;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
     public   void successFulLogin(){
        LoginPage loginpage = homePage.clickAuthenticationForm();
        loginpage.setUserName("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SourcePage sourcepage=loginpage.clickButton();

       /* assertEquals((sourcepage.alertText()
                "You logged into a secure area!",
                "Alert text is incorrect"));*/


}
}

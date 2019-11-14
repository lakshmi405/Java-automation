package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;
    private By key= By.id("target");
    private By non_alphabit=By.id("result");
    public KeyPresses(WebDriver driver){
        this.driver=driver;
    }
    public void  verfyKey(String text){

    driver.findElement(key).sendKeys(text);

    }
    public   void enterPi(){

        verfyKey(Keys.chord(Keys.ALT,"p")+"=3.14");
    }
    public String   getResult()
    {
       return driver.findElement(non_alphabit).getText();
    }


}

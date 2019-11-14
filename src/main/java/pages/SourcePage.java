package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SourcePage {

    private WebDriver driver;
    private By textMsg= By.id("flash");

    public SourcePage(WebDriver driver){
        this.driver=driver;
    }
    public  void alertText(){
       String Text = driver.findElement(textMsg).getText();
       System.out.println(Text);

    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframepage {
    private WebDriver driver;
  private String iframeid="mce_0_ifr";
  private By bodyid= By.id("tinymce");
  private By inceaseindentbutton=By.cssSelector("#mceu_12 button");
 //private By inceaseindentbutton=By.cssSelector("[class='mce-ico mce-i-indent']");

    public Iframepage(WebDriver driver){
        this.driver=driver;
    }
    public void switchFrame(){
        driver.switchTo().frame(iframeid);
    }
    public void clearText(){
        switchFrame();
        driver.findElement(bodyid).clear();
        switchMainPage();

    }
    public void switchMainPage(){
        driver.switchTo().parentFrame();
    }
    public String enterText( String text){
        switchFrame();
        driver.findElement(bodyid).sendKeys(text);
        switchMainPage();
        return text;
    }
    public void clickIncreaseIndent(){
        driver.findElement(inceaseindentbutton).click();
    }
    public String   getTextMethod(){
        switchFrame();
       String Actual= driver.findElement(bodyid).getText();
       switchMainPage();
       return Actual;


    }

}

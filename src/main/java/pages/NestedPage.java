package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedPage {
    private WebDriver driver;
    String top_frame="frame-top";
    String left_frame="frame-left";
    String bottom_frame="frame-bottom";
    private By body=By.tagName("body");
   // private By leftBodyText = By.cssSelector("body");

    public NestedPage(WebDriver driver){
        this.driver=driver;
    }
    public void switchLeftFrame(){
       driver.switchTo().frame(top_frame);
       driver.switchTo().frame(left_frame);
    }
    public String getTextframe1(){
        switchLeftFrame();
        String frame1_text=driver.findElement(body).getText();
        System.out.println(frame1_text);
                driver.switchTo().parentFrame();
                driver.switchTo().parentFrame();
                return frame1_text;
    }
    public void switchBottomframe(){
        driver.switchTo().frame(bottom_frame);



    }
    public String getTestframe2(){
        switchBottomframe();
        String frame2_text=driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return frame2_text;
    }


}

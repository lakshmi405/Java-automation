package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framepage {
    private WebDriver driver;
    private By frame1= By.linkText("iFrame");
    private By frame2=By.linkText("Nested Frames");

    public Framepage(WebDriver driver){
        this.driver=driver;
    }
    public Iframepage iframeMethod(){
        driver.findElement(frame1).click();
        return  new Iframepage(driver);

    }
    public  NestedPage nestedframeMethod(){
        driver.findElement(frame2).click();
        return new NestedPage(driver);



    }

}

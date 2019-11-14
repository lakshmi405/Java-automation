package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Multiplewindows {
    private WebDriver driver;
  private By window1= By.linkText("Click Here");
    public Multiplewindows(WebDriver driver) {
        this.driver=driver;
    }
    public void windows(){
        driver.findElement(window1).click();
        var windows_no=driver.getWindowHandles();
        System.out.println("Number of tabs ="+ windows_no.size());
        System.out.println();
    }


}

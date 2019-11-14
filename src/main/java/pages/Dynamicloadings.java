package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicloadings {
    private WebDriver driver;
    private By first_loading= By.linkText("Example 1: Element on page that is hidden");
    private By loading=By.id("loading");
    private By start=By.cssSelector("#start button");
    private By loadedtext=By.id("finish");


    public Dynamicloadings(WebDriver driver){
        this.driver=driver;
    }
public void clickLoading(){
        driver.findElement(first_loading).click();


}
public void clickStart(){
    driver.findElement(start).click();
    WebDriverWait wait = new WebDriverWait(driver,5);
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
}
public String gettext(){
    String text=driver.findElement(loadedtext).getText();
    return text;
}

}

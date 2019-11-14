package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {
    private WebDriver driver;
    private  By onclick= By.tagName("button");
private By onclick2= new By.ByXPath("//*[@class='example']//*[text()='Click for JS Confirm']");
private By onclick3=new By.ByXPath("//*[@class='example']//*[text()='Click for JS Prompt']");
    private By result=By.id("result");
    public AlertsPage( WebDriver driver){
        this.driver=driver;
    }
public void firstClick(int Index){

        WebElement  First=driver.findElements(onclick).get(Index-1);
        First.click();

}
public void secondClick(){
        driver.findElement(onclick2).click();
}
public void acceptAlert(){
    driver.switchTo().alert().accept();
}
public  String testMethod(){

        return  driver.findElement(result).getText();

}
public void rejectAlert(){
        driver.switchTo().alert().dismiss();
}
public void thirdAlert(){
        WebElement text_field=driver.findElement(onclick3);
        text_field.click();

}
public void  enterData(String text){
        driver.switchTo().alert().sendKeys(text);
}
}

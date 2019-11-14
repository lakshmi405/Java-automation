package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest1 {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resoures1/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
       // driver.manage().window().setSize(new Dimension(375, 812));
         List< WebElement> links=driver.findElements(By.tagName("a"));
         System.out.println(links.size());
        WebElement inputs=driver.findElement(By.linkText("Inputs"));
         inputs.click();

        System.out.println(driver.getTitle());
        System.out.println("kjsfnjkfh");
        driver.quit();

    }
    public static void main(String args []){

        BaseTest1 test=new BaseTest1();
        test.setUp();


}
}
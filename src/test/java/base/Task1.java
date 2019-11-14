package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.List;

public class Task1 {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resoures1/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //------------------------- Task1---------------------------------//
     /*   driver.manage().window().setSize(new Dimension(375, 812));
       WebElement content=driver.findElement(By.linkText("Shifting Content"));
       content.click();
       driver.findElement(By.linkText("Example 1: Menu Element")).click();
       List <WebElement> box=driver.findElements(By.tagName("li"));
       System.out.println(box.size());
       System.out.println("task1");
       //--------------------completed----------------------------------//
      //-------------------------------- Task2---------------------------//
       driver.findElement(By.linkText("Horizontal Slider")).click();
        WebElement slider=driver.findElement(By.tagName("input"));
        slider.sendKeys(Keys.chord(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT));
        WebElement range=driver.findElement(By.id("range"));
        Assert.assertTrue(Boolean.parseBoolean(range.getText()),"4");
        Assert.assertEquals(range.getText(),"4","range is in correct");*/
      //----------------Completed------------------------------//
      //-------------------Task3------------------------------//
        driver.findElement(By.linkText("Context Menu")).click();
        WebElement rightclick=driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightclick).perform();
        String s=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(s,"You selected a context menu","not correct");
        //----------------------completed----------------------//
        //driver.quit();

    }
    public static void main(String args []){

        Task1 test=new Task1();
        test.setUp();


    }
}

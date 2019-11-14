package base;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.ow2.util.file.FileUtils;
import org.ow2.util.file.FileUtilsException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.Eventreporter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTest {
    protected EventFiringWebDriver driver;
    protected HomePage homePage;
@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resoures1/chromedriver.exe");
        driver= new EventFiringWebDriver (new ChromeDriver());
        driver.register(new Eventreporter());
        goHome();
    homePage = new HomePage(driver);
    }
    @BeforeMethod
            public void  goHome(){
        driver.get("https://the-internet.herokuapp.com/");


    }
    @AfterClass
    public void quitMethod(){
        driver.quit();
    }
    @AfterMethod
    public  void failedTestScreenShot(ITestResult result){
    if(ITestResult.FAILURE==result.getStatus()) {

        try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            String newFile = "C://Users//naresh.kumar//IdeaProjects//webdriver_java//resources//test.png";
            FileUtils.copyFile(SrcFile, new File("C://Users//naresh.kumar//IdeaProjects//webdriver_java//resources//"+result.getName()+"test.png"));
        } catch (FileUtilsException e) {
            e.printStackTrace();
        }
    }


    }
}



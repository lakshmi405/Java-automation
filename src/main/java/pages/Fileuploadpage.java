package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fileuploadpage {
    private WebDriver driver;
    private By upload= By.id("file-upload");
    private By button=By.id("file-submit");
    private By uploadedpage=By.id("uploaded-files");

    public Fileuploadpage(WebDriver driver){
        this.driver=driver;
    }
    public void selectFile( String absalutepath){
        driver.findElement(upload).sendKeys(absalutepath);
        driver.findElement(button).click();
    }
    public String uploadedFile(){
        driver.findElement(uploadedpage).getText();
        return null;
    }

}

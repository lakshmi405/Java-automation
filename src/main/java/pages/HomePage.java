package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
       private WebDriver driver;
    private    By form_authentication= By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public  LoginPage clickAuthenticationForm(){

        clickLink("Form Authentication");
        return  new LoginPage(driver);
    }
    public DropdownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage hoversLink(){
        clickLink("Hovers");
        return new HoversPage(driver);

    }
    public KeyPresses keyProcessers(){
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }
    public AlertsPage Alerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public Fileuploadpage  fileuploadMathod(){
        clickLink("File Upload");
        return new Fileuploadpage(driver);
    }
    public Framepage frames(){
        clickLink("Frames");
        return  new  Framepage(driver);

    }
    public Dynamicloadings loadingsMethod(){
        clickLink("Dynamic Loading");
        return new Dynamicloadings(driver);

    }
    public ScrollintoView Scrollings(){
        clickLink("Large & Deep DOM");
        return new ScrollintoView(driver);
    }
    public ScrollintoView infinateScrolling(){
        clickLink("Infinite Scroll");
        return new ScrollintoView(driver);
    }
    public Multiplewindows multiplewindowsMethod(){
        clickLink("Multiple Windows");
        return new Multiplewindows(driver);

    }
private void clickLink(String linkTest){
        driver.findElement(By.linkText(linkTest)).click();
}
}

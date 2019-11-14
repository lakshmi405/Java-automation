package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollintoView {
    private  WebDriver driver;
    private By table=By.id("large-table");
    private By infinit=By.className("jscroll-added");
    public ScrollintoView(WebDriver driver){
        this.driver=driver;
    }
    public void scrollmethod(){
        WebElement tableElement=driver.findElement(table);
        String  script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script,tableElement);

    }
    public void infinitScroll( ){



    }



}

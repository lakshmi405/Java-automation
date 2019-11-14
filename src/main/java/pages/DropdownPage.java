package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private  WebDriver driver;
    private By dropdown= By.id("dropdown");
    public DropdownPage(WebDriver driver)
    {
        this .driver=driver;
    }
    public  void SelectDropdown(String option){
      findDropdownElement().selectByVisibleText(option);
    }
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElemnts=
        findDropdownElement().getAllSelectedOptions();
        return selectedElemnts.stream().map(e->e.getText()).
                collect(Collectors.toList());
    }
}

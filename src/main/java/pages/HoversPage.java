package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox= By.className("figure");
    private By boxCaption=By.className("figcaption");
    public HoversPage(WebDriver driver){

        this.driver=driver;
    }
    public FigurCaption mouseOverActions(int index){
   WebElement figure= driver.findElements(figureBox).get(index-1);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
        return  new FigurCaption(figure.findElement(boxCaption));

    }
    public class FigurCaption{
        private WebElement caption;
        private By header=By.tagName("h5");
        private By headerinner=By.tagName("a");
        public FigurCaption(WebElement caption){
            this.caption=caption;
        }
public boolean isCaptionDisplyed(){
            return caption.isDisplayed();

}
public String getTitle(){
            return caption.findElement(header).getText();
}
public String getLink()
{
    return caption.findElement(headerinner).getAttribute("href");
}
public String getlinkText(){
            return caption.findElement(headerinner).getText();
}
    }
}

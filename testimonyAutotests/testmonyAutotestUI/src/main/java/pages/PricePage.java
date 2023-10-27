package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricePage extends Element{
    private By backButton = By.xpath("//*[@id='back_button']");

    public PricePage(WebDriver driver) {
        super(driver); //обращаемся к конструктору родительского класса
    }


    public void clickBackButton(){
        click(driver.findElement(backButton));
    }
}

package guru99_insuranceProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class accountRegistration extends BasePage{

    @FindBy(id = "user_title")
    private WebElement chooseTitle;


    public void chooseTitle(String title){
        Select select= new Select(chooseTitle);
        select.selectByVisibleText(title);
    }
}

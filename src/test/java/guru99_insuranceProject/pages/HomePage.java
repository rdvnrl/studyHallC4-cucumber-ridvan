package guru99_insuranceProject.pages;

import guru99_insuranceProject.util.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[.='Register']")
    private WebElement registerButton;


    public void clickOnRegister(){
        CommonUtils.clickWithWait(registerButton);
    }
}

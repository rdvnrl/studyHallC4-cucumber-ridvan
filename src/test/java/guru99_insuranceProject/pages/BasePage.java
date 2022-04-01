package guru99_insuranceProject.pages;


import guru99_insuranceProject.util.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}

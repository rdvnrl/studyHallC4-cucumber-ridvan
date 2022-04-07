package guru99_insuranceProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class accountRegistration extends BasePage{

    @FindBy(id = "user_title")
    private WebElement chooseTitle;
    @FindBy(id = "user_firstname")
    private WebElement firstname;
    @FindBy (xpath = "//input[@name='lastname']")
    private WebElement lastName;
    @FindBy (name = "phone")
    private WebElement phoneNumber;
    @FindBy(xpath = "//select[contains(@id, 'user_dateofbirth_1')]")
    private WebElement dateOfBirthYear;
    @FindBy(xpath = "//select[contains(@id, 'user_dateofbirth_2')]")
    private WebElement dateOfBirthMonth;
    @FindBy(xpath = "//select[contains(@id, 'user_dateofbirth_3')]")
    private WebElement dateOfBirthDay;
    @FindBy(xpath = "//input[contains(@id, 'licencetype_')]")
    private  List<WebElement> licenceType;
    @FindBy(id = "user_licenceperiod")
    private WebElement licencePeriod;
    @FindBy(id = "user_user_detail_attributes_email")
    private WebElement emailBox;
    @FindBy(xpath = "/input[@type='password']")
    private WebElement passwordBox;
    @FindBy(name = "c_password")
    private WebElement confirmPasswordBox;

    public void setCreateButton() {
      createButton.click();
    }

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement createButton;

    public void setFirstName(String firstName) {
        firstname.sendKeys(firstName);
    }

    public void setLastName(String lastname) {
       lastName.sendKeys(lastname);
    }

    public void setPhoneNumber(String phonenumber) {
        phoneNumber.sendKeys(phonenumber);
    }

    public void setDateOfBirthYear(String year) {
       Select select = new Select(dateOfBirthYear);
       select.selectByVisibleText(year);
    }

    public void setDateOfBirthMonth(String month) {
        Select select = new Select(dateOfBirthMonth);
        select.selectByVisibleText(month);
    }

    public void setDateOfBirthDay(String day) {
        Select select = new Select(dateOfBirthDay);
        select.selectByVisibleText(day);
    }

    public void setLicenceType(String licencetype) {
        for (WebElement each : licenceType){
            if (each.getAttribute("value").contains(licencetype)){
                each.click();
            }
        }
    }

    public void setLicencePeriod(String licenceperiod) {
        Select select = new Select(licencePeriod);
        select.selectByVisibleText(licenceperiod);
    }

    public void setEmailBox(String emailbox) {
        emailBox.sendKeys(emailbox);
    }

    public void setPasswordBox(String passwordbox) {
        passwordBox.sendKeys(passwordbox);
    }

    public void setConfirmPasswordBox(String confirmpasswordBox) {
       confirmPasswordBox.sendKeys(confirmpasswordBox);
    }



    public void chooseTitle(String title){
        Select select= new Select(chooseTitle);
        select.selectByVisibleText(title);
    }
}

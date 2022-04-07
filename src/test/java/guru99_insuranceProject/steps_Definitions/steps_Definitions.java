package guru99_insuranceProject.steps_Definitions;

import guru99_insuranceProject.pages.HomePage;
import guru99_insuranceProject.pages.accountRegistration;
import guru99_insuranceProject.util.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class steps_Definitions {
    HomePage homePage=new HomePage();
    accountRegistration accountRegistration= new accountRegistration();
    @When("The user wants to go to guru99_Insurance Project")
    public void the_user_wants_to_go_to_guru99_insurance_project() {
       homePage.clickOnRegister();
    }
    @Then("The user wants to verify that user is on the insurance page")
    public void the_user_wants_to_verify_that_user_is_on_the_insurance_page() {
       // Assert.assertTrue(Driver.getDriver().getTitle().contains("Insurance"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("insurance"));
    }
    @When("The user wants to choose title as {string}")
    public void the_user_wants_to_choose_title_as(String string) {
        accountRegistration.chooseTitle(string);


    }
    @When("The user wants to enter first name as {string}")
    public void the_user_wants_to_enter_first_name_as(String string) {
        accountRegistration.setFirstName(string);
    }
    @When("The user wants to enter surname name as {string}")
    public void the_user_wants_to_enter_surname_name_as(String string) {
        accountRegistration.setLastName(string);
    }
    @When("The user wants to enter phone number as {string}")
    public void the_user_wants_to_enter_phone_number_as(String string) {
        accountRegistration.setPhoneNumber(string);
    }
    @When("The user wants to enter date of birth as {string}")
    public void the_user_wants_to_enter_date_of_birth_as(String string) {
        //tomorrow to be done
    }
    @When("The user wants to choose the license type as {string}")
    public void the_user_wants_to_choose_the_license_type_as(String string) {
        accountRegistration.setLicenceType(string);
    }
    @When("The user wants to choose the license period as {string}")
    public void the_user_wants_to_choose_the_license_period_as(String string) {
        accountRegistration.setLicencePeriod(string);
    }
    @When("The user wants to choose the occupation period as {string}")
    public void the_user_wants_to_choose_the_occupation_period_as(String string) {

    }
    @When("The user wants to enter the street address as {string}")
    public void the_user_wants_to_enter_the_street_address_as(String string) {

    }
    @When("The user wants to enter the city period as {string}")
    public void the_user_wants_to_enter_the_city_period_as(String string) {

    }
    @When("The user wants to enter the country period as {string}")
    public void the_user_wants_to_enter_the_country_period_as(String string) {

    }
    @When("The user wants to enter the postal code period as {string}")
    public void the_user_wants_to_enter_the_postal_code_period_as(String string) {

    }
    @When("The user wants to enter the emailAddress period as {string}")
    public void the_user_wants_to_enter_the_email_address_period_as(String string) {
        accountRegistration.setEmailBox(string);
    }
    @When("The user wants to enter the password period as {string}")
    public void the_user_wants_to_enter_the_password_period_as(String string) {
        accountRegistration.setPasswordBox(string);
    }
    @When("The user wants to enter the confirmPassword period as {string}")
    public void the_user_wants_to_enter_the_confirm_password_period_as(String string) {
        accountRegistration.setConfirmPasswordBox(string);
    }
    @When("The user wants to click create button")
    public void the_user_wants_to_click_create_button() {
        accountRegistration.setCreateButton();
    }
}

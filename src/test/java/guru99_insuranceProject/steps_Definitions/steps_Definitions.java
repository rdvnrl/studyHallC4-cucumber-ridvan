package guru99_insuranceProject.steps_Definitions;

import guru99_insuranceProject.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps_Definitions {
    HomePage homePage=new HomePage();
    @When("The user wants to go to guru99_Insurance Project")
    public void the_user_wants_to_go_to_guru99_insurance_project() {
       homePage.clickOnRegister();
    }
    @Then("The user wants to verify that user is on the insurance page")
    public void the_user_wants_to_verify_that_user_is_on_the_insurance_page() {

    }
}

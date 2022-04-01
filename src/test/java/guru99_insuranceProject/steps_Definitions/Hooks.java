package guru99_insuranceProject.steps_Definitions;

import guru99_insuranceProject.util.Driver;
import guru99_insuranceProject.util.PropertiesReadingUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setup(Scenario scenario){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(PropertiesReadingUtil.getProperties("environmentURL"));
    }
    @After
    public void tearDownDriver(Scenario scenario){
        Driver.closeDriver();
    }

}

package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.gda.wsb.PageFactory.DriverFactory;
import pl.gda.wsb.PageFactory.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = DriverFactory.getChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("Open login page")
    public void open_login_page(){
        driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("Click on login button")
    public void click_on_login_button(){
        loginPage.clickOnLogin();
    }

    @Then("The validation message is displayed")
    public void the_validation_message_is_displayed() {
        Assert.assertEquals("Invalid credentials",loginPage.getValidationMessage());
    }

    @Then("^The validation (.*) is displayed$")
    public void theValidationMessageIsDisplayed(String message) {
        Assert.assertEquals(message,loginPage.getValidationMessage());
    }
}

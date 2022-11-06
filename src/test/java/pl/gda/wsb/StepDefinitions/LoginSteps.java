package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = null;

    @Given("Open login page")
    public void open_login_page(){
        // Declaration and instantiation of driver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password(){
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("564564");
    }

    @And("Click on login button")
    public void click_on_login_button(){
        driver.findElement(By.className("orangehrm-login-button")).click();
    }

    @Then("The validation message is displayed")
    public void the_validation_message_is_displayed() {
        String validationMessage = driver.findElement(By.className("oxd-alert-content-text")).getText();
    }
}

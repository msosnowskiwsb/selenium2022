package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("Open login page")
    public void open_login_page(){
        System.out.println("Open login page");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password(){
        System.out.println("Users enters username and password");
    }

    @And("Click on login button")
    public void click_on_login_button(){
        System.out.println("Click on login button");
    }

    @Then("The validation message is displayed")
    public void the_validation_message_is_displayed() {
        System.out.println("Click on login button");
    }
}

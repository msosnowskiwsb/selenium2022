package pl.gda.wsb.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "username")
    WebElement txt_username;

    @FindBy(name = "password")
    WebElement txt_password;

    @FindBy(className = "orangehrm-login-button")
    WebElement btn_Login;

    @FindBy(className = "oxd-alert-content-text")
    WebElement validationMessage;

    @FindBy(className = "oxd-userdropdown-name")
    WebElement personName;

    @FindBy(className = "orangehrm-login-branding")
    public WebElement logo;

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickOnLogin(){
        btn_Login.click();
    }

    public String getValidationMessage(){
        return validationMessage.getText();
    }
}

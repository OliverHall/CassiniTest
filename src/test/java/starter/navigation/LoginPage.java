package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class LoginPage extends PageObject{

    
    @FindBy(xpath = "//input[@id='login-username']")
    WebElementFacade usernameField;

    @FindBy(xpath = "//input[@id='login-passwd']")
    WebElementFacade passwordField;

    @FindBy(xpath = "//input[@id='login-signin']")
    WebElementFacade nextButton;

    @FindBy(xpath = "//button[@id='login-signin']")
    WebElementFacade loginButton;

    @FindBy(xpath = "//p[@id='username-error']")
    WebElementFacade credentialsErrorMessage;

    String storedUsername = "NULL";
    String storedPassword = "NULL";


    public void enterStoredUsername(){
        usernameField.clear();
        usernameField.sendKeys(storedUsername);
    }
    public void enterUsernameOf(String givenUsername){
        usernameField.clear();
        usernameField.sendKeys(givenUsername);
    }

    public void enterStoredPassword(){
        passwordField.clear();
        passwordField.sendKeys(storedPassword);
    }
    public void enterPasswordOf(String givenPassword){
        passwordField.clear();
        passwordField.sendKeys(givenPassword);
    }

    public void clickNextButton(){
        nextButton.click();
    }

    public void clickAuthenticateCredentials(){
        loginButton.click();
    }

    public void iCanSeeCredentialsErrorMessage(){

    }

}

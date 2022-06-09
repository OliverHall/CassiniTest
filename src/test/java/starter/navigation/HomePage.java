package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends PageObject{

    @FindBy(linkText = "Sign in")
    WebElementFacade loginNavbar;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade acceptAll;

    public void openPage() {
        getDriver().get("https://uk.yahoo.com/");
    }

    public void clickLoginNavbar(){
        loginNavbar.click();
    }

    public void clickAcceptAll(){
        acceptAll.click();
    }


}
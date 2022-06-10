package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.aspectj.bridge.Version.getText;

public class HomePage extends PageObject{

    @FindBy(linkText = "Sign in")
    WebElementFacade loginNavbar;

    @FindBy(xpath = "//a[@id='root_8']")
    WebElementFacade financeNavbar;

    @FindBy(xpath = "//div[@title='Market Data']")
    WebElementFacade marketPlace;

    @FindBy(xpath = "//a[@title='Calendar']")
    WebElementFacade calendarDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade acceptAll;

    public void openPage() {
        getDriver().get("https://uk.yahoo.com/");
    }

    public void openMarketPlaceCalendar() {
        getDriver().get("https://uk.finance.yahoo.com/calendar/");
    }

    public void clickLoginNavbar(){
        loginNavbar.click();
    }

    public void clickFinanceNavbar(){
        financeNavbar.click();
    }

    public void waitFive() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }

    public void clickMarketDataCalendar(){
        marketPlace.click();
        calendarDropdown.click();
    }

    public void clickAcceptAll(){
        acceptAll.click();
    }

    public void listCalenderDays(){
        List<WebElement> listOfDays = getDriver().findElements(By.xpath("//div[@id='fin-cal-events']//div//ul//li//div"));
        for (int i = 0; i < listOfDays.size(); i++){
            System.out.println(listOfDays.get(i).findElements(By.xpath("//div")));
//            listOfDays.get(i).
//            System.out.println(listOfDays.get(i).findElement(@FindBy(xpath = "//div")).getText());

        }
    System.out.println(listOfDays.size());
    }


}
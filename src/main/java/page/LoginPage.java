package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class LoginPage extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 15000;


    @FindBy(xpath =  "//*[@id='btnLogin']")
    private WebElement login;

    @FindBy(xpath =  "//*[@id='login_username']")
    private WebElement user;

    @FindBy(xpath =  "//*[@id='Password']")
    private WebElement pass;


    /*Assert*/
    @FindBy (xpath =  "//*[@id='LocationId']")
    private WebElement seeLocation;


    public LoginPage (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }


    public void enterLogin(String login) {
        enter(login).into(user);
    }

    public void enterPass(String password) {
        enter(password).into(pass);
    }

    public void clickLogin() {
        clickOn(login);
        waitFor("//*[@id='LocationId']");
    }

    public void setLocation() {
        assertEquals(true, element(seeLocation).isPresent());
    }


}






package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;


import java.io.IOException;


public class BeforeClass {


    @Managed(driver = "chrome")

    public WebDriver driver;
    public String ChromePath = "/var/lib/jenkins/jobs/Junit/selenium/chromedriver";


    @Steps
    public LoginSteps settings;

    @Steps
    public LoginSteps enterLogin;
    @Steps
    public LoginSteps enterPass;

    @Steps
    public LoginSteps clickLogin;

    @Steps
    public LoginSteps assertLocation;


    @Before
    public void myTest() throws Exception {

        System.setProperty("webdriver.chrome.driver", ChromePath);
        settings.start_browser();
        driver.manage().window().maximize();

    }
    @After
    public void close() throws IOException {
        driver.close();
    }




}

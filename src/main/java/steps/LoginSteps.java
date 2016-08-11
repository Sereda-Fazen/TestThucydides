package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import page.LoginPage;


public class LoginSteps extends ScenarioSteps {
    LoginPage LoginPage;

    public LoginSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        LoginPage loginPage = getPages().get(LoginPage.class);
        loginPage.open();
    }



    @Step()
    public void enterLogin(String login) {
        LoginPage.enterLogin(login);
    }

    @Step()
    public void enterPass(String password) {
        LoginPage.enterPass(password);
    }



    @Step()
    public void clickLogin() {
        LoginPage.clickLogin();
    }

    @Step()
    public void assertLocation() {
        LoginPage.setLocation();


    }
}



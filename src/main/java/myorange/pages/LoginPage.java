package myorange.pages;

import myorange.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    @FindBy(id = "logInPanelHeading")
    WebElement loginPageHeading;

    @FindBy(id = "txtUsername")
    static WebElement userName;

    @FindBy(id = "txtPassword")
    static WebElement password;

    @FindBy(id = "btnLogin")
    static WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyLoginPage(){
         return loginPageHeading.getText();
    }

    public static WelcomeAdminPage login(String uname, String pwd){
        userName.sendKeys(uname);
        password.sendKeys(pwd);
        loginButton.click();
        return new WelcomeAdminPage();
    }
}

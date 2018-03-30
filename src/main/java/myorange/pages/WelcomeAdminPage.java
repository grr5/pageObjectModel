package myorange.pages;

import myorange.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeAdminPage extends BaseTest {

    @FindBy(id = "welcome")
    WebElement welcomeAdmin;

    @FindBy(linkText = "Admin")
    WebElement adminLink;

    @FindBy(linkText = "PIM")
    static WebElement pimLink;

    public WelcomeAdminPage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyAdminLogin(){
        return welcomeAdmin.getText();
    }

    public AdminPage goToAdminPage(){
        adminLink.click();
        return new AdminPage();
    }

    public PimPage goToPimPage(){
        pimLink.click();
        return new PimPage();
    }
}

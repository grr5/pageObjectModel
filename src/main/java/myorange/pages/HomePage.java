package myorange.pages;

import myorange.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
//    initializing the page objects
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

}

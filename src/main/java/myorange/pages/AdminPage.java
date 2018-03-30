package myorange.pages;

import myorange.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BaseTest {

    public AdminPage(){
        PageFactory.initElements(driver, this);
    }
}

package myorange.testcases;

import myorange.base.BaseTest;
import myorange.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        browserSetup();
//        homePage = new HomePage();
    }

    @Test
    public void verifyTitle(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "OrangeHRM");
    }
}

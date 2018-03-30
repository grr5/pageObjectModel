package myorange.testcases;

import myorange.base.BaseTest;
import myorange.pages.AddEmployee;
import myorange.pages.PimPage;
import myorange.pages.WelcomeAdminPage;
import myorange.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SanityTest extends BaseTest {
    LoginPage loginPage;
    WelcomeAdminPage welcomeAdminPage;
    PimPage pimPage ;
    AddEmployee addEmployee ;

    public SanityTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        browserSetup();
        loginPage = new LoginPage();
//        welcomeAdminPage = loginPage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
//        pimPage=welcomeAdminPage.goToPimPage();
//        addEmployee = pimPage.createEmployee();
    }

    @Test(priority = 1)
    public void verifyLoginPage(){
//        loginPage = new LoginPage();
        String title = loginPage.verifyLoginPage();
        Assert.assertEquals(title, "LOGIN Panel");

    }

    @Test(priority = 2)
    public void loginTest(){
//         loginPage = new LoginPage();
//        loginPage.login("Admin", "admin");
        LoginPage.login(prop.getProperty("uname"), prop.getProperty("pwd"));

    }

    @Test(priority = 3)
    public void verifyAdminTest(){
//        loginPage = new LoginPage();
        welcomeAdminPage = loginPage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
//        loginPage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
        String welcomeMsg = welcomeAdminPage.verifyAdminLogin();
        Assert.assertEquals(welcomeMsg, "Welcome Admin");
    }

    @Test(priority = 4)
    public void goToPim(){
//        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("uname"), prop.getProperty("pwd")).goToPimPage();
    }

    @Test(priority = 5)
    public void addNewEmployee() throws InterruptedException{
//        loginPage = new LoginPage();
         loginPage.login(prop.getProperty("uname"), prop.getProperty("pwd")).goToPimPage().createEmployee().newEmployee("hfgh", "hjkgkh").editEmpDetails();
//
    }

//    @Test(priority = 6)
//    public void deleteEmployee(){
////        loginPage = new LoginPage();
//        LoginPage.login(prop.getProperty("uname"), prop.getProperty("pwd")).goToPimPage().clickOnEmployeeList().deleteEmp();
//    }
//    @AfterMethod
//    public void quit(){
//        driver.quit();
//    }
}

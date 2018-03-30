package myorange.pages;

import myorange.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BaseTest {

    @FindBy(id = "menu_pim_viewEmployeeList")
    WebElement empList;

    @FindBy(id = "menu_pim_addEmployee")
    static WebElement addEmp;

    @FindBy(linkText = "Reports")
    WebElement empReports;

    public PimPage(){
        PageFactory.initElements(driver, this);
    }

    public EmployeeList clickOnEmployeeList(){
        empList.click();
        return new EmployeeList();
    }

    public static AddEmployee createEmployee(){
        addEmp.click();
        return new AddEmployee();
    }
}

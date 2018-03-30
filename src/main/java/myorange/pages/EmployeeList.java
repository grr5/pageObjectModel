package myorange.pages;

import myorange.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeList extends BaseTest {
    @FindBy(id = "ohrmList_chkSelectRecord_19")
    WebElement selectEmp;

    @FindBy(id = "btnDelete")
    WebElement deleteButton;
    @FindBy(id = "dialogDeleteBtn")
    WebElement dialogDeleteButton;

    public EmployeeList(){
        PageFactory.initElements(driver,this);
    }

    public void deleteEmp(){
        selectEmp.click();
        deleteButton.click();
        dialogDeleteButton.click();

    }
}

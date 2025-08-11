package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
@FindBy(id="addNewRecordButton")
private WebElement addBtn;

@FindBy(id="firstName")
private WebElement firstnameField;

@FindBy(id="lastName")
private WebElement lastnameField;

@FindBy(id="userEmail")
private WebElement emailField;

@FindBy(id="age")
private WebElement ageField;

@FindBy(id="salary")
private WebElement salaryField;

@FindBy(id="department")
private WebElement departmentField;

@FindBy(id="submit")
private WebElement submitField;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickAdd() {
	addBtn.click();
}

public void enterFirstName(String firstname) {
	firstnameField.sendKeys(firstname);
}

public void entertLastName(String lastname) {
	lastnameField.sendKeys(lastname);
}

public void enterEmail(String email) {
	emailField.sendKeys(email);
}

public void enterAge(String age) {
	ageField.sendKeys(age);
}

public void enterSalary(String salary) {
	salaryField.sendKeys(salary);
}

public void enterDept(String dept) {
	departmentField.sendKeys(dept);
}


public void clickSubmit() {
	submitField.click();
}


}

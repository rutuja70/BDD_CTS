package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.LoginPage;
import genericlib.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	LoginPage lp;
	
	public StepDefinition() {
		driver=BaseClass.getDriver();
		lp=new LoginPage(driver);
		
	}
	
	@Given("I open the demoqa web tables page")
    public void i_open_the_demoqa_web_tables_page() {
        driver.get("https://demoqa.com/webtables");
    }

  @When("I click the Add button and fill employee details:")
    public void i_click_the_add_button_and_fill_employee_details(DataTable dataTable) {
	  
	  List<Map<String, String>> employee = dataTable.asMaps(String.class , String.class);
	  
	  for(Map<String,String> emp: employee) {
		  lp.clickAdd();
		  
		    lp.enterFirstName(emp.get("firstName"));
	        lp.entertLastName(emp.get("lastName"));
	        lp.enterEmail(emp.get("email"));
	        lp.enterAge(emp.get("age"));
	        lp.enterSalary(emp.get("salary"));
	        lp.enterDept(emp.get("department"));
	        lp.clickSubmit();
	  }
	  
  }
  
  @Then("I should see correct result")
  public void i_should_see_correct_result(DataTable dataTable) {
      List<Map<String, String>> employees = dataTable.asMaps(String.class, String.class);

      String tableText = driver.getPageSource(); // You can refine this locator

      for (Map<String, String> emp : employees) {
          Assert.assertTrue(tableText.contains(emp.get("firstName")));
          Assert.assertTrue(tableText.contains(emp.get("lastName")));
          Assert.assertTrue(tableText.contains(emp.get("email")));
      }
  }
}

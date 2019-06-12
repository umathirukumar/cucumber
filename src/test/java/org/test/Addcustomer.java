package org.test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Addcustomer {
	 static WebDriver driver;

@Given("the user is in add customer page")
public void the_user_is_in_add_customer_page() {
   System.setProperty("bdriver.chrome.driver.", "C:\\Users\\Senthil\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://demo.guru99.com/telecom/index.html");
   driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
}

@When("the user fill in valid customer details")
public void the_user_fill_in_valid_customer_details() {
   driver.findElement(By.id("done")).click();
   driver.findElement(By.id("fname")).sendKeys("uma");
   driver.findElement(By.id("lname")).sendKeys("thirukumar");
   driver.findElement(By.id("email")).sendKeys("umathiru@gmail.com");
   driver.findElement(By.id("message")).sendKeys("=4 umaran constraction,nagappan street,chennai-83.");
   driver.findElement(By.id("telephoneno")).sendKeys("+91-8098813758");
   

	}

@When("the user click the submit button")
public void the_user_click_the_submit_button() {
	driver.findElement(By.id("//input[@value='Submit']")).click();
	   
}

@Then("the user should see the customer id is generated")
public void the_user_should_see_the_customer_id_is_generated() {
  Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
}


/*@When("th user fill in valid customer details")
public void th_user_fill_in_valid_customer_details(DataTable cu) {
List<String> customerdetailsList=cu.asList(String.class);
}
*/


}

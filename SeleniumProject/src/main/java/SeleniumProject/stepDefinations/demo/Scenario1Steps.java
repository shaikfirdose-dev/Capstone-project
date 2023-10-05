package SeleniumProject.stepDefinations.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Scenario1Steps {
    private WebDriver driver;

    @Given("^I am on the homepage of \"(.*)\"$")
    public void navigateToHomepage(String url) {
        // Initialize WebDriver and navigate to the given URL
        // You should set up your WebDriver instance here
    }

    @When("^I click on the \"(.*)\" link$")
    public void clickOnLink(String linkText) {
        // Find and click on the specified link by its text
    }

    @Then("^I should see the text \"(.*)\" on the page$")
    public void verifyTextOnPage(String expectedText) {
        // Verify the presence of the expected text on the page
        WebElement pageContent = driver.findElement(By.tagName("body"));
        Assert.assertTrue(pageContent.getText().contains(expectedText));
    }

    @And("^I go back to the homepage$")
    public void navigateBackToHomepage() {
        // Navigate back to the homepage
        driver.navigate().back();
    }

    @And("^I click on the \"Dropdown\" link$")
    public void clickOnDropdownLink() {
        // Click on the "Dropdown" link
    }

    @And("^I select \"(.*)\" from the dropdown$")
    public void selectOptionFromDropdown(String option) {
        // Select the specified option from the dropdown
    }

    @Then("^\"(.*)\" should be selected$")
    public void verifyOptionSelected(String selectedOption) {
        // Verify if the specified option is selected in the dropdown
    }

    @And("^I click on the \"Frames\" link$")
    public void clickOnFramesLink() {
        // Click on the "Frames" link
    }

    @Then("^I should see the following hyperlinks:$")
    public void verifyHyperlinksPresent(List<String> expectedLinks) {
        for (String expectedLink : expectedLinks) {
            WebElement linkElement = driver.findElement(By.linkText(expectedLink));
            Assert.assertNotNull(linkElement);
        }
    }
}


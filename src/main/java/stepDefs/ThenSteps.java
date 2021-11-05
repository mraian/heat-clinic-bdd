package stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Locale;

public class ThenSteps extends Base{
    @Then("I should see customer welcome page")
    public void i_should_see_customer_welcome_page() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(3000);
        String userName = driver.findElement(By.xpath("//*[@id='sectionsNav']/div/div[1]/ul[2]/li[1]/a")).getText();

        System.out.println(userName);

        Assert.assertTrue(userName.toLowerCase().contains("graviton"));

    }
    //contactUS.feature
    /*
    @Then("I should see the confirmation message")
    public void i_should_see_the_confirmation_message() {
        ////*[@id="contact-us-success"]/p
        String actualText =driver.findElement(By.xpath("//*[@id=\"contact-us-success\"]/p")).getText();
        String expectedText ="Thanks for contacting us. We will write back to you shortly";
        System.out.println(actualText);
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));

    }

     */
    //contactUS.feature
    @Then("I should the error message")
    public void i_should_the_error_message() {
        // Write code here that turns the phrase above into concrete actions
        String actualText =driver.findElement(By.xpath("//*[@id=\"contact-us-success\"]/p")).getText();
        String expectedText ="Please enter all the field";
        System.out.println(actualText);
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));
    }

}

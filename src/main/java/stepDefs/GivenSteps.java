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

public class GivenSteps extends Base{

    @Given("I open a browser")
    public void i_open_a_browser() throws InterruptedException {
        System.out.println(baseUrl);
        driver.get(baseUrl);
       // Thread.sleep(3000);

    }

    @Given("I navigate to the login page")
    public void I_navigate_to_the_login_page() {
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    @Given("I navigate to the contact us page")
    public void i_navigate_to_the_contact_us_page() {
        driver.findElement(By.xpath("//a[@href='/contactus']")).click();

    }


}

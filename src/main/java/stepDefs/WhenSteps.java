package stepDefs;


import io.cucumber.datatable.DataTable;
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
import java.util.List;


import java.util.List;

public class WhenSteps extends Base{
    //
    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        WebElement element_email = driver.findElement(By.xpath("//input[@id='username']"));
        element_email.sendKeys(string);
    }
    @When("I enter password as {string}")
    public void i_enter_password_as(String string) {
        driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys(string);
    }

    @When("I enter username and password")
    public void i_enter_username_and_password(DataTable dataTable){

        List<List<String>> data = dataTable.asLists(String.class);

        for(int i=0; i<data.size(); i++){

            driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data.get(i).get(0));
            driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys(data.get(i).get(1));

        }


    }


    @When("^I enter name as \"([^\"]+)\"$")
    public void i_enter_as_name(String string) throws InterruptedException, Throwable {
        driver.findElement(By.xpath("//*[@name='name']")).sendKeys(string);
        //Thread.sleep(3000);
    }
    @When("^I enter email as \"(.*)\"$")
    public void i_enter_as_email(String email) throws InterruptedException, Throwable {
        driver.findElement(By.xpath("//*[@name='emailAddress']")).sendKeys(email);
        Thread.sleep(3000);
    }
    @When("I enter my comments")
    public void i_enter_my_comments() throws InterruptedException, Throwable {
        driver.findElement(By.xpath("//*[@name='comments']")).sendKeys("This is a test comment");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[4]/button")).click();
       //Thread.sleep(3000);
        // System.out.println("here 3");
    }


}

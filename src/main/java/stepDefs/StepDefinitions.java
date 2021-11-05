package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;


public class StepDefinitions extends Base{

    @When("I go to the Gift Cards page")
    public void i_go_to_the_gift_cards_page() throws InterruptedException {
/*
        JavascriptExecutor Js1 = (JavascriptExecutor) driver;
        Js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
  */
        driver.findElement(By.xpath("(//*[@href='/gift-cards']/span)[2]")).click();
        Thread.sleep(2000);


    }
    @When("I click on the gift card")
    public void i_click_on_the_gift_card() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@href='/gift-card/5-card'])[1]")).click();
    }
    @When("I enter personal message")
    public void i_enter_personal_message() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@id='product_content'])/div[2]/div[3]/div[2]/div/textarea")).sendKeys("Thank you!");
        Thread.sleep(3000);

    }
    @When("I enter SenderName and RecipientEmail and RecipientName")
    public void i_enter_senderName_recipient_email_recipient_name(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);

        driver.findElement(By.xpath("//*[@id=\"product_content\"]/div[2]/div[3]/div[3]/div/input")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//*[@id=\"product_content\"]/div[2]/div[3]/div[4]/div/input")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//*[@id=\"product_content\"]/div[2]/div[3]/div[5]/div/input")).sendKeys(data.get(0).get(2));
    }

    @When("I pick on one color")
    public void i_pick_on_one_color() {
        driver.findElement(By.xpath("//*[@id=\"product_content\"]/div[2]/div[3]/div[6]/div/a[2]")).click();
    }
    @When("I click on the add to cart button")
    public void i_click_on_the_add_to_cart_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/ul/li[3]/a")).click();
        Thread.sleep(4000);

    }
    @When("I checkout as guest")
    public void i_checkout_as_guest() throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/checkout']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[4]/form/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"payment_methods\"]/div[1]/div/ul/li[3]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[3]/div[2]/a/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/div[2]/a")).click();
        Thread.sleep(4000);

    }
    @Then("I should see the purchase confirmation")
    public void i_should_see_the_purchase_confirmation() {
        String actualText =(driver.findElement(By.xpath("//*[@id=\"order_confirmation\"]/div[1]/div/h2/span")).getText());
        String expectedText ="thank you";

        Assert.assertTrue(actualText.toLowerCase().contains(expectedText));
    }





}

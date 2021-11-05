package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
   /*
   All derived classes obtain access to static variables of their base classes.
   This includes protected variables, mirroring the situation with variables that are inherited
   That's why when other step defs class will inherit Base class it will have excess to the
    */
   public static WebDriver driver;
   public static String baseUrl = "https://demo.broadleafcommerce.org/";

}

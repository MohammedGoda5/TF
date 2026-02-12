package testPages;


import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LoginPage {
    /* Declaration for the driver */
    private final SHAFT.GUI.WebDriver driver;
    /* Page locators */
    private final By username = By.name("UserName");
    private final By password = By.name("Password");
    private final By loginButton = By.xpath("//button[@type='submit']");

    /* Page constructor */
    public LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /* Page methods */
    public HomePage loginToTF(String userName, String Password) {
        driver.element().type(username, userName);
        driver.element().type(password, Password);
        driver.element().click(loginButton);
        return new HomePage(driver);
    }
}

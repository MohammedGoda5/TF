package testPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {

    // Declarations
    private final SHAFT.GUI.WebDriver driver;
    private final By ILGRequestsPage = By.xpath("//a[@href='/Request/Inbox/LG']");
    private final By ELGRequestsPage = By.xpath("//a[@href='/Request/Inbox/ELG']");
    private final By ILCRequestsPage = By.xpath("//a[@href='/Request/Inbox/LC']");
    private final By ELCRequestsPage = By.xpath("//a[@href='/Request/Inbox/ELC']");
    private final By IBCRequestsPage = By.xpath("//a[@href='/Request/Inbox/DC']");
    private final By OBCRequestsPage = By.xpath("//a[@href='/Request/Inbox/ODC']");
    private final By APRequestsPage = By.xpath("//a[@href='/Request/Inbox/AP']");

    // Constructor
    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    // Home page navigation

    public LGPage NavigateToILG() {
        driver.element().click(ILGRequestsPage);
        return new LGPage(driver);
    }

    public LGPage NavigateToELG() {
        driver.element().click(ELGRequestsPage);
        return new LGPage(driver);
    }

    public LCPage NavigateToILC() {
        driver.element().click(ILCRequestsPage);
        return new LCPage(driver);
    }

    public LCPage NavigateToELC() {
        driver.element().click(ELCRequestsPage);
        return new LCPage(driver);
    }
    public DCPage NavigateToIBC() {
        driver.element().click(IBCRequestsPage);
        return new DCPage(driver);
    }


}

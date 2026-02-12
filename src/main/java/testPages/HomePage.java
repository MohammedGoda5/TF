package testPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {

    // Declarations
    private final SHAFT.GUI.WebDriver driver;
    private final By ILGReqestsPage = By.xpath("//a[@href='/Request/Inbox/LG']");
    private final By ELGReqestsPage = By.xpath("//a[@href='/Request/Inbox/ELG']");
    private final By ILCReqestsPage = By.xpath("//a[@href='/Request/Inbox/LC']");
    private final By ELCReqestsPage = By.xpath("//a[@href='/Request/Inbox/ELC']");
    private final By IBCReqestsPage = By.xpath("//a[@href='/Request/Inbox/DC']");
    private final By OBCReqestsPage = By.xpath("//a[@href='/Request/Inbox/ODC']");
    private final By APReqestsPage = By.xpath("//a[@href='/Request/Inbox/AP']");

    // Constructor
    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    // Home page navigation

    public LGPage NavigateToILG() {
        driver.element().click(ILGReqestsPage);
        return new LGPage(driver);
    }

    public LGPage NavigateToELG() {
        driver.element().click(ELGReqestsPage);
        return new LGPage(driver);
    }

    public LCPage NavigateToILC() {
        driver.element().click(ILCReqestsPage);
        return new LCPage(driver);
    }

    public LCPage NavigateToELC() {
        driver.element().click(ELCReqestsPage);
        return new LCPage(driver);
    }
    public DCPage NavigateToIBC() {
        driver.element().click(ELCReqestsPage);
        return new DCPage(driver);
    }


}

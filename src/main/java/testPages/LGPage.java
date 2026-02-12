package testPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LGPage {
    // Declarations
    private final SHAFT.GUI.WebDriver driver;
    private final By otherClassesSearch = By.id("LCInboxGrid_filter");
    private final By previousButton = By.id("LCInboxGrid_previous");
    private final By pickRequest = By.xpath("(//a[@class='btn btn-red' and text()='Pick'])[1]");
    private final By openRequest = By.xpath("(//a[@class='btn btn-red' and text()='Open'])[1]");
    private final By myTasksSearch = By.xpath("(//input[@type='search'])[1]");

    private final By additionalCondition = By.name("AdditionalCondition");
    private final By saveUpdates = By.xpath("(//input[@type='submit'])[3]");
    private final By sendToCheckerButton = By.xpath("//a[normalize-space()='Send To Checker']");
    private final By confirmSendToChecker = By.xpath("//input[@value='Send To Checker']");

    // Constructor
    public LGPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public HomePage sendLGToChecker(String AddtionalCondition) {
//        driver.element().click(myTasksSearch);
        driver.element().clickUsingJavascript(openRequest);
        driver.element().type(additionalCondition, AddtionalCondition);
        driver.element().click(saveUpdates);
        driver.element().click(sendToCheckerButton);
        driver.element().click(confirmSendToChecker);
        return new HomePage(driver);
    }

}

package testPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LCPage {
    // Declarations
    private final SHAFT.GUI.WebDriver driver;
    private final By previousButton = By.id("LCInboxGrid_previous");
    private final By myTasksSearch = By.xpath("(//input[@type='search'])[1]");
    private final By pickRequest = By.xpath("(//a[@class='btn btn-red' and text()='Pick'])[1]");
    private final By openRequest = By.xpath("(//a[@class='btn btn-red' and text()='Open'])[1]");
    private final By debitSuffixInput = By.name("DirectorySuffix");
    private final By transferableCheckBox = By.id("ifRevolving");
    private final By openSpecialRate = By.id("select2-SpecialRate-container");
    //Select the first element from all the list
    private final By selectFirstOption = By.xpath("//li[@class='select2-results__option select2-results__option--selectable'][1]");
    //LC type for ILC
    private final By openLCType = By.id("select2-LCType-container");
    private final By openBeneficiaryList = By.id("select2-BeneficiaryCustomerId-container");
    private final By saveBasicData = By.xpath("(//div[@class='Save-update-form'])[1]");
    private final By openPaymentAvailable = By.xpath("//span[@aria-labelledby='select2-AvailableTypeid-container']");
    private final By savePaymentAvailability = By.xpath("(//div[@class='Save-update-form']//input[@value='Save Updates'])[6]");
    //my role for ELC
    private final By openMyRole = By.id("select2-MyRoleEnum-container");
    private final By sendToCheckerButton = By.xpath("//a[normalize-space()='Send To Checker']");
    private final By confirmSendToChecker = By.xpath("//input[@value='Send To Checker']");
    // Constructor
    public LCPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //  Methods
    public void sendILCToChecker() {
        driver.element().click(openRequest);
        driver.element().type(debitSuffixInput, "0010-601258-111");
        driver.element().click(transferableCheckBox);
        driver.element().click(openSpecialRate);
        driver.element().click(selectFirstOption);
        driver.element().click(openLCType);
        driver.element().click(selectFirstOption);
        driver.element().click(openBeneficiaryList);
        driver.element().click(selectFirstOption);
        driver.element().click(saveBasicData);
        driver.element().click(openPaymentAvailable);
        driver.element().click(selectFirstOption);
        driver.element().click(savePaymentAvailability);
        driver.element().click(sendToCheckerButton);
        driver.element().click(confirmSendToChecker);
    }

    public void sendELCToChecker() {
        driver.element().click(openRequest);
        driver.element().type(debitSuffixInput, "0010-601258-111");
        driver.element().click(transferableCheckBox);
        driver.element().click(openSpecialRate);
        driver.element().click(selectFirstOption);
        driver.element().click(openMyRole);
        driver.element().click(selectFirstOption);
        driver.element().click(openBeneficiaryList);
        driver.element().click(selectFirstOption);
        driver.element().click(saveBasicData);
        driver.element().click(openPaymentAvailable);
        driver.element().click(selectFirstOption);
        driver.element().click(savePaymentAvailability);
        driver.element().click(sendToCheckerButton);
        driver.element().click(confirmSendToChecker);
    }


}

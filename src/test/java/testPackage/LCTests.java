package testPackage;

import org.testng.annotations.Test;
import testPages.LoginPage;

public class LCTests extends BaseTest {

    // Successfully send ILC request to Checker
    @Test(description = "Send ILC request type to the checker.")
    public void sendILCToChecker() {
        loginpage = new LoginPage(driver);
        homePage = loginpage.loginToTF("maker", "P@ssw0rd123");
        lcPage = homePage.NavigateToILC();
        lcPage.sendILCToChecker();
    }

    // Successfully send ELC request to Checker
    @Test(description = "Send ELC request type to the checker.")
    public void sendELCToChecker() {
        loginpage = new LoginPage(driver);
        homePage = loginpage.loginToTF("maker", "P@ssw0rd123");
        lcPage = homePage.NavigateToELC();
        lcPage.sendELCToChecker();
    }

}
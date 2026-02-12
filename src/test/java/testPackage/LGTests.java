package testPackage;

import org.testng.annotations.Test;
import testPages.LoginPage;

public class LGTests extends BaseTest {


    // Successfully send ILG request to Checker
    @Test(description = "Send ILG request type to the checker.")
    public void sendILGToChecker() {
        loginpage = new LoginPage(driver);
        homePage = loginpage.loginToTF("maker", "P@ssw0rd123");
        lgPage = homePage.NavigateToILG();
        lgPage.sendLGToChecker("aa");
    }

    // Successfully send ELG request to Checker
    @Test(description = "Send ELG request type to the checker.")
    public void sendELGToChecker() {
        loginpage = new LoginPage(driver);
        homePage = loginpage.loginToTF("maker", "P@ssw0rd");
        lgPage = homePage.NavigateToELG();
        lgPage.sendLGToChecker("");
    }
}

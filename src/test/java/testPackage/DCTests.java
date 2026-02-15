package testPackage;

import org.testng.annotations.Test;
import testPages.LoginPage;

public class DCTests extends BaseTest{
    @Test
    public void DCTest(){
        loginpage = new LoginPage(driver);
        homePage = loginpage.loginToTF("maker", "P@ssw0rd123");
        dcPage = homePage.NavigateToIBC();
        dcPage.sendIBCToChecker();
    }
}

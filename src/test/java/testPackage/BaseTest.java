package testPackage;

import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import testPages.*;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    //   Declarations
    protected SHAFT.GUI.WebDriver driver;
    protected SHAFT.TestData.JSON testData;
    protected LoginPage loginpage;
    protected HomePage homePage;
    protected LGPage lgPage;
    protected LCPage lcPage;
    protected DCPage dcPage;


    @BeforeClass
    public void beforeClass() {
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(SHAFT.Properties.web.baseURL());


    }

//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }

}

package testPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class DCPage {
    // Constructor

    // Declarations
    private final SHAFT.GUI.WebDriver driver;
    private final By myTasksSearch = By.xpath("(//input[@type='search'])[1]");
    private final By pickRequest = By.xpath("(//a[@class='btn btn-red' and text()='Pick'])[1]");
    private final By openRequest = By.xpath("(//a[@class='btn btn-red' and text()='Open'])[1]");
    private final By selectSecondOption = By.xpath("//li[@class='select2-results__option select2-results__option--selectable'][2]");
    private final By openBeneficiaryList = By.id("select2-BeneficiaryId-container");
    private final By openDocumentReceivedFrom = By.xpath("//span[@aria-labelledby='select2-ddlDocumentRecivedFromId-container']");
    private final By saveUpdatesForParties = By.xpath("(//input[@class='btn btn-white colored-red'])[1]");
    private final By savePaymentDetailsButton = By.id("SaveBtn");
    // Shipment details module
    private final By shipmentTab = By.cssSelector("a.DCShipment");
    private final By fromPortField = By.id("FromPort");
    private final By toPortField = By.id("ToPort");
    private final By placeOfLoading = By.id("PlaceOfLoading");
    private final By placeOfDischarge = By.id("PlaceOfDischarge");
    private final By vesselName = By.id("VesselName");
    private final By openShipmentDate = By.id("ShipmentDateStr");
    private final By selectDate = By.xpath("//div[contains(@class, 'datepicker--cell-day')][text()='27']");
    private final By shipmentDatePeriod = By.id("ShipmentDatePeriod");
    private final By billNumber = By.id("BlNumber");
    private final By invoiceNumber = By.id("InvoiceNumber");
    private final By documentSendByList = By.id("select2-DocumentSendByEnum-container");
    private final By goodsDescription = By.id("GoodsDescription");
    private final By selectGoodsDepartment = By.id("select2-DepId-container");
    private final By selectSubDepartment = By.id("select2-SubDepId-container");
    private final By selectGoods = By.id("select2-GoodId-container");
    private final By shipmentWay = By.id("select2-ShipmentWay-container");
    private final By service = By.id("select2-GoodsDepartment-container");
    private final By CBE = By.id("select2-CBESectorOfProduct-container");
    private final By merchandiseGroup = By.id("select2-MerchandiseGroup-container");
    private final By purposeOfImportation = By.id("select2-PurposeOfImportation-container");
    private final By supplies = By.id("select2-SuppliesForSector-container");

    private final By saveShipmentButton = By.xpath("(//input[@class='btn btn-white colored-red'])[2]");

    private final By sendToCheckerButton = By.xpath("//a[normalize-space()='Send To Checker']");
    private final By confirmSendToChecker = By.xpath("//input[@value='Send To Checker']");


    public DCPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    public void fillMasterData() {
        driver.element().click(openRequest);
        driver.element().click(openBeneficiaryList);
        driver.element().click(selectSecondOption);
        driver.element().click(openDocumentReceivedFrom);
        driver.element().click(selectSecondOption);
        driver.element().click(saveUpdatesForParties);
        driver.element().click(savePaymentDetailsButton);
    }

    public void fillShipmentData() {
        driver.element().click(shipmentTab);
        driver.element().type(fromPortField, "1");
        driver.element().type(toPortField, "27");
        driver.element().type(placeOfLoading, "1");
        driver.element().type(placeOfDischarge, "1");
        driver.element().type(vesselName, "1");
        driver.element().click(openShipmentDate);
        driver.element().click(selectDate);
        driver.element().type(shipmentDatePeriod, "1");
        driver.element().type(billNumber, "1");
        driver.element().type(invoiceNumber, "1");
        driver.element().click(documentSendByList);
        driver.element().click(selectSecondOption);
        driver.element().type(goodsDescription, "1");
        driver.element().click(selectGoodsDepartment);
        driver.element().click(selectSecondOption);
        driver.element().click(selectSubDepartment);
        driver.element().click(selectSecondOption);
        driver.element().click(selectGoods);
        driver.element().click(selectSecondOption);
        driver.element().click(shipmentWay);
        driver.element().click(selectSecondOption);
        driver.element().click(service);
        driver.element().click(selectSecondOption);
        driver.element().click(CBE);
        driver.element().click(selectSecondOption);
        driver.element().click(merchandiseGroup);
        driver.element().click(selectSecondOption);
        driver.element().click(purposeOfImportation);
        driver.element().click(selectSecondOption);
        driver.element().click(supplies);
        driver.element().click(selectSecondOption);
        driver.element().click(saveShipmentButton);

    }


    public void sendIBCToChecker() {
        driver.element().type(myTasksSearch, "02/2026");
        fillMasterData();
        fillShipmentData();
        driver.element().click(sendToCheckerButton);
        driver.element().click(confirmSendToChecker);
    }

    public void sendOBCToChecker() {
        driver.element().type(myTasksSearch, "02/2026");
        fillMasterData();
        fillShipmentData();
        driver.element().click(sendToCheckerButton);
        driver.element().click(confirmSendToChecker);

    }
}



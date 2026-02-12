package testPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class DCPage {
    // Constructor

    // Declarations
    private final SHAFT.GUI.WebDriver driver;
    private final By pickRequest = By.xpath("(//a[@class='btn btn-red' and text()='Pick'])[1]");
    private final By openRequest = By.xpath("(//a[@class='btn btn-red' and text()='Open'])[1]");
    private final By selectFirstOption = By.xpath("//li[@class='select2-results__option select2-results__option--selectable'][1]");
    private final By openBeneficiaryList = By.id("select2-BeneficiaryId-container");
    private final By documentReceivedFrom = By.xpath("//span[@aria-labelledby='select2-ddlDocumentRecivedFromId-container']");
    private final By saveUpdatesForParties = By.xpath("(//input[@class='btn btn-white colored-red'])[1]");
    private final By savePaymentDetailsButton = By.id("SaveBtn");
    // Shipment details module
    private final By shipmentTab = By.cssSelector("a.DCShipment");
    private final By fromPortField = By.id("FromPort");
    private final By toPortField = By.id("ToPort");
    private final By placeOfLoading = By.id("PlaceOfLoading");
    private final By placeOfDischarge = By.id("PlaceOfDischarge");
    private final By vesselName = By.id("VesselName");
    private final By shipmentDate = By.id("ShipmentDateStr");
    private final By selectDate = By.xpath("//div[contains(@class, 'datepicker')]//td[text()='27']");
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


    public DCPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


}



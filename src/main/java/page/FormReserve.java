package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class FormReserve extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    /*This room*/
    @FindBy(xpath = "//*[@id='search']/section[1]/form/div[3]/div[2]/p[1]/a")
    private WebElement clickRoomForReserveer;


    /*Reserveer Nu!*/
    @FindBy(xpath = "//*[@id='gotopayment']/div[2]/input")
    private WebElement clickReserveerNu;



    public FormReserve (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    public void setClickForReserveer() {
        clickOn(clickRoomForReserveer);

    }
    public void setClickReserveerNu() {
        clickOn(clickReserveerNu);

    }



}






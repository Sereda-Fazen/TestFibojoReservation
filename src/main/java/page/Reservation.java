package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class Reservation extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    /*Districs*/
    @FindBy(xpath = "//*[@id='home']/section[1]/div/div/form/p[1]")
    private WebElement clickHotel;
    @FindBy(xpath = "//*[@id='districs']/option[5]")
    private WebElement selectionHotel;

    /*Resorts*/
    @FindBy(xpath = "//*[@id='home']/section[1]/div/div/form/p[2]")
    private WebElement clickRoom;
    @FindBy(xpath = "//*[@id='resorts']/option[2]")
    private WebElement selectionRoom;

    /*Date in*/
    @FindBy(className= "ui-datepicker-trigger")
    private WebElement clickDateIn;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[6]/a")
    private WebElement selectionDateIn;
    /*Date out*/
    @FindBy(xpath= "//*[@id='home']/section[1]/div/div/form/p[4]/img")
    private WebElement clickDateOut;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[1]/a")
    private WebElement selectionDateOut;


    /*CheckBox*/
    @FindBy(className= "checkbox")
    private WebElement clickcheckbox;

    /*Persons*/
    @FindBy(id= "quantity_up")
    private WebElement clickcPersons;

    /*Zoek!*/
    @FindBy(className= "home-btn")
    private WebElement clickcButton;



    //Assert
    @FindBy(className = "result-block")
    private WebElement trueResultForm;


    public Reservation(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }


    public void setClickHotel() {
        clickOn(clickHotel);
        clickOn(selectionHotel);
    }
    public void setClickRoom() {
        clickOn(clickRoom);
        clickOn(selectionRoom);
    }
    public void setClickDateIn() {
        clickOn(clickDateIn);
        clickOn(selectionDateIn);
    }
    public void setClickDateOut() {
        clickOn(clickDateOut);
        clickOn(selectionDateOut);
    }
    public void setClickCheckbox() {
        clickOn(clickcheckbox);
    }
    public void setClickPersons() {
        clickOn(clickcPersons);
    }
    public void setClickButton() {
        clickOn(clickcButton);
        assertEquals(true, element(trueResultForm).isPresent());
    }


}






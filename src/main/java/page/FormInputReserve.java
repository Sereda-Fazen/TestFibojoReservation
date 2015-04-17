package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class FormInputReserve extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    /*Voornaam*/
    @FindBy(name = "firstname")
    private WebElement inputFirstName;

    /*Achternaam*/
    @FindBy(name = "secondname")
    private WebElement inputSecondName;

    /*E-mailadres*/
    @FindBy(name = "email")
    private WebElement inputEmail;

    /*Adres*/
    @FindBy(name = "address")
    private WebElement inputAddress;

    /*Stad*/
    @FindBy(name = "сity")
    private WebElement inputCity;

    /*Postcode*/
    @FindBy(name = "postcode")
    private WebElement inputPostcode;

    /*Telefoon*/
    @FindBy(name = "phone")
    private WebElement inputPhone;



    /*Visa Master-Cadr*/
    @FindBy(name = "CardNumber")
    private WebElement inputCardNumber;
    @FindBy(name = "CardHolder")
    private WebElement inputCardColdNumber;
    @FindBy(name = "CV2")
    private WebElement inputCardValue;

    //Agree
    @FindBy(xpath = "//*[@id='order']/section[1]/div[4]/form/div[2]/p[5]/span")
    private WebElement clickAgree;
    //Button
    @FindBy(xpath = "//*[@id='order']/section[1]/div[4]/form/div[2]/div/input")
    private WebElement clickButton;

    //assertTrue
    @FindBy(className = "payment-block")
    private WebElement paymentTrue;



    public FormInputReserve(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    public void setInputFirstName() {
       enter("Oliver").into(inputFirstName);

    }
    public void setInputSecondName() {
        enter("Brook").into(inputSecondName);

    }
    public void setInputEmail() {
        enter("fazen.illusix@gmail.com").into(inputEmail);
    }
    public void setInputAddress() {
        enter("Street, Test 12").into(inputAddress);

    }
    public void setInputCity() {
        enter("Holland").into(inputCity);

    }
    public void setInputPostcode() {
        enter("1265789").into(inputPostcode);

    }
    public void setInputPhone() {
        enter("+83566778864").into(inputPhone);

    }
    public void setInputCardNumber() {
        enter("234556677889990").into(inputCardNumber);

    }
    public void setInputCardColdNumber() {
        enter("87766565554444").into(inputCardColdNumber);

    }
    public void setInputCardValue() {
        enter("test").into(inputCardValue);

    }
    public void setInputCardAgree() {
        clickOn(clickAgree);
    }
    public void setClickButton() {
        clickOn(clickButton);
        assertTrue(element(paymentTrue).isPresent());
    }






}






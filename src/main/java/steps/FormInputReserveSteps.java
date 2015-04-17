package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.FormInputReserve;


public class FormInputReserveSteps extends ScenarioSteps {
    FormInputReserve formInputReserve;

    public FormInputReserveSteps(Pages pages) {
        super(pages);
    }

    @Step("Launch your web browser - 'Chrome'")
    public void start_browser() {
        FormInputReserve loginPage = getPages().get(FormInputReserve.class);
        loginPage.open();
    }

    @Step("Input first name ")
    public void addFirstName() {
        formInputReserve.setInputFirstName();
    }

    @Step("Input second name")
    public void addSecondName() {
        formInputReserve.setInputSecondName();
    }
    @Step("Input email")
    public void addEmail() {
        formInputReserve.setInputEmail();
    }

    @Step("Input address")
    public void addAddress() {
        formInputReserve.setInputAddress();
    }
    @Step("Input city")
    public void addCity() {
        formInputReserve.setInputCity();
    }

    @Step("Input postcode")
    public void addPostcode() {
        formInputReserve.setInputPostcode();
    }
    @Step("Input phone")
    public void addPhone() {
        formInputReserve.setInputPhone();
    }



    @Step("Input card number ")
    public void addCardNumber() {
        formInputReserve.setInputCardNumber();
    }
    @Step("Input card gold number")
    public void addCardColdNumber() {
        formInputReserve.setInputCardColdNumber();
    }
    @Step("Input card value")
    public void addCardValue() {
        formInputReserve.setInputCardValue();
    }
    @Step("Clicked agree")
    public void addClickCardAgree() {
        formInputReserve.setInputCardAgree();
    }
    @Step("Clicked button")
    public void addButton() {
        formInputReserve.setClickButton();
    }






}



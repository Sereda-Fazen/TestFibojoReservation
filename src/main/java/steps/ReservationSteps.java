package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Reservation;


public class ReservationSteps extends ScenarioSteps {
    Reservation reservationPage;

    public ReservationSteps(Pages pages) {
        super(pages);
    }

    @Step("Launch your web browser - 'Chrome'")
    public void start_browser() {
        Reservation loginPage = getPages().get(Reservation.class);
        loginPage.open();
    }

    @Step("Clicked 'Hotel'")
    public void addClickHotel() {
        reservationPage.setClickHotel();
    }
    @Step("Clicked 'Room'")
    public void addSelectionRoom() {
        reservationPage.setClickRoom();
    }
    @Step("Clicked 'Date in'")
    public void addClickDateIn() {
        reservationPage.setClickDateIn();
    }
    @Step("Clicked 'Date out'")
    public void addClickDateOut() {
        reservationPage.setClickDateOut();
    }
    @Step("Clicked 'Checkbox'")
    public void addClickCheckbox() {
        reservationPage.setClickCheckbox();
    }
    @Step("Clicked 'Persons'")
    public void addSelectionPersons() {
        reservationPage.setClickPersons();
    }

    @Step("Pushed 'Button'")
    public void addButton() {
        reservationPage.setClickButton();
    }



}



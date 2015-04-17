package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.FormReserve;


public class FormReserveSteps extends ScenarioSteps {
    FormReserve formReservarionPage;

    public FormReserveSteps(Pages pages) {
        super(pages);
    }

    @Step("Launch your web browser - 'Chrome'")
    public void start_browser() {
        FormReserve loginPage = getPages().get(FormReserve.class);
        loginPage.open();
    }

    @Step("Clicked 'RoomForReserveer'")
    public void addRoomForReserveer() {
        formReservarionPage.setClickForReserveer();
    }
    @Step("Clicked 'Reserveer Nu!'")
    public void addReserveerNu() {
        formReservarionPage.setClickReserveerNu();
    }

}



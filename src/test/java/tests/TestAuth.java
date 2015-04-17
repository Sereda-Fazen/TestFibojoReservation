package tests;


import jdk.nashorn.internal.ir.annotations.Ignore;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class TestAuth extends BeforeClass {
    @ManagedPages(defaultUrl = "http://fibogo.trustingdomains.com")
    public Pages pages;



    @WithTag("Sign Up")
    @Test
    public void TestFormReservationFull() throws InterruptedException {

        clickHotel1.addClickHotel();
        clickRoom.addSelectionRoom();
        clickDateIn.addClickDateIn();
        clickDateOut.addClickDateOut();
        checkbox.addClickCheckbox();
        clickPersons.addSelectionPersons();
        clickButton.addButton();

        roomForReserveer.addRoomForReserveer();
        reserveerNu.addReserveerNu();

        firstName.addFirstName();
        secondName.addSecondName();
        email.addEmail();
        address.addAddress();
        city.addCity();
        postcode.addPostcode();
        phone.addPhone();
        cardNumber.addCardNumber();
        cardColdNumber.addCardColdNumber();
        cardValue.addCardValue();

        agree.addClickCardAgree();
        button.addButton();
        Thread.sleep(3000);

    }



}




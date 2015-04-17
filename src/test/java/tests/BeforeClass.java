

package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.*;


import java.io.IOException;

import static org.hamcrest.core.Is.is;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    /**
     *
     */
    @Managed(uniqueSession = true, driver = "chrome")



    public WebDriver driver;

    public String IEPath = "C:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\IEDriverServer.exe";
    public String ChromePath = "E:\\Test\\Browsers\\chromedriver.exe";


    /*Form Reservation*/

    @Steps
    public ReservationSteps clickHotel1;
    @Steps
    public ReservationSteps clickRoom;
    @Steps
    public ReservationSteps clickDateIn;
    @Steps
    public ReservationSteps clickDateOut;
    @Steps
    public ReservationSteps checkbox;
    @Steps
    public ReservationSteps clickPersons;
    @Steps
    public ReservationSteps clickButton;

     /*Reservation Nu!*/

    @Steps
    public FormReserveSteps roomForReserveer;
    @Steps
    public FormReserveSteps reserveerNu;

    /*Form Input*/

    @Steps
    public FormInputReserveSteps firstName;
    @Steps
    public FormInputReserveSteps secondName;
    @Steps
    public FormInputReserveSteps email;
    @Steps
    public FormInputReserveSteps address;
    @Steps
    public FormInputReserveSteps city;
    @Steps
    public FormInputReserveSteps postcode;
    @Steps
    public FormInputReserveSteps phone;
    @Steps
    public FormInputReserveSteps cardNumber;
    @Steps
    public FormInputReserveSteps cardColdNumber;
    @Steps
    public FormInputReserveSteps cardValue;
    @Steps
    public FormInputReserveSteps agree;
    @Steps
    public FormInputReserveSteps button;




    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", IEPath );
        System.setProperty("webdriver.chrome.driver", ChromePath);
        clickHotel1.start_browser();
        driver.manage().window().maximize();


    }

    @After
    public void close() throws IOException {
        driver.close();
    }




    }




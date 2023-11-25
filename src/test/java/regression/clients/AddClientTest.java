package regression.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;

import java.io.IOException;
import java.time.Duration;

import static util.ConfigReader.*;

public class AddClientTest {
    WebDriver driver;
    @BeforeClass
    public void doLogin() throws IOException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);
        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        AddClient addClient = new AddClient(driver);

        // Sample data for testing
        String clientName = "John";
        String clientSurname = "Doe";
        String streetAddress1 = "123 Main St";
        String streetAddress2 = "Apt 101";
        String city = "New York";
        String state = "NY";
        String zipCode = "10001";
        String phoneNumber = "1234567890";
        String faxNumber = "9876543210";
        String mobileNumber = "555-555-5555";
        String emailAddress = "john.doe@example.com";
        String webAddress = "https://example.com";
        String vatId = "VAT123";
        String taxesCode = "TC456";

        // Fill in client details using the page methods
        /*addClient.setClientName(clientName);
        addClient.setClientSurname(clientSurname);
        addClient.setStreetAddress1(streetAddress1);
        addClient.setStreetAddress2(streetAddress2);
        addClient.setCity(city);
        addClient.setState(state);
        addClient.setZipCode(zipCode);
        addClient.setPhoneNumber(phoneNumber);
        addClient.setFaxNumber(faxNumber);
        addClient.setMobileNumber(mobileNumber);
        addClient.setEmailAddress(emailAddress);
        addClient.setWebAddress(webAddress);
        addClient.setVATID(vatId);
        addClient.setTaxesCode(taxesCode);*/

        addClient.setLanguage("English");
        addClient.setCountry("India");
        addClient.setGender("Female");
    }
}

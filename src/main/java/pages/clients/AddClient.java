package pages.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {
    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;
    @FindBy(xpath = "//input[@id='client_surname']") WebElement clientSurname;
    @FindBy(xpath = "//input[@id='client_address_1']") WebElement streetAddress1;
    @FindBy(xpath = "//input[@id='client_address_2']") WebElement streetAddress2;
    @FindBy(xpath = "//input[@id='client_city']") WebElement city;
    @FindBy(xpath = "//input[@id='client_state']") WebElement state;
    @FindBy(xpath = "//input[@id='client_zip']") WebElement zipCode;
    @FindBy(xpath = "//input[@id='client_phone']") WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='client_fax']") WebElement faxNumber;
    @FindBy(xpath = "//input[@id='client_mobile']") WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='client_email']") WebElement emailAddress;
    @FindBy(xpath = "//input[@id='client_web']") WebElement webAddress;
    @FindBy(xpath = "//input[@id='client_vat_id']") WebElement vATID;
    @FindBy(xpath = "//input[@id='client_tax_code']") WebElement taxesCode;

    @FindBy(xpath = "//span[@id='select2-client_language-container']")
    WebElement languageContainer;

    @FindBy(xpath = "//input[@role='searchbox']")
    WebElement searchbox;

    WebDriver driver;
    public void setLanguage(String language)
    {
        languageContainer.click();
        searchbox.sendKeys(language);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }

    @FindBy(xpath = "//span[@id='select2-client_country-container']")
    WebElement containerCountry;

    public void setCountry(String country)
    {
        containerCountry.click();
        searchbox.sendKeys(country);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy(xpath = "//span[@id='select2-client_gender-container']")
    WebElement containerGender;

    public void setGender(String gender)
    {
        containerGender.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }
    public AddClient(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void setClientName(String clientNameValue) {
        clientName.sendKeys(clientNameValue);
    }

    public void setClientSurname(String clientSurnameValue) {
        clientSurname.sendKeys(clientSurnameValue);
    }

    public void setStreetAddress1(String streetAddress1Value) {
        streetAddress1.sendKeys(streetAddress1Value);
    }

    public void setStreetAddress2(String streetAddress2Value) {
        streetAddress2.sendKeys(streetAddress2Value);
    }

    public void setCity(String cityValue) {
        city.sendKeys(cityValue);
    }

    public void setState(String stateValue) {
        state.sendKeys(stateValue);
    }

    public void setZipCode(String zipCodeValue) {
        zipCode.sendKeys(zipCodeValue);
    }

    public void setPhoneNumber(String phoneNumberValue) {
        phoneNumber.sendKeys(phoneNumberValue);
    }

    public void setFaxNumber(String faxNumberValue) {
        faxNumber.sendKeys(faxNumberValue);
    }

    public void setMobileNumber(String mobileNumberValue) {
        mobileNumber.sendKeys(mobileNumberValue);
    }

    public void setEmailAddress(String emailAddressValue) {
        emailAddress.sendKeys(emailAddressValue);
    }

    public void setWebAddress(String webAddressValue) {
        webAddress.sendKeys(webAddressValue);
    }

    public void setVATID(String vatIdValue) {
        vATID.sendKeys(vatIdValue);
    }

    public void setTaxesCode(String taxesCodeValue) {
        taxesCode.sendKeys(taxesCodeValue);
    }

}

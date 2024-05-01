package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ContactFormPage {
    private WebDriver driver;
    By firstNameField = By.id("first_24");
    By lastNameField = By.id("last_24");
    By lastNameFirstNameFieldErruer = By.xpath("//*[@id=\"cid_24\"]/div[2]/span");
    By companyNameField = By.id("input_26");
    By companyNameFieldErruer = By.xpath("//*[@id=\"cid_26\"]/div/span");
    By addressField = By.id("input_15");
    By addressFieldErruer = By.xpath("//*[@id=\"cid_15\"]/div/span");
    By emailField = By.id("input_3");
    By emailFieldErrur = By.xpath("//*[@id=\"cid_3\"]/div");
    By countryCodeField = By.id("input_25_area");
    By phoneNumberField = By.id("input_25_phone");
    By countryCodePhoneNumberFieldErruer = By.xpath("//*[@id=\"cid_25\"]/div[2]");
    By selectFromSelector = By.id("input_8");
    By selectFromSelectorErruer = By.xpath("//*[@id=\"cid_8\"]/div/span");
    By messageField = By.id("input_6");
    By messageFieldErruer = By.xpath("//*[@id=\"cid_6\"]/div");
    By accepteLesConditions = By.id("input_12_0");
    By accepteLesConditionsErruer = By.xpath("//*[@id=\"cid_12\"]/div[2]/span");
    List<By> elements = new ArrayList<>();

    By ErrurMessage = By.xpath("//*[@id=\"cid_16\"]/div[2]/p");
    By successMessage = By.xpath("//*[@id=\"stage\"]/div[1]/div[1]/div[2]/div[1]/div/h1");
    By mailLogo = By.xpath("//*[@id=\"stage\"]/div[1]/div[1]/div[1]/img");
    By submitButton = By.id("input_16");
    private String url = "https://form.jotform.com/240846038897571";
    private String ErrueMessageForm = "There are errors on the form. Please fix them before continuing.";

    public ContactFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    public void enterText(By selector, String text) {
        driver.findElement(selector).sendKeys(text);
    }

    public void selectIndustrySector(String sector) {
        Select objSelect = new Select(driver.findElement(selectFromSelector));
        objSelect.selectByVisibleText(sector);
    }

    public void acceptTermsAndConditions() {
        driver.findElement(accepteLesConditions).click();
    }

    public void clickSubmitButton() throws Exception {
        utils u = new utils();
        u.scrollToElement(driver.findElement(submitButton), driver);
        driver.findElement(submitButton).click();
    }

    public void verifySuccessMessage(String message) {
        String get_url = driver.getCurrentUrl();
        Assert.assertTrue(get_url.contains("submit"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(visibilityOfElementLocated(mailLogo));

        String bodyText = driver.findElement(successMessage).getText();
        Assert.assertEquals(message, bodyText);
    }

    public void verifyErrurMessage() {

        String bodyText = driver.findElement(ErrurMessage).getText();
        Assert.assertEquals(ErrueMessageForm, bodyText);

        elements.add(lastNameFirstNameFieldErruer);
        elements.add(companyNameFieldErruer);
        elements.add(addressFieldErruer);
        elements.add(emailFieldErrur);
        elements.add(countryCodePhoneNumberFieldErruer);
        elements.add(messageFieldErruer);
        elements.add(accepteLesConditionsErruer);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        for (int i = 0; i < elements.size(); i++)
            wait.until(visibilityOfElementLocated(elements.get(i)));


    }
}

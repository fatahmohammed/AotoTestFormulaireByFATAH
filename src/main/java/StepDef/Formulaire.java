package StepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;


public class Formulaire {
    private ContactFormPage contactFormPage;
    private WebDriver driver;

    private void initialisation() {
        driver = new ChromeDriver();
    }

    public void dirverFermuture() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("l'utilisateur accède à la page du formulaire de contrat")
    public void openContactFormPage() {
        initialisation();
        contactFormPage = new ContactFormPage(driver);
        contactFormPage.open();
    }

    @When("l'utilisateur remplit les details suivants :")
    public void iFillInTheDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        contactFormPage.enterText(contactFormPage.firstNameField, data.get(0).get("Prénom"));
        contactFormPage.enterText(contactFormPage.lastNameField, data.get(0).get("Nom"));
        contactFormPage.enterText(contactFormPage.companyNameField, data.get(0).get("Nom de l'entreprise"));
        contactFormPage.enterText(contactFormPage.addressField, data.get(0).get("Adresse"));
        contactFormPage.enterText(contactFormPage.emailField, data.get(0).get("Adresse email"));
        contactFormPage.enterText(contactFormPage.countryCodeField, data.get(0).get("Code du pays"));
        contactFormPage.enterText(contactFormPage.phoneNumberField, data.get(0).get("Numéro de téléphone"));
        contactFormPage.selectIndustrySector(data.get(0).get("Secteur"));
        contactFormPage.enterText(contactFormPage.messageField, data.get(0).get("Message"));
    }

    @When("l'utilisateur accepte les conditions")
    public void acceptTermsAndConditions() {
        contactFormPage.acceptTermsAndConditions();
    }

    @And("l'utilisateur soumit le formulaire")
    public void clickSubmitButton() throws Exception {
        contactFormPage.clickSubmitButton();
    }

    @Then("un message de succès {string} s'affiche")
    public void verifySuccessMessage(String message) {
        contactFormPage.verifySuccessMessage(message);
        dirverFermuture();
    }

    @Then("des messages d'erreur s'affiche")
    public void verifyErruerMessage() {
        contactFormPage.verifyErrurMessage();
        dirverFermuture();
    }


}

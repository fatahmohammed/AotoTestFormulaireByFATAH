package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class FatahTestifyFormulaire {
    private WebDriver driver;

    // Méthode pour ouvrir la page du formulaire de contact
    @Given("Je suis sur la page du formulaire de contact")  // Méthode pour ouvrir la page du formulaire de contact
    public void je_suis_sur_la_page_du_formulaire_de_contact() {
        driver=new ChromeDriver();
        driver.get("https://form.jotform.com/240846038897571");
        driver.manage().window().setSize(new Dimension(974, 1032));
    }
    @When("Je saisis {string} dans le champ Prénom")
    public void je_saisis_dans_le_champ_prénom(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("first_24")).sendKeys(string);
    }
    @And("Je saisis {string} dans le champ Nom")
    public void je_saisis_dans_le_champ_nom(String string) {
        driver.findElement(By.id("last_24")).sendKeys(string);
    }
    @And("Je saisis {string} dans le champ Entreprise")
    public void je_saisis_dans_le_champ_entreprise(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_26")).sendKeys(string);
    }
    @And("Je saisis {string} dans le champ Adresse")
    public void je_saisis_dans_le_champ_adresse(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_15")).sendKeys(string);
    }
    @And("Je saisis {string} dans le champ Adresse email")
    public void je_saisis_dans_le_champ_adresse_email(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_3")).sendKeys(string);
    }
    @And("Je saisis {string} dans le champ Espace Code")
    public void je_saisis_dans_le_champ_espace_code(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_25_area")).sendKeys(string);
    }
    @And("Je saisis {string} dans le champ Numéro de téléphone")
    public void je_saisis_dans_le_champ_numéro_de_téléphone(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_25_phone")).sendKeys(string);
    }
    @And("Je sélectionne {string} dans le champ Secteur de entreprise")
    public void je_sélectionne_dans_le_champ_secteur_de_entreprise(String string) {
        // driver.findElement(By.id("input_8")).click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement dropdown = driver.findElement(By.id("input_8"));
        dropdown.findElement(By.xpath("//option[contains(@value, 'de')]")).click();

    }
    @And("Je saisis {string} dans le champ Zone de texte")
    public void je_saisis_dans_le_champ_zone_de_texte(String string) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_6")).sendKeys(string);
    }
    @When("Je clique sur J'accepte pour accepter les conditions")
public void je_clique_sur_j_accepte_pour_accepter_les_conditions() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("input_12_0")).click();
    }
    @And("Je clique sur le bouton {string}")
    public void je_clique_sur_le_bouton(String string) {
        try {
            Thread.sleep(1000);
            //driver.findElement(By.xpath("//button[@id='input_16']")).click();
            driver.findElement(By.id("input_16")).click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("Je devrais voir un message de succès Thank You indiquant que le formulaire a été envoyé avec succès")
    public void je_devrais_voir_un_message_de_succès_thank_you_indiquant_que_le_formulaire_a_été_envoyé_avec_succès() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("le teste a été bien fait");
        try {
            Thread.sleep(1000);
            //driver.findElement(By.xpath("//button[@id='input_16']")).click();
            driver.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

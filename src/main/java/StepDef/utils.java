package StepDef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utilise {
    private void scrollToElement(WebElement webElement, WebDriver driver) throws Exception {
        String js_code = "arguments[0].scrollIntoView();";

    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToFooter {
    public static void main(String[] args) {
        // Specify the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        dpublic class ScrollToFooter {
            public static void main(String[] args) {
                // Specify the path to the ChromeDriver executable
                System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

                // Initialize the WebDriver
                WebDriver driver = new ChromeDriver();

                // Navigate to the webpage
                driver.get("http://www.scrapingbee.com");

                // JavaScript code to scroll to a particular element
                String jsCode = "arguments[0].scrollIntoView()
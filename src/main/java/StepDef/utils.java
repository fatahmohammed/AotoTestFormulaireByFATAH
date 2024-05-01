package StepDef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utils {
    public void scrollToElement(WebElement webElement, WebDriver driver) throws Exception {
        String js_code = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(js_code, webElement);
        
    }
}


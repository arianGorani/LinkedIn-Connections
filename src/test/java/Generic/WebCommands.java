package Generic;

import DriverWrapper.Web;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class WebCommands {
    Alert myAlert;


    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement getElement(By locator) {
        // wait for 30sec before declaring element is not found
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return element;
    }

    public void switchToNextWindow() {
        Set<String> allHandles = Web.getDriver().getWindowHandles();
        String currentHandle = Web.getDriver().getWindowHandle();
        for (String nextHandle : allHandles) {
            if (!nextHandle.equalsIgnoreCase(currentHandle)) {
                Web.getDriver().switchTo().window(nextHandle);
            }
        }

    }

    public WebElement getElement(String xPath) {
        return Web.getDriver().findElement(By.xpath(xPath));
    } // doesn't wait

    public List<WebElement> getElements(By locator) {
        // wait for 30sec before declaring element is not found
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Elements are not found within 30 seconds");

        List<WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
        return elements;
    }

    public void clickThis(WebElement element) {
        element.click();
    }

    public void clickThis(By locator) {
        getElement(locator).click();
    }

    public String getCurrentDateWithFormat(String pattern) {
        Date currentTimeDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(currentTimeDate);
    }

    public void type(WebElement element, String data) {
        element.sendKeys(data);
    }

    public void type(By locator, String data) {
        getElement(locator).sendKeys(data);
    }

    public boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public boolean isElementEnabled(WebElement element) {
        return element.isEnabled();
    }

    public boolean isElementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public boolean isElementSelected(WebElement element) {
        return element.isSelected();
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public String getElementAttributeValue(WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }

    public void moveMouseOverElement(WebElement element) {
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).build().perform();
    }

    public void moveMouseOverElement(By locator) {
        Actions act = new Actions(Web.getDriver());
        WebElement element = getElement(locator);
        act.moveToElement(element).build().perform();
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }

    public void scrollDownByPixel(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy(0," + pixels + ");");
    }

    public void scrollUpByPixel(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy(0,-" + pixels + ");");
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToElement(String xPathSelectorOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        WebElement element = getElement(xPathSelectorOfElement);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectFromDropdown(WebElement element, String data) {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(data);
    }

    public void selectFromDropdown(By locator, String data) {
        WebElement element = getElement(locator);
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(data);
    }

    public void selectFromAutoSuggestion(By locator, String userChoice) {
        List<WebElement> allSuggestions = getElements(locator);
        for (WebElement suggestionElement : allSuggestions) {
            String suggestion = suggestionElement.getText();
            if (suggestion.equalsIgnoreCase(userChoice)) {
                clickThis(suggestionElement);
                break;
            }
        }
    }

    public String getCurrentHandle() {
        return Web.getDriver().getWindowHandle();
    }

    public Set<String> setAllHandlles() {
        return Web.getDriver().getWindowHandles();
    }

    public void switchToWindow(String handle) {
        Web.getDriver().switchTo().window(handle);
    }

    public void switchToAlert(){
        myAlert = Web.getDriver().switchTo().alert();
    }

    public String getAlertText(){
        return myAlert.getText();
    }

    public void clickOnNegativeButton(){
        myAlert.dismiss();
    }

    public void clickOnPositiveButton(){
        myAlert.accept();
    }

    public void typeOnAlert(String data){
        myAlert.sendKeys(data);
    }

    public void switchToFrame(String id){
        Web.getDriver().switchTo().frame(id);
    }

    public void switchToFrame(By locator){
        WebElement frame = getElement(locator);
        Web.getDriver().switchTo().frame(frame);
    }

    public void switchToFrame(int index){
        Web.getDriver().switchTo().frame(index);
    }


    public void waitUntilElementVisible(WebElement element){
        WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 10);
        eWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementClickable(WebElement element){
        WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 10);
        eWait.until(ExpectedConditions.elementToBeClickable(element));
    }
















































}
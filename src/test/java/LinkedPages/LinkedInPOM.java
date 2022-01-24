package LinkedPages;

import DriverWrapper.Web;
import Generic.WebCommands;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LinkedInPOM extends WebCommands {
    By searchOnHomepage = By.xpath("//input[contains(@class,'search')]");
    By userNameAtLogin = By.xpath("//input[@id='username']");
    By passwordAtLogin = By.xpath("//input[@id='password']");
    By signInButtonAtLogin = By.xpath("//button[@aria-label='Sign in']");
    By allMenuOptionsUnderAccountName = By.xpath("//ul[starts-with(@class, 'search-reusables__filter')]//li");
    By connectButtons = By.xpath("//span[text()='Connect']");
    By confirmSendButton = By.xpath("//span[text()='Send']");
    By signInButtonAtHomePage = By.xpath("//a[@class='nav__button-secondary']");
    By nextButton = By.xpath("//span[text()='Next']");
    By yourInvitationOnTheWay = By.xpath("//h2[@id='send-invite-modal']");
    By dialogBox = By.xpath("//div[@role='dialog']");
    By toVerifyThisMember = By.xpath("//div[@role='dialog']//h2");
    By closeButtonID = By.xpath("//div[@role='dialog']//button[@data-test-modal-close-btn]//li-icon");
    By gotItButton = By.xpath("//span[text()='Got it']");





    int count = 0;


    public void loginToMyAccount(String email, String pass) {
        clickThis(signInButtonAtHomePage);
        sleep(2000);
        clickThis(userNameAtLogin);
        type(userNameAtLogin, email);
        sleep(2000);
        clickThis(userNameAtLogin);
        type(passwordAtLogin, pass);
        sleep(2000);
        clickThis(signInButtonAtLogin);
    }

    public void searchFor(String nameToSearch) {
        clickThis(searchOnHomepage);
        type(searchOnHomepage, nameToSearch + "\n");
        sleep(2000);
    }

    public void clickOnTheTabUnderAccount(String tabName) {
        sleep(3000);
        List<WebElement> listOfOptions = getElements(allMenuOptionsUnderAccountName);
        for (WebElement tab : listOfOptions) {
            if (tab.getText().equalsIgnoreCase(tabName)) {
                clickThis(tab);
                break;
            }
        }
    }

    public void connectWithPeople(){
        sleep(3000);
        List<WebElement> listOfOptions = getElements(connectButtons);
        for (WebElement tab : listOfOptions) {
            if (tab.getText().equalsIgnoreCase("Connect")) {
                clickThis(tab);
                if(isElementDisplayed(yourInvitationOnTheWay)){
                    String s1 = getElementText(yourInvitationOnTheWay);
                    if(s1.equalsIgnoreCase("connect")){
                        moveMouseOverElement(closeButtonID);
                        clickThis(closeButtonID);
                    }else {
                        clickThis(confirmSendButton);
                        count++;
                        System.out.println("Count " + count);
                    }

                }else if(isElementDisplayed(gotItButton)){
                    sleep(1000);
                    clickThis(gotItButton);
                    System.out.println("You’ve reached the weekly invitation limit");
                    Web.closePage();
                }
            }
        }
    }

    public void scrollToBottomOfPage() {
        //sleep(1000);
        scrollToBottom();
        //sleep(1000);
        clickThis(nextButton);
    }






}
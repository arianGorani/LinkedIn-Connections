package LinkedInSD;


import LinkedPages.LinkedInPOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LinkedInSD {
    LinkedInPOM linkedInPOM = new LinkedInPOM();


    @When("^I enter (.*) in email field and I enter (.*) in password field$")
    public void loginToAccount(String email, String pass) {
        linkedInPOM.loginToMyAccount(email, pass);
    }

    @And("^I search for (.*) on the homepage$")
    public void search(String nameToSearch){
        linkedInPOM.searchFor(nameToSearch);
    }

    @And("^I click on (.*) option right under profile$")
    public void clickOnFirstSearchResult(String option){
        linkedInPOM.clickOnTheTabUnderAccount(option);
    }

    @Then("^I press all connect buttons$")
    public void pressConnectButtons(){
        for (int i = 0; i <= 50; i++){
            linkedInPOM.connectWithPeople();
            linkedInPOM.scrollToBottomOfPage();
        }
    }





}

package stepdefinitions;

import org.testng.Assert;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Then("Main page is displayed")
    public void isMainPageDisplayed() {
        step("I am on the Wikipedia Main Page");
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main Page is not displayed");
    }

    @When("I search for the term {string} and click search button")
    public void searchText(String inputText) {
        step(String.format("I search for the term %s and click search button", inputText));
        mainPage.inputText(inputText);
    }

    @When("I input {string} text, change search language to {language} and click submit button")
    public void searchTextUsingSpanishLanguage(String inputText, Languages selectedLanguage) {
        step(String.format("I input %s text, change search language to %s and click submit button", inputText,
                selectedLanguage));
        mainPage.inputTextOnSelectedLanguage(inputText, selectedLanguage);
    }
}

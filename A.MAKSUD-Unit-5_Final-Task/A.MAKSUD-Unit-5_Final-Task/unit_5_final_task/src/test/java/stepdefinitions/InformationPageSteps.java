package stepdefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import pages.InformationPage;

import static io.qameta.allure.Allure.step;

public class InformationPageSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("The information page for the {string} article is displayed")
    public void isInformationPageDisplayed(String pageName) {
        step(String.format("The information page for the %s article is displayed", pageName));
        Assert.assertTrue(informationPage.getHeadingLabel().contains(pageName),
                "The correct Information Page is not displayed");
    }
}

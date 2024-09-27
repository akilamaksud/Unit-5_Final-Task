package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticlePage;
import org.testng.Assert;

import static io.qameta.allure.Allure.step;

public class ArticlePageSteps {
    private final ArticlePage articlePage = new ArticlePage();

    @When("I Click on Tool menu button and Download as PDF button on the Article page")
    public void downloadAsPdfButton() {
        step("I Click on Tool menu button and Download as PDF button on the Article page");
        articlePage.clickDownloadAsPdfButton();
    }

    @When("I click on the Tool menu button and Page information button on the Article page")
    public void clickOnToolsMenuandPageInformation() {
        step("I click on the Tool menu button and Page information button on the Article page");
        articlePage.clickOnPageInformation();
    }

    @Then("The article page for {string} is open")
    public void isPageDisplayed(String pageName) {
        step(String.format("The article page for %s is open", pageName));
        Assert.assertTrue(articlePage.getHeadingLabel().contains(pageName),
                String.format("The %s Article Page is not Displayed", pageName));
    }
}

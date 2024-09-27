package stepdefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import pages.DownloadAsPdfPage;
import utils.BrowserUtils;

import static io.qameta.allure.Allure.step;

public class DownloadAsPdfPageSteps {
    private final DownloadAsPdfPage downloadAsPdfPage = new DownloadAsPdfPage();

    @Then("The file is downloaded by clicking on the Download button")
    public void downloadPdf() {
        step("The file is downloaded by clicking on the Download button");
        String downloadedFileName = downloadAsPdfPage.getDownloadedFileName();
        downloadAsPdfPage.clickDownloadButton();
        Assert.assertTrue(BrowserUtils.isFileDownloaded(downloadedFileName), String.format("The %s file does not exist", downloadedFileName));
    }
}

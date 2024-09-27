package pages;

import org.openqa.selenium.By;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;

public class DownloadAsPdfPage extends Form {
    private final IButton downloadButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"),
            "Download Button");
    private final ILabel downloadedFileName = getElementFactory()
            .getLabel(By.className("mw-electronpdfservice-selection-label-desc"), "Downloaded File's Name");

    public DownloadAsPdfPage() {
        super(By.xpath("//div[@class='mw-electronpdfservice-selection-label-text']"), "Download As PDF Page");
    }

    public void clickDownloadButton() {
        downloadButton.clickAndWait();
    }

    public String getDownloadedFileName() {
        return downloadedFileName.getText();
    }
}

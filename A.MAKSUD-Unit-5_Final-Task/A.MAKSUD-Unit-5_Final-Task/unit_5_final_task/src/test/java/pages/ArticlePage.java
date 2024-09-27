package pages;

import org.openqa.selenium.By;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;

public class ArticlePage extends Form {
    private final By PAGE_INFORMATION = By.id("coll-download-as-rl");
    private final By DOWNLOAD_AS_PDF = By.id("t-info");
    private final IButton toolsMenu = getElementFactory().getButton(
            By.xpath("//nav[@class='vector-page-tools-landmark']/div"),
            "Tools Menu");
    private final ILabel headingLabel = getElementFactory().getLabel(By.xpath("//span[@class='mw-page-title-main']"),
            "Heading Label");

    public ArticlePage() {
        super(By.xpath("//span[@class='mw-page-title-main']"), "Article Page");
    }

    public void clickDownloadAsPdfButton() {
        toolsMenu.clickAndWait();
        toolsMenu.findChildElement(PAGE_INFORMATION, ElementType.BUTTON).clickAndWait();
    }

    public void clickOnPageInformation() {
        toolsMenu.clickAndWait();
        toolsMenu.findChildElement(DOWNLOAD_AS_PDF, ElementType.BUTTON).clickAndWait();
    }

    public String getHeadingLabel() {
        return headingLabel.getText();
    }
}

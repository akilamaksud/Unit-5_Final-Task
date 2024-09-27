package pages;

import org.openqa.selenium.By;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;

public class InformationPage extends Form {
    private final ILabel headingLabel = getElementFactory().getLabel(By.xpath("//h1[@id='firstHeading']"),
            "Heading Text");

    public InformationPage() {
        super(By.xpath("//h2[@id='Basic_information']"), "Information Page");
    }

    public String getHeadingLabel() {
        return headingLabel.getText();
    }
}

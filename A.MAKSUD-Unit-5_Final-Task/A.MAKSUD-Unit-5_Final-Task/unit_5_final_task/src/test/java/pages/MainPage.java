package pages;

import org.openqa.selenium.By;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.Languages;

public class MainPage extends Form {
    private final ITextBox searchBox = getElementFactory().getTextBox(By.id("searchInput"), "Search Box");
    private final IButton searchButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"),
            "Search Button");
    private final IComboBox searchLanguage = getElementFactory().getComboBox(By.id("searchLanguage"),
            "Search Language Dropdown", ElementState.EXISTS_IN_ANY_STATE);

    public MainPage() {
        super(By.xpath("//img[@class='central-featured-logo']"), "Main Page");
    }

    public void inputText(String inputText) {
        searchBox.clearAndType(inputText);
        searchButton.click();
    }

    public void inputTextOnSelectedLanguage(String inputText, Languages selectedLanguage) {
        searchBox.clearAndType(inputText);
        searchLanguage.clickAndSelectByValue(selectedLanguage.getValue());
        searchButton.click();
    }
}

package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class HerokuAppPage {

    public HerokuAppPage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[text() = 'Add/Remove Elements']")
    private WebElement addRemoveElementsExample;

    @FindBy(xpath = "//a[text() = 'Checkboxes']")
    private WebElement checkboxesExample;

    @FindBy(xpath = "//a[text() = 'Inputs']")
    private WebElement inputsExample;

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElementButton;

    @FindBy(xpath = "//button[text()='Delete']")
    private List<WebElement> deleteButton;

    @FindBy(css = "[type=checkbox]")
    private List<WebElement> checkbox;

    @FindBy(tagName = "input")
    private WebElement input;
}

package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HerokuAppPage;

import static java.lang.Boolean.parseBoolean;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesTest extends BaseTest {

    HerokuAppPage herokuAppPage;

    @BeforeMethod
    public void openExample() {
        herokuAppPage = new HerokuAppPage(getDriver());
        herokuAppPage.getCheckboxesExample().click();
    }

    @Test(description = "Проверка чекбоксов")
    public void checkBoxesCheckedTest() {
        assertFalse(parseBoolean(herokuAppPage.getCheckbox().get(0).getAttribute("checked")));
        herokuAppPage.getCheckbox().get(0).click();
        assertTrue(parseBoolean(herokuAppPage.getCheckbox().get(0).getAttribute("checked")));
        assertTrue(parseBoolean(herokuAppPage.getCheckbox().get(1).getAttribute("checked")));
        herokuAppPage.getCheckbox().get(1).click();
        assertFalse(parseBoolean(herokuAppPage.getCheckbox().get(1).getAttribute("checked")));
    }
}

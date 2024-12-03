package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HerokuAppPage;

import static java.lang.Boolean.parseBoolean;

public class CheckBoxesTest extends BaseTest {

    HerokuAppPage herokuAppPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void openExample() {
        herokuAppPage = new HerokuAppPage(getDriver());
        herokuAppPage.getCheckboxesExample().click();
    }

    @Test(description = "Проверка чекбоксов")
    public void checkBoxesCheckedTest() {
        softAssert.assertFalse(parseBoolean(herokuAppPage.getCheckbox().get(0).getAttribute("checked")));
        herokuAppPage.getCheckbox().get(0).click();
        softAssert.assertTrue(parseBoolean(herokuAppPage.getCheckbox().get(0).getAttribute("checked")));
        softAssert.assertTrue(parseBoolean(herokuAppPage.getCheckbox().get(1).getAttribute("checked")));
        herokuAppPage.getCheckbox().get(1).click();
        softAssert.assertFalse(parseBoolean(herokuAppPage.getCheckbox().get(1).getAttribute("checked")));
        softAssert.assertAll();
    }
}

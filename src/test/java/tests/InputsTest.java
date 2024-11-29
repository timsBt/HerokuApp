package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HerokuAppPage;

import static org.testng.Assert.assertEquals;

public class InputsTest  extends BaseTest {

    HerokuAppPage herokuAppPage;

    @BeforeMethod
    public void openExample() {
        herokuAppPage = new HerokuAppPage(getDriver());
        herokuAppPage.getInputsExample().click();
    }

    @Test(description = "Проверка изменения значения в поле ввода клавишами Вверх и Вниз")
    public void inputsTest() {
        herokuAppPage.getInput().sendKeys("10");
        herokuAppPage.getInput().sendKeys(Keys.ARROW_UP);
        assertEquals(herokuAppPage.getInput().getAttribute("value"), "11");
        herokuAppPage.getInput().sendKeys(Keys.ARROW_DOWN);
        herokuAppPage.getInput().sendKeys(Keys.ARROW_DOWN);
        assertEquals(herokuAppPage.getInput().getAttribute("value"), "9");
        herokuAppPage.getInput().sendKeys(Keys.CONTROL + "A");
        herokuAppPage.getInput().clear();
        herokuAppPage.getInput().sendKeys("ABCD");
        assertEquals(herokuAppPage.getInput().getAttribute("value"), "");
    }
}

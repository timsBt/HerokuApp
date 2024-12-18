package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HerokuAppPage;

public class AddRemoveElementsTest extends BaseTest {

    HerokuAppPage herokuAppPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void openExample() {
        herokuAppPage = new HerokuAppPage(getDriver());
        herokuAppPage.getAddRemoveElementsExample().click();
    }

    @Test(description = "Проверка количества элементов после добавления и удаления")
    public void addAndRemoveTest() {
        int countDeleteButton;
        herokuAppPage.getAddElementButton().click();
        herokuAppPage.getAddElementButton().click();
        countDeleteButton = herokuAppPage.getDeleteButton().size();
        softAssert.assertEquals(countDeleteButton, 2);
        herokuAppPage.getDeleteButton().get(1).click();
        countDeleteButton = herokuAppPage.getDeleteButton().size();
        softAssert.assertEquals(countDeleteButton, 1, "Количество элементов больше одного");
        softAssert.assertAll();
    }
}

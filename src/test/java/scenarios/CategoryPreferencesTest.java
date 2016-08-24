package scenarios;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CategoryPreferencesPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import listeners.ScreenshootsListener;

/**
 * Created by buddyarifin on 8/11/16.
 */

@Listeners(ScreenshootsListener.class)
@Features("Category Feature")
public class CategoryPreferencesTest extends AndroidSetup {

    @Stories("Verify Category can be Accessed after Login")
    @Title("Verify Contents and Category accessible after First Time Login")
    @TestCaseId("TC_CATEGORY_04_001")
    @Test(priority = 1)
    public void verifyAllContensOfCategoryPreferencesPage() {
        LoginPage loginPage = new LoginPage(driver);
        CategoryPreferencesPage categoryPreferencesPage = loginPage.clickSkipButton();
        categoryPreferencesPage.verifyAllContentsOfCategoryPage();
    }

    @Stories("As a User I want enable Access Category in Profile Edit")
    @Title("Verify User Category can be Accessed in Profile Edit")
    @TestCaseId("TC_CATEGORY_04_002")
    @Test(priority = 2)
    public void verifyCategoryPreferencesOnProfileEdit() {}

    @Stories("As a User I want enable Select 1 Index Category")
    @Title("Verify User 1 Index Category can be Selected")
    @TestCaseId("TC_CATEGORY_04_003")
    @Test(priority = 3)
    public void verifyUserAbleToSelectedOneCategory() {}

    @Stories("As a User I want enable Select 2 Index Category")
    @Title("Verify User 2 Index Category can be Selected")
    @TestCaseId("TC_CATEGORY_04_004")
    @Test(priority = 4, enabled = false)
    public void verifyUserAbleToSelectedTwoCategory() {}

    @Stories("Verify User 3 Index Category can be Selected")
    @Title("As a User I want enable Select 3 Index Category")
    @TestCaseId("TC_CATEGORY_04_005")
    @Test(priority = 5, enabled = false)
    public void verifyUserAbleToSelectThreeCategory() {}

    @Stories("As a User I Want Unselected 1 Category")
    @Title("Verify User Unselected 1 Category")
    @TestCaseId("TC_CATEGORY_04_006")
    @Test(priority = 6)
    public void verifyUserAbleToUnSelectCategory() {}

    @Stories("As a User I Will not Able to Select More 3 Index Category")
    @Title("Verify User Will not Able Selected More than 3 Index Category")
    @TestCaseId("TC_CATEGORY_04_007")
    @Test(priority = 7)
    public void verifyUserNotAbleToSelectedMoreThan3Category() {}

    @Stories("As a User I Will not Able To Select More 3 Index Category")
    @Title("Verify User Will not Able Selected More than 3 Index Category after Edit")
    @TestCaseId("TC_CATEGORY_04_008")
    @Test(priority = 8)
    public void verifyUserNotAbleToSelectedMoreThan3CategoryAfterEdit() {}

    @Stories("As a User I Will not seeing Category Preferences when Login for a second time")
    @Title("Verify System not display Category Preferences when not First Time Login")
    @TestCaseId("TC_CATEGORY_04_009")
    @Test(priority = 8)
    public void verifyUserNotAbleToAccessCategoryOnSecondLogin() {}

}

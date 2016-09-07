package scenarios;

import org.testng.annotations.Test;
import pages.CategoryPreferencesPage;
import pages.ListingPage;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by NugrohoSantoso on 9/7/16.
 */
public class ListingTest extends AndroidSetup {
    CategoryPreferencesPage categoryPreferencesPage;
    ListingPage listingPage;
    LoginPage loginPage;

    @Stories("As a User I want to See Content in ListingPage")
    @Title("Verify System able to Display Content in ListingPage")
    @TestCaseId("TC_LISTING_06_001")
    @Test(priority = 1)
    public void verifyContentDisplayInListingPage()
    {
        loginPage.clickSkipButton();
        categoryPreferencesPage.clickSkipBtn();
        listingPage.verifyContentsOfListingPage();
    }

    @Stories("As a User I want enable Search ads")
    @Title("Verify Search ads by Keyword in Search Box")
    @TestCaseId("TC_LISTING_06_002")
    @Test(priority = 2)
    public void userAbleSearchAdsByInputtedKeyword()
    {
        loginPage.clickSkipButton();
        categoryPreferencesPage.clickSkipBtn();
    }

    @Stories("As a User I want to Click 1Km dari Kamu")
    @Title("Verify User able to redirect to Radius Selection Page")
    @TestCaseId("TC_LISTING_06_004")
    @Test(priority = 2)
    public void userAbleToClick1KMDariKamuButton()
    {
        loginPage.clickSkipButton();
        categoryPreferencesPage.clickSkipBtn();
        listingPage.clickJarakDariKamuBtn();
    }
}

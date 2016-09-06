package scenarios;

import listeners.ScreenshootsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by NugrohoSantoso on 9/6/16.
 */
@Listeners(ScreenshootsListener.class)
@Features("Login Feature")
public class FilterTest extends AndroidSetup{
    private FilterPage filterPage;

    @Stories("As a User I want See Content in Filter Page")
    @Title("Verify System Display Content in Filter Page")
    @TestCaseId("TC_FILTER_08_002")
    @Test(priority = 1)
    public void verifyAllContentInFilterPage()
    {
        filterPage.verifyAllContentOfFilterPage();
    }

    @Stories("As a User I want to Able Input Keyword Search")
    @Title("Verify Listing ads sorted by inputted keyword")
    @TestCaseId("TC_FILTER_08_003")
    @Test(priority = 2)
    public void verifyListingAdsSortedByInputtedKeyword()
    {
        filterPage.inputKeywordSearchField();
        filterPage.clickSimpanButton();
    }

    @Stories("As a user i want see listing by current location")
    @Title("Verify Listing ads sorted by current location")
    @TestCaseId("TC_FILTER_08_004")
    @Test(priority = 3)
    public void verifyListingAdsSortedByCurrentLocation()
    {
        filterPage.inputKeywordSearchField();
        filterPage.clickMyLocationButton();
        filterPage.clickSimpanButton();
    }

    @Stories("As a user i want see listing by input price range")
    @Title("Verify Listing ads sorted by inputted price range")
    @TestCaseId("TC_FILTER_08_005")
    @Test(priority = 4)
    public void verifyListingAdsSortedByInputtedPriceRange()
    {
        filterPage.inputKeywordSearchField();
        filterPage.clickMyLocationButton();
        filterPage.inputMinPriceRange();
        filterPage.inputMaxPriceRange();
        filterPage.clickSimpanButton();
    }

    @Stories("As a user i want see listing by nearest, newest, cheaper, expensive")
    @Title("Verify Listing ads sorted by selected nearest, newest, cheaper, expensive")
    @TestCaseId("TC_FILTER_08_006")
    @Test(priority = 5)
    public void verifyListingAdsSortedByUrutkanColumn()
    {
        filterPage.inputKeywordSearchField();
        filterPage.clickMyLocationButton();
        filterPage.inputMinPriceRange();
        filterPage.inputMaxPriceRange();
        filterPage.clickRadioButtonInUrutkanColumn();
        filterPage.clickSimpanButton();
    }

    @Stories("As a user i want see listing by new or second condition")
    @Title("Verify Listing ads sorted by selected condition")
    @TestCaseId("TC_FILTER_08_007")
    @Test(priority = 6)
    public void verifyListingAdsSortedByConditionColumn()
    {
        filterPage.inputKeywordSearchField();
        filterPage.clickMyLocationButton();
        filterPage.inputMinPriceRange();
        filterPage.inputMaxPriceRange();
        filterPage.clickRadioButtonInUrutkanColumn();
        filterPage.clickRadioButtonInKondisiColumn();
        filterPage.clickSimpanButton();
    }


}

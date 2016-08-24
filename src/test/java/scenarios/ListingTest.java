package scenarios;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by buddyarifin on 8/24/16.
 */
public class ListingTest extends AndroidSetup {

    @Stories("As a User I want to See Content in ListingPage")
    @Title("Verify System able to Display Content in ListingPage")
    @TestCaseId("TC_LISTING_06_001")
    @Test(priority = 1)
    public void verifyContentsofListing() {}

    @Stories("As a User I want enable Search ads")
    @Title("Verify Search ads by Keyword in Search Box")
    @TestCaseId("TC_LISTING_06_002")
    @Test(priority = 2)
    public void verifyUserAbleToSearchAds() {}

    @Stories("As A User I want to See Adjusted Listing Ads")
    @Title("Verify Listing Ads Sort by Adjusted Distance Slider")
    @TestCaseId("TC_LISTING_06_006")
    @Test(priority = 3)
    public void verifyUserAbleToSortAdsByRadiusDistanceSlider() {}

    @Stories("As A User I want Unlimited Scroll")
    @Title("Verify ads Scrolling Unlimited")
    @TestCaseId("TC_LISTING_06_009")
    @Test(priority = 4)
    public void verifyUserAbleToUnlimitedScrollingListing() {}

    @Stories("As A User I want Bottom Bar Appear")
    @Title("Verify Bottom Bar Appear when User Stop Scrolling")
    @TestCaseId("TC_LISTING_06_011")
    @Test(priority = 5)
    public void verifyBottomBarAppearAfterStopScrolling() {}

    @Stories("As A User I want See Top Listing Ads")
    @Title("Verify System Display Top Ads")
    @TestCaseId("TC_LISTING_06_008")
    @Test(priority = 6)
    public void verifyUserAbleToSeeTopListingAds() {}

    @Stories("As A User I want See Details Ads")
    @Title("Verify ads Details by ads Selected")
    @TestCaseId("TC_LISTING_06_012")
    @Test(priority = 7)
    public void verifyUserAbleToSeeAdsDetailsPage() {} // a lot of elements and functions tc on details page

    @Stories("As A User I want to Able Click Button in Bottom Bar")
    @Title("Verify User Click Bottom Bar \"Pesan\" Button")
    @TestCaseId("TC_LISTING_06_015")
    @Test(priority = 9)
    public void verifyUserAbleToGoToPesanFromButtomBar() {}

    @Stories("As A User I want to Able Click Button in Bottom Bar")
    @Title("Verify User Click Bottom Bar \"Kategori\" Button")
    @TestCaseId("TC_LISTING_06_013")
    @Test(priority = 10)
    public void verifyUserAbleToGoToKategoriListViewFromButtomBar() {}

    @Stories("As A User I want to Able Click Button in Bottom Bar")
    @Title("Verify User Click Bottom Bar \"Jual\" Button")
    @TestCaseId("TC_LISTING_06_014")
    @Test(priority = 11)
    public void verifyUserAbleToGoToJualPageFromButtomBar() {}

    @Stories("As A User I want to Able Click Button in Bottom Bar")
    @Title("Verify User Click Bottom Bar \"Favorit\" Button")
    @TestCaseId("TC_LISTING_06_016")
    @Test(priority = 12)
    public void verifyUserAbleToGoToFavoritPageFromButtomBar() {}

    @Stories("As A User I want to able see Filter/Advance on the primary tool")
    @Title("Verify System display Filter/Advance on primary tool")
    @TestCaseId("TC_LISTING_06_018")
    @Test(priority = 13)
    public void verifyUserAbleToFilterListing() {} // a lot of sort by function > generate new test page


}

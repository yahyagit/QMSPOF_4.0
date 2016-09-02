package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Log;

import java.util.List;

/**
 * Created by buddyarifin on 8/11/16.
 */
public class CategoryPreferencesPage extends BasePage {

    protected static final String relativeLayout = "android.widget.RelativeLayout";
    protected static final String linearLayout = "android.widget.LinearLayout";
    protected static final String titleListingText = "Pilih Kategori Favorit Kamu";
    protected static final String categoryListingID = "com.app.tokobagus.betterb/rvCategory";
    protected static final String cardViewID = "com.app.tokobagus.betterb:id/card_view";
    protected static final String categoryTitle = "com.app.tokobagus.betterb:id/tvCategoryTitle";
    protected static final String buttonSimpanText = "SIMPAN";
    protected static final String buttonSkipID = "com.app.sulley:id/btnSkip";
    protected static final String checkIconID = "";
    protected static final String errorMsgBarID = "com.app.sulley:id/snackbar_text";

    public CategoryPreferencesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBys({
            @AndroidFindBy(id = cardViewID),
            @AndroidFindBy(className = relativeLayout),
            @AndroidFindBy(id = categoryTitle)
    })
    protected List<AndroidElement> categoryContainers;

    public void verifyAllContentsOfCategoryPage() {
        Log.info("Verify All Contents of Category View");
        verifyTitleListing();
        verifyCategoryListing();
    }

    public void verifyTitleListing() {
        Log.info("Verify Title Category Page");
        Assert.assertTrue(isElementPresent(getTextLocator(titleListingText)));
    }

    public void verifyCategoryListing() {
        Log.info("Verify Available Category on Listing");
        isWaitElementPresent(getIdLocator(cardViewID));
        Log.info("Category Available ["+categoryContainers.size()+"]: ");
        for (int i = 0 ; i < categoryContainers.size() ; i++) {
            String category = categoryContainers.get(i).getText();
            Log.info("* " + category + " ");
            Assert.assertNotNull(category);
        }
    }

    public void clickBackBtn() {}
    public void clickSimpanBtn() {
        Log.info("Click SIMPAN Button");
        clickElement(getTextLocator(buttonSimpanText));
    }

    public void clickSkipBtn() {
        Log.info("Click SKIP Button");
        clickElement(getIdLocator(buttonSkipID));
    }

    public void selectedCategory() {}
    public void selectedMultipleCategory() {}
    
    public void verifyErrorMsgDisplay() {
        Log.info("Verify Error Message Display");
        Assert.assertTrue(isElementPresent(getIdLocator(errorMsgBarID)));
    }

}

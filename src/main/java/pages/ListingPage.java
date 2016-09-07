package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import module.FilterByMapsLocationModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

import java.util.List;

/**
 * Created by buddyarifin on 8/24/16.
 */
public class ListingPage extends BasePage{

    public static final String primaryToolBar = "com.app.sulley:id/toolbar";
    public static final String hamburgerBar = "Navigate up";
    public static final String titlePage = "Sulley";
    public static final String searchBtnPrmID = "com.app.sulley:id/search_item";
    public static final String filterBtnPrmID = "com.app.sulley:id/filter_item";
    public static final String jarakDariKamuBtnID = "com.app.sulley:id/distance";
    public static final String gambarIklan = "";
    public static final String hargaIklan = "";
    public static final String homeBtnBtmID = "com.app.sulley:id/tab_listing";
    public static final String kategoriBtnBtmID = "com.app.sulley:id/tab_category";
    public static final String jualBtnBtmID = "com.app.sulley:id/tab_postad";
    public static final String pesanBtnBtmID = "com.app.sulley:id/tab_Messages";
    public static final String pesanNotif = "";
    public static final String favoritBtnBtmId = "com.app.sulley:id/tab_Favorite";

    public ListingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBys({
        @AndroidFindBy(id = primaryToolBar)
    })
    protected List<AndroidElement> primaryToolList;

    @Step("Verify All Contents of ListingPage")
    public void verifyContentsOfListingPage()
    {
        Log.info("Verify All Contents of ListingPage");
        verifyHamburgerBar();
        verifyTitlePage();
        verifySearchBtnPrm();
        verifyFilterBtnPrm();
        verifyJarakDariKamuBtnBtm();
        verifyGambarIklan();
        verifyHargaIklan();
        verifyHomeBtnBtm();
        verifyKategoriBtnBtm();
        verifyJualBtnBtm();
        verifyPesanBtnBtm();
        verifyPesanNotif();
        verifyFavoritBtnBtm();
    }

    @Step("Verify Hamburger Bar")
    public void verifyHamburgerBar()
    {
        Assert.assertTrue(isElementPresent(getContentDescLocator(hamburgerBar)));
        Log.info("verifyHamburgerBar");
    }

    @Step("Verify Title Page")
    public void verifyTitlePage()
    {
        Assert.assertTrue(isElementPresent(getTextLocator(titlePage)));
        Log.info("verifyTitlePage");
    }

    @Step("Verify Search Button")
    public void verifySearchBtnPrm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(searchBtnPrmID)));
        Log.info("verifySearchButton");
    }

    @Step("Verify Filter Button")
    public void verifyFilterBtnPrm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(filterBtnPrmID)));
        Log.info("verifyFilterButton");
    }

    @Step("Verify Jarak Dari Kamu Button")
    public void verifyJarakDariKamuBtnBtm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(jarakDariKamuBtnID)));
        Log.info("verifyJarakDariKamuButton");
    }

    @Step("Verify Gambar Iklan")
    public void verifyGambarIklan()
    {
        Log.info("verifyGambarIklan");
    }

    @Step("Verify Harga Iklan")
    public void verifyHargaIklan()
    {
        Log.info("verifyHargaIklan");
    }

    @Step("Verify Home Button")
    public void verifyHomeBtnBtm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(homeBtnBtmID)));
        Log.info("verifyHomeButton");
    }

    @Step("Verify Kategori Button")
    public void verifyKategoriBtnBtm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(kategoriBtnBtmID)));
        Log.info("verifyKategoriButton");
    }

    @Step("Verify Jual Button")
    public void verifyJualBtnBtm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(jualBtnBtmID)));
        Log.info("verifyJualButton");
    }

    @Step("Verify Pesan Button")
    public void verifyPesanBtnBtm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(pesanBtnBtmID)));
        Log.info("verifyPesanButton");
    }

    @Step("Verify Pesan Notif")
    public void verifyPesanNotif()
    {
        Log.info("verifyPesanNotif");
    }

    @Step("Verify Favorit Button")
    public void verifyFavoritBtnBtm()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(favoritBtnBtmId)));
        Log.info("verifyFavoritButton");
    }

    @Step("Click Hamburger Primary Bar Bar")
    public HamburgerBarPage clickHamburgerBar()
    {
        Log.info("Click Hamburger Bar");
        clickElement(getIdLocator(hamburgerBar));
        return new HamburgerBarPage(driver);
    }

    @Step("Click Search Primary Bar Button")
    public void clickSearchBtnPrm()
    {
        clickElement(getIdLocator(searchBtnPrmID));
        Log.info("Click Search Button");
    }

    @Step("Click Filter Primary Bar Button")
    public FilterPage clickFilterBtnPrm()
    {
        Log.info("Click Filter Button");
        clickElement(getIdLocator(filterBtnPrmID));
        return new FilterPage(driver);
    }

    @Step("Click Jarak Dari Kamu Button")
    public FilterByMapsLocationModule clickJarakDariKamuBtn()
    {
        Log.info("Click Jarak Dari Kamu Button");
        clickElement(getIdLocator(jarakDariKamuBtnID));
        return new FilterByMapsLocationModule(driver);
    }

    @Step("Click Kategori Bottom Bar Button")
    public KategoriPage clickKategoriBtnBtm()
    {
        Log.info("Click Kategori Bottom Bar Button");
        clickElement(getIdLocator(kategoriBtnBtmID));
        return new KategoriPage(driver);
    }

    @Step("Click Jual Bottom Bar Button")
    public PostAdsPage clickJualBtnBtm()
    {
        Log.info("Click Jual Bottom Bar Button");
        clickElement(getIdLocator(jualBtnBtmID));
        return new PostAdsPage(driver);
    }
}

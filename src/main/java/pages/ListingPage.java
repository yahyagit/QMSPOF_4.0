package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by buddyarifin on 8/24/16.
 */
public class ListingPage extends BasePage{

    public static final String hamburgerBar = "";
    public static final String titlePage = "";
    public static final String searchBtnPrmID = "";
    public static final String filterBtnPrmID = "";
    public static final String jarakDariKamuBtnID = "";
    public static final String gambarIklan = "";
    public static final String hargaIklan = "";
    public static final String homeBtnBtmID = "";
    public static final String kategoriBtnBtmID = "";
    public static final String jualBtnBtmID = "";
    public static final String pesanBtnBtmID = "";
    public static final String pesanNotif = "";
    public static final String favoritBtnBtmId = "";

    public ListingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

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
        Log.info("verifyHamburgerBar");
    }

    @Step("Verify Title Page")
    public void verifyTitlePage()
    {
        Log.info("verifyTitlePage");
    }

    @Step("Verify Search Button")
    public void verifySearchBtnPrm()
    {
        Log.info("verifySearchButton");
    }

    @Step("Verify Filter Button")
    public void verifyFilterBtnPrm()
    {
        Log.info("verifyFilterButton");
    }

    @Step("Verify Jarak Dari Kamu Button")
    public void verifyJarakDariKamuBtnBtm()
    {
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
        Log.info("verifyHomeButton");
    }

    @Step("Verify Kategori Button")
    public void verifyKategoriBtnBtm()
    {
        Log.info("verifyKategoriButton");
    }

    @Step("Verify Jual Button")
    public void verifyJualBtnBtm()
    {
        Log.info("verifyJualButton");
    }

    @Step("Verify Pesan Button")
    public void verifyPesanBtnBtm()
    {
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
        Log.info("verifyFavoritButton");
    }

    @Step("Click Hamburger Bar")
    public HamburgerBarPage clickHamburgerBar()
    {
        Log.info("Click Hamburger Bar");
        clickElement(getIdLocator(hamburgerBar));
        return new HamburgerBarPage();
    }

    @Step("Click Search Button")
    public void clickSearchBtnPrm()
    {
        Log.info("Click Search Button");
    }
}

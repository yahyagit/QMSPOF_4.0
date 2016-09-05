package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by NugrohoSantoso on 9/2/16.
 */
public class FilterPage extends BasePage {
    public static final String backBtn = "";
    public static final String searchField = "";
    public static final String closeBtn = "";
    public static final String locationBtn = "";
    public static final String myLocationBtn = "";
    public static final String minHarga = "";
    public static final String maksHarga = "";
    public static final String terdekatRb = "";
    public static final String terbaruRb = "";
    public static final String termurahRb = "";
    public static final String termahalRb = "";
    public static final String bekasRb = "";
    public static final String baruRb = "";
    public static final String ubahBtn = "";
    public static final String resetBtn = "";
    public static final String simpanBtn = "";

    public FilterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step("Verify System Display Content in Filter Page")
    public void verifyAllContentOfFilterPage()
    {
        verifyBackButton();
        verifySearchField();
        verifyCloseButton();
        verifyLocationButton();
        verifyMyLocationButton();
        verifyMinHargaButton();
        verifyMaksHargaButton();
        verifyTerdekatRadioButton();
        verifyTerbaruRadioButton();
        verifyTermurahRadioButton();
        verifyTermahalRadioButton();
        verifyBekasRadioButton();
        verifyBaruRadioButton();
        verifyUbahButton();
        verifyResetButton();
        verifySimpanButton();
        Log.info("Verify All Content in Filter Page");
    }

    public void verifyBackButton()
    {
        Log.info("Verify Back Button");
    }
    public void verifySearchField()
    {
        Log.info("Verify Search Field");
    }
    public void verifyCloseButton()
    {
        Log.info("Verify Close Button");
    }
    public void verifyLocationButton()
    {
        Log.info("Verify Location Button");
    }
    public void verifyMyLocationButton()
    {
        Log.info("Verify MyLocation Button");
    }
    public void verifyMinHargaButton()
    {
        Log.info("Verify MinHarga Button");
    }
    public void verifyMaksHargaButton()
    {
        Log.info("Verify MaksHarga Button");
    }
    public void verifyTerdekatRadioButton()
    {
        Log.info("Verify Terdekat Radio Button");
    }
    public void verifyTerbaruRadioButton()
    {
        Log.info("Verify Terbaru Radio Button");
    }
    public void verifyTermurahRadioButton()
    {
        Log.info("Verify Termurah Radio Button");
    }
    public void verifyTermahalRadioButton()
    {
        Log.info("Verify Termahal Radio Button");
    }
    public void verifyBekasRadioButton()
    {
        Log.info("Verify Bekas Radio Button");
    }
    public void verifyBaruRadioButton()
    {
        Log.info("Verify Baru Radio Button");
    }
    public void verifyUbahButton()
    {
        Log.info("Verify Ubah Button");
    }
    public void verifyResetButton()
    {
        Log.info("Verify Reset Button");
    }
    public void verifySimpanButton()
    {
        Log.info("Verify Simpan Button");
    }

    @Step("Input Keyword in Search Field")
    public void inputKeywordSearchField()
    {
        Log.info("Input Keyword in Search Field");
    }

    @Step("Click MyLocation Button")
    public void clickMyLocationButton()
    {
        Log.info("Click MyLocation Button");
    }

    @Step("Click Location Button")
    public void clickLocationButton()
    {
        Log.info("Click Location Button");
    }

    @Step("Input Price Range")
    public void inputPriceRange()
    {
        Log.info("Input Price Range");
    }

    @Step("Click One of Urutkan Column")
    public void clickRadioButtonInUrutkanColumn()
    {
        Log.info("Click One of Urutkan Column");
    }

    @Step("Click One of Kondisi Column")
    public void clickRadioButtonInKondisiColumn()
    {
        Log.info("Click One of Kondisi Column");
    }

    @Step("Click Ubah Button")
    public void clickUbahButton()
    {
        Log.info("Click Ubah Button");
    }

    @Step("Click Sub-Kategori")
    public void clickSubKategori()
    {
        Log.info("Click Sub-Kategory");
    }

    @Step("Click Reset Button")
    public void clickResetButton()
    {
        Log.info("Click Reset Button");
    }

    @Step("Click Simpan Button")
    public void clickSimpanButton()
    {
        Log.info("Click Simpan Button");
    }
}

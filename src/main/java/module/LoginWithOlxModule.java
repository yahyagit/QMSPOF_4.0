package module;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by buddyarifin on 8/5/16.
 */
public class LoginWithOlxModule extends BasePage {
    public static String titlePage = "Masuk dengan akun OLX";
    public static String emailField = "com.app.tokobagus.betterb:id/entrance_btnLoginOlx";
    public static String passField = "com.app.tokobagus.betterb:id/entranceLogin_txtPass";
    public static String showPass = "";
    public static String loginOlxBtn = "com.app.tokobagus.betterb:id/entranceLogin_btnLogin";
    public static String emailErrorMsg = "";
    public static String passErrorMsg = "";

    public LoginWithOlxModule(WebDriver driver) {
        super(driver);
    }

    @Step("Verify Login With OLX Contents")
    public void verifyLoginWithOlxContents() {
        Log.info("verifyLoginWithOLXContents");
        verifyEmailField();
        verifyPassField();
        verifyShowPass();
        verifyLoginWithOlxBtn();
    }

    @Step("Verify Email Field")
    public void verifyEmailField() {
        Log.info("verifyEmailField");
    }

    @Step("Verify Pass Field")
    public void verifyPassField() {
        Log.info("verifyPassField");
    }

    @Step("Verify Login With OLX Button")
    public void verifyLoginWithOlxBtn() {
        Log.info("verifyLoginWithOLXButton");
    }

    @Step("Verify Error Invalid Email")
    public void verifyErrorInvalidEmail() {
        Log.info("verifyErrorInvalidEmail");
    }

    @Step("Verify Error Wrong Credentials")
    public void verifyErrorWrongCredentials() {
        Log.info("verifyErrorWrongCredentials");
    }

    @Step("Verify Show Password")
    public void verifyShowPass() {
        Log.info("verifyShowPassword");
    }

    @Step("Verify Click Login With OLX Button")
    public void clickLoginWithOlxBtn() {
        Log.info("verifyClickLoginWithOLXButton");
    }

    @Step("Verify Set Category Preferences")
    public void verifySetCategoryPreferences() {
        Log.info("verifySetCateforyPreferences");
    }

}

package module;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

/**
 * Created by buddyarifin on 8/12/16.
 */
public class LoginWithFBModule extends BasePage {

    public static final String email = "";
    public static final String password = "";
    public static final String loginBtn = "";
    public static final String cancelBtn = "";
    public static final String closeBtn = "";
    public static final String confirmBtn = "";
    public static final String accessFBInfoText = "";

    public LoginWithFBModule(WebDriver driver) {
        super(driver);
    }

    public static void clickLogin() {}
    public static void inputEmail() {}
    public static void inputPassword() {}
    public static void clickCloseBtn() {}
    public static void clickConfirm() {}

    public static void verifyEmailField() {}
    public static void verifyPassField() {}
    public static void verifyLoginBtn() {}
    public static void verifyCloseBtn() {}
    public static void verifyConfirmBtn() {}
    public static void verifyAccessFBInfo() {}
    public static void verifySetCategoryPrefefences() {}

}

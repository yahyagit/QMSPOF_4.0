package module;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

/**
 * Created by buddyarifin on 8/5/16.
 */
public class LoginWithOlxModule extends BasePage {
    public static String titlePage = "";
    public static String emailField = "";
    public static String passField = "";
    public static String showPass = "";
    public static String loginOlxBtn = "";
    public static String emailErrorMsg = "";
    public static String passErrorMsg = "";

    public LoginWithOlxModule(WebDriver driver) {
        super(driver);
    }

    public void verifyLoginWithOlxContents() {}
    public void verifyEmailField() {}
    public void verifyPassField() {}
    public void verifyLoginWithOlxBtn() {}
    public void verifyErrorInvalidEmail() {}
    public void verifyErrorWrongCredentials() {}
    public void verifyShowPass() {}
    public void clickLoginWithOlxBtn() {}
    public void verifySetCategoryPrefefences() {}

}

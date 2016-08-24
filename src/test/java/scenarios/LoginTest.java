package scenarios;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import module.LoginWithGplusModule;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import listeners.ScreenshootsListener;

/**
 * Created by buddyarifin on 8/15/16.
 */
@Listeners(ScreenshootsListener.class)
@Features("Login Feature")
public class LoginTest extends AndroidSetup {

    @Test
    public void userAbleToRedirectToGmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        LoginWithGplusModule gplus = loginPage.clickLoginWithGPlus();
        gplus.verifyAccountExist();
    }

    // login With OLX Login Page
    public void userNotAbleToLoginWithUnregisteredEmail() {}
    public void userNotAbleToLoginWithIncorrectEmailFormat() {}
    public void userNotAbleToLoginWithInvalidCredentials() {}
    public void userAbleToLoginWithValidCredentials() {}
    public void userNotAbleToLoginWithBlankCredentials() {}

    // login with FB
    @Stories("As A User I Will not be Able to Login")
    @Title("Verify User Not Able to Login with Invalid Facebook Credentials")
    @TestCaseId("TC_LBF_02_001")
    @Test(priority = 1)
    public void userNotAbleToLoginWithInvalidFBCredentials() {}

    @Stories("As A User I want able to Login")
    @Title("Verify Facebook Ask Permissions from Users to Give the Granted Access")
    @TestCaseId("TC_LBF_02_003")
    @Test(priority = 3)
    public void userAbleToGiveGrantedAccessToFB() {}

    @Stories("As A User I want able to Login")
    @Title("Verify User Able to Login with Facebook Credentials")
    @TestCaseId("TC_LBF_02_002")
    @Test(priority = 2)
    public void userAbleToLoginWithValidFBCredentials() {}

    @Stories("As A User I want Able to Redirect to Destination Page after Success Login")
    @Title("Verify User Able to Redirect to Destination Page After Success Login")
    @TestCaseId("TC_LBF_02_004, TC_LBF_02_005")
    @Test(priority = 4)
    public void userAbleToSetPreferencesAfterSuccessFBLogin() {}

    @Stories("As A User i want be able to Logout after Success Login FB")
    @Title("Verify User Able to Logout after Success FB login")
    @TestCaseId("TC_LBF_02_006")
    @Test(priority = 5)
    public void userAbleToLogoutAfterSuccessFBLogin() {}

    // login with Gplus
    @Stories("As A User I Will not be Able to Login with Google+")
    @Title("Verify User Not Able to Login with Invalid Google+ Credentials")
    @TestCaseId("TC_LBG_03_001")
    @Test(priority = 6)
    public void userNotAbleToLoginWithInvalidGplusCredentials() {}

    @Stories("As A User I want able to Login Using Google+")
    @Title("Verify Google+ ask permissions from users to give the granted access")
    @TestCaseId("TC_LBG_03_003")
    @Test(priority = 8)
    public void userAbleToGiveGrantedAccessToGplus() {}

    @Stories("As A User I want able to Login with Google+")
    @Title("Verify User Able to Login with Google+ Credentials")
    @TestCaseId("TC_LBG_03_002")
    @Test(priority = 7)
    public void userAbleToLoginWithValidGplusCredentials() {}

    @Stories("As A User I want Set Preferences Category After Success Login")
    @Title("Verify User Able to Set Preferences Category After Success Login")
    @TestCaseId("TC_LBG_03_005, TC_LBG_03_004")
    @Test(priority = 7)
    public void userAbleToSetPreferencesAfterSuccessGplusLogin() {}
    public void userAbleToLogoutAfterSuccessGplusLogin() {}

    // login with SMS
    public void userNotAbleToLoginWithBlankPIN() {}
    public void userAbleToMintaPIN() {}
    public void userAbleToMintaUlangPIN() {}
    public void userNotAbleToLoginWithInvalidPIN() {}
    public void userNotAbleToLoginWithInvalidPhoneNumber() {}
    public void userAbleToLoginWithValidPIN() {}

}

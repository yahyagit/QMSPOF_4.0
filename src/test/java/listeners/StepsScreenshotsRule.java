package listeners;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import scenarios.AndroidSetup;

/**
 * Created by buddyarifin on 8/23/16.
 */
public class StepsScreenshotsRule extends AppenderSkeleton {
    Object obj;
    WebDriver driver;
    BasePage base;

    @Override
    protected void append(LoggingEvent event) {
        base = new BasePage(driver);
        try {
            base.getAttachment(event.getThreadName()+".png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }

    @BeforeTest
    public void creen(ITestResult result){
        obj = result.getInstance();
        driver = ((AndroidSetup)obj).driver;
    }
}

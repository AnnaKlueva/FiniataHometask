import anna.kliuieva.petproject.ui.DriverProvider;
import anna.kliuieva.petproject.ui.pages.HomePage;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static anna.kliuieva.petproject.ui.Constants.BASE_URL;

public class TestNGRunner {

    protected HomePage homePage;

    @BeforeMethod
    public void openApp() {
        DriverProvider.INSTANCE
                .getDriverInstance()
                .get(BASE_URL);
        homePage = new HomePage();
    }

    @AfterMethod(alwaysRun = true)
    public void closeApp(ITestResult result) {
        if (!result.isSuccess()) {
            makeScreenshot();
        }
        DriverProvider.INSTANCE.getDriverInstance();
        DriverProvider.INSTANCE.removeDriver();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] makeScreenshot() {
        return ((TakesScreenshot) DriverProvider.INSTANCE.getDriverInstance()).getScreenshotAs(OutputType.BYTES);
    }

}

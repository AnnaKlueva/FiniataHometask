package anna.kliuieva.petproject.ui;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class WebDriverFactory {

    public static WebDriver createLocalDriver(final Capabilities capabilities) {
        final String browserType = capabilities.getBrowserName();
        final Platform osType = capabilities.getPlatform();
        if (browserType.equals(FIREFOX)) {
            return new FirefoxDriver(capabilities);
        }
        if (browserType.equals(CHROME)) {
            if (System.getProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY) == null) {
                if (osType.is(Platform.WINDOWS)) {
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, Constants.CHROME_DRIVER_WINDOWS_PATH);
                } else {
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, Constants.CHROME_DRIVER_MAC_PATH);
                    new File(Constants.CHROME_DRIVER_MAC_PATH).setExecutable(true);
                }
            }
            return new ChromeDriver(capabilities);
        }
        throw new Error("Unrecognized browser type: " + browserType);
    }
}

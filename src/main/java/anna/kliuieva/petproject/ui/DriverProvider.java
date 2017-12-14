package anna.kliuieva.petproject.ui;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverProvider {

    private static final Logger LOG = LoggerFactory.getLogger(DriverProvider.class);
    public static final DriverProvider INSTANCE = new DriverProvider();
    private ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public WebDriver getDriverInstance() {
        if (DRIVER.get() == null) {
            DRIVER.set(WebDriverFactory.createLocalDriver(Configuration.getDesiredCapabilities()));
            LOG.info("WebDriver was created");
        }
        return DRIVER.get();
    }

    public void removeDriver() {
        DRIVER.get().quit();
        DRIVER.remove();
    }
}

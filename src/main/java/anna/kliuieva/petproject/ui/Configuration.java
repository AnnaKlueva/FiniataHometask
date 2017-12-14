package anna.kliuieva.petproject.ui;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    private static final String BROWSER_TYPE_PROPERTY_NAME = "browserName";
    private static final String OS_NAME_PROPERTY_NAME = "os.name";
    private static final Logger LOG = LoggerFactory.getLogger(Configuration.class);
    static Properties properties;

    private Configuration() {
    }

    private static String getBrowserType() {
        final String browser = System.getProperty(BROWSER_TYPE_PROPERTY_NAME);
        return StringUtils.isNotEmpty(browser) ? browser : getFileProperty(BROWSER_TYPE_PROPERTY_NAME);
    }

    private static String getOSType() {
        return System.getProperty(OS_NAME_PROPERTY_NAME);
    }

    private static String getFileProperty(final String key) {
        return properties.getProperty(key);
    }

    public static DesiredCapabilities getDesiredCapabilities() {
        properties = new Properties();
        loadProperties();

        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(getBrowserType());
        capabilities.setPlatform(Platform.extractFromSysProperty(getOSType()));
        return capabilities;
    }

    private static void loadProperties() {
        try (InputStream in = Configuration.class.getClassLoader().getResourceAsStream(Constants.PROPERTY_FILE)) {
            properties.load(in);
        } catch (final IOException e) {
            LOG.error("Failed to loadProperties build properties file.", e);
            throw new RuntimeException("Failed to loadProperties build properties file.");
        }
    }
}

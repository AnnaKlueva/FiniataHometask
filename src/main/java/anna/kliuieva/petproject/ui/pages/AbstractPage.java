package anna.kliuieva.petproject.ui.pages;

import anna.kliuieva.petproject.ui.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage implements Page {

    public AbstractPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverProvider.INSTANCE.getDriverInstance();
    }
}

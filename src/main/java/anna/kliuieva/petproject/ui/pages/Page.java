package anna.kliuieva.petproject.ui.pages;

import org.openqa.selenium.WebElement;

public interface Page {

    void waitForLoad();

    boolean isLoaded();

    WebElement getLoadableElement();
}

package anna.kliuieva.petproject.ui.pages;

import anna.kliuieva.petproject.ui.utils.Waiters;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(css = "input[name='email']")
    private WebElement addressEmailField;

    @FindBy(css = "input[name='password']")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit'] span")
    private WebElement submitButton;

    @FindBy(css = "input[name='email'] ~ div:last-child")
    private WebElement errorMsgForInvalidEmailField;

    @FindBy(css = "input[name='password'] ~ div:last-child")
    private WebElement errorMsgForInvalidPasswordField;

    @FindBy(css = "input[name='email'] ~ div:last-child span")
    private WebElement errorMsgForUnsucsessfullEmailField;

    @FindBy(css = "input[name='password'] ~ div:last-child span")
    private WebElement errorMsgForUnsucsessfullPasswordField;

    public HomePage() {
        super();
        waitForLoad();
    }

    @Override
    public void waitForLoad() {
        if (!isLoaded()) {
            Waiters.waitForAppear(getLoadableElement());
        }
    }

    @Override
    public boolean isLoaded() {
        return Waiters.isElementDisplayed(getLoadableElement());
    }

    @Override
    public WebElement getLoadableElement() {
        return addressEmailField;
    }


    public void enterEmail(String email) {
        addressEmailField.clear();
        addressEmailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    @Step
    public String getMessageForInvalidLoginField() {
        Waiters.waitForAppear(errorMsgForInvalidEmailField);
        return errorMsgForInvalidEmailField.getText();
    }

    @Step
    public String getMessageForInvalidPasswordField() {
        return errorMsgForInvalidPasswordField.getText();
    }

    @Step
    public String getMessageForUnsuccessfulLoginField() {
        Waiters.waitForAppear(errorMsgForUnsucsessfullEmailField);
        return errorMsgForUnsucsessfullEmailField.getText();
    }

    @Step
    public String getMessageForUnsuccessfulPasswordField() {
        return errorMsgForUnsucsessfullPasswordField.getText();
    }

    @Step
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickSubmitButton();
    }
}

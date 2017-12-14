import anna.kliuieva.petproject.ui.utils.CommonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestNGRunner {

    public static final String INVALID_EMAIL_ADDRESS = "annaklueva";
    public static final String INVALID_PASSWORD = "k";
    public static final String VALID_PASSWORD = "Finanta888";
    public static final String INVALID_LOGIN_MESSAGE = "Podaj poprawny adres email";
    public static final String INVALID_PASSWORD_MESSAGE = "Hasło musi mieć przynajmniej 8 znaków";
    public static final String UNSUCCESSFUL_LOGIN_MESSAGE = "Coś się nie zgadza. Spróbuj jeszcze raz.";

    @Test(groups = "login")
    public void unsuccessfulLoginScenarioPL() {
        homePage.login(INVALID_EMAIL_ADDRESS, INVALID_PASSWORD);

        Assert.assertEquals(homePage.getMessageForInvalidLoginField(), INVALID_LOGIN_MESSAGE, "Invalid login error message under login field wasn't appear");
        Assert.assertEquals(homePage.getMessageForInvalidPasswordField(), INVALID_PASSWORD_MESSAGE, "Error message under password wasn't appear");
    }

    @Test(groups = "login")
    public void bruteForceScenarioPL() {
        for (int i = 0; i < 10; i++) {
            homePage.login(CommonUtils.generateEmail(), VALID_PASSWORD);

            Assert.assertEquals(homePage.getMessageForUnsuccessfulLoginField(), UNSUCCESSFUL_LOGIN_MESSAGE, "Error message under login field wasn't appear");
            Assert.assertEquals(homePage.getMessageForUnsuccessfulPasswordField(), UNSUCCESSFUL_LOGIN_MESSAGE, "Error message under password wasn't appear");
        }
    }
}

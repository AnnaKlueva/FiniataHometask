package anna.kliuieva.petproject.ui.utils;

import java.util.Date;
import java.util.Random;

public class CommonUtils {

    public static String generateEmail() {
        return Long.toString(new Random().nextInt()).replace("-", "") + (new Date()).getTime() + "@finiata.com";
    }
}

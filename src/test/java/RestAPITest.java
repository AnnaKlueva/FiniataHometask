import anna.kliuieva.petproject.api.rest.RestCountriesResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertTrue;

/** Create a simple tests which sends an HTTP GET
 *  to https://restcountries.eu/rest/v2/capital/Berlin and
      assert that in the JSON response altSpellings is equal to:
        "altSpellings": [
            "DE",
            "Federal Republic of Germany",
            "Bundesrepublik Deutschland"
            ],
    */
public class RestAPITest {
    public static final String BASE_URI = "https://restcountries.eu/rest/v2/capital/Berlin";

    @Test(groups = "restApi")
    public void verifyRestCountriesRequest() throws IOException {

        RestCountriesResponse[] response =
                given().baseUri(BASE_URI)
                        .when()
                        .get()
                        .then()
                        .assertThat()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().body().as(RestCountriesResponse[].class);

        assertTrue("Response doesn't contain 'DE'", response[0].altSpellings.contains("DE"));
        assertTrue("Response doesn't contain 'Federal Republic of Germany'",
                response[0].altSpellings.contains("Federal Republic of Germany"));
        assertTrue("Response doesn't contain 'Bundesrepublik Deutschland'",
                response[0].altSpellings.contains("Bundesrepublik Deutschland"));
    }
}

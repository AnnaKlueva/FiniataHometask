import anna.kliuieva.petproject.api.soap.GetInfoByCityResponse;
import anna.kliuieva.petproject.api.soap.NewDataSet;
import anna.kliuieva.petproject.api.soap.Table;
import anna.kliuieva.petproject.api.soap.USZip;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Create simple test which sends an
 * HTTP POST Request to: http://www.webservicex.net/uszip.asmx?op=GetInfoByCity (set city as New York)
 * and asserts that in the response payload number of ZIP codes is greater then 2.
 */
public class SoapAPITest {

    public static final String CITY_NAME = "New York";

    @Test(groups = "soapApi")
    public void verifyInfoByCity() throws IOException {

        USZip client = new USZip();
        GetInfoByCityResponse.GetInfoByCityResult infoByCityResult = client.getUSZipSoap().getInfoByCity(CITY_NAME);
        NewDataSet xmlResponse = infoByCityResult.getContent();

        assertTrue(getZipCodes(xmlResponse.getTables()).size() > 2, "Zip codes quantity is less that 2");
    }

    private List<Integer> getZipCodes(List<Table> tables) {
        List<Integer> zipCodes = new ArrayList<>();
        for (Table table : tables) {
            zipCodes.add(table.getZip());
        }
        return zipCodes;
    }
}

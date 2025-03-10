
package anna.kliuieva.petproject.api.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the wsclient package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoByCityResponse }
     */
    public GetInfoByCityResponse createGetInfoByCityResponse() {
        return new GetInfoByCityResponse();
    }

    /**
     * Create an instance of {@link GetInfoByCityResponse.GetInfoByCityResult }
     */
    public GetInfoByCityResponse.GetInfoByCityResult createGetInfoByCityResponseGetInfoByCityResult() {
        return new GetInfoByCityResponse.GetInfoByCityResult();
    }

    /**
     * Create an instance of {@link GetInfoByCity }
     */
    public GetInfoByCity createGetInfoByCity() {
        return new GetInfoByCity();
    }

    public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

    public Table createTable() {
        return new Table();
    }

}

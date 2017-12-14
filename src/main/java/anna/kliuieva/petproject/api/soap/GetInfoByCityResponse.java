
package anna.kliuieva.petproject.api.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetInfoByCityResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getInfoByCityResult"
})
@XmlRootElement(name = "GetInfoByCityResponse")
public class GetInfoByCityResponse {

    @XmlElement(name = "GetInfoByCityResult")
    protected GetInfoByCityResult getInfoByCityResult;

    /**
     * Gets the value of the getInfoByCityResult property.
     *
     * @return possible object is
     * {@link GetInfoByCityResult }
     */
    public GetInfoByCityResult getGetInfoByCityResult() {
        return getInfoByCityResult;
    }

    /**
     * Sets the value of the getInfoByCityResult property.
     *
     * @param value allowed object is
     *              {@link GetInfoByCityResult }
     */
    public void setGetInfoByCityResult(GetInfoByCityResult value) {
        this.getInfoByCityResult = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "content"
    })
    public static class GetInfoByCityResult {

        @XmlElement(name = "NewDataSet")
        protected NewDataSet content;

        public NewDataSet getContent() {
            return content;
        }
    }
}

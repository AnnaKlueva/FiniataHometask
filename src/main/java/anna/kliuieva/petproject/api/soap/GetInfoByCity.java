
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
 *         &lt;element name="USCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "usCity"
})
@XmlRootElement(name = "GetInfoByCity")
public class GetInfoByCity {

    @XmlElement(name = "USCity")
    protected String usCity;

    /**
     * Gets the value of the usCity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUSCity() {
        return usCity;
    }

    /**
     * Sets the value of the usCity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUSCity(String value) {
        this.usCity = value;
    }

}

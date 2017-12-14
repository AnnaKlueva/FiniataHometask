package anna.kliuieva.petproject.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"city", "state", "zip", "areaCode", "timeZone"})
public class Table {

    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "ZIP")
    protected int zip;
    @XmlElement(name = "AREA_CODE")
    protected int areaCode;
    @XmlElement(name = "TIME_ZONE")
    protected String timeZone;

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public String getTimeZone() {
        return timeZone;
    }
}

package anna.kliuieva.petproject.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"tables"}, namespace = "")
public class NewDataSet {
    @XmlElement(name = "Table", namespace = "")
    protected List<Table> tables;

    public List<Table> getTables() {
        return tables;
    }
}

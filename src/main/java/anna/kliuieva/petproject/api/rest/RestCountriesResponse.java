package anna.kliuieva.petproject.api.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestCountriesResponse {
    public List altSpellings;

    @JsonSetter("altSpellings")
    public void setAltSpellings(List altSpellings) {
        this.altSpellings = altSpellings;
    }
}

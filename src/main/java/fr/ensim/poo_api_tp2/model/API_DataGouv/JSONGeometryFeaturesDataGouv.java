package fr.ensim.poo_api_tp2.model.API_DataGouv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JSONGeometryFeaturesDataGouv {
    @JsonProperty("type")
    private String type;

    @JsonProperty("coordinates")
    ArrayList<Double> coordinates = new ArrayList();

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public ArrayList<Double> getCoordinates() { return coordinates; }

    public void setCoordinates(ArrayList<Double> coordinates) { this.coordinates = coordinates; }
}

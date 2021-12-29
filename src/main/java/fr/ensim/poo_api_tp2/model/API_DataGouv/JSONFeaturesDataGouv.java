package fr.ensim.poo_api_tp2.model.API_DataGouv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JSONFeaturesDataGouv {
    @JsonProperty("type")
    private String type;

    @JsonProperty("geometry")
    JSONGeometryFeaturesDataGouv geometry;

    @JsonProperty("properties")
    JSONPropertiesFeaturesDataGouv properties;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public JSONGeometryFeaturesDataGouv getGeometry() { return geometry; }

    public void setGeometry(JSONGeometryFeaturesDataGouv geometry) { this.geometry = geometry; }

    public JSONPropertiesFeaturesDataGouv getProperties() { return properties; }

    public void setProperties(JSONPropertiesFeaturesDataGouv properties) { this.properties = properties; }
}

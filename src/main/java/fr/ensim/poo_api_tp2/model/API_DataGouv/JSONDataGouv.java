package fr.ensim.poo_api_tp2.model.API_DataGouv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JSONDataGouv {
    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;

    @JsonProperty("features")
    private ArrayList<JSONFeaturesDataGouv> features;

    @JsonProperty("attribution")
    private String attribution;

    @JsonProperty("licence")
    private String licence;

    @JsonProperty("query")
    private String query;

    @JsonProperty("limit")
    private float limit;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getVersion() { return version; }

    public void setVersion(String version) { this.version = version; }

    public ArrayList<JSONFeaturesDataGouv> getFeatures() { return features; }

    public void setFeatures(ArrayList<JSONFeaturesDataGouv> features) { this.features = features; }

    public String getAttribution() { return attribution; }

    public void setAttribution(String attribution) { this.attribution = attribution; }

    public String getLicence() { return licence; }

    public void setLicence(String licence) { this.licence = licence; }

    public String getQuery() { return query; }

    public void setQuery(String query) { this.query = query; }

    public float getLimit() { return limit; }

    public void setLimit(float limit) { this.limit = limit; }
}

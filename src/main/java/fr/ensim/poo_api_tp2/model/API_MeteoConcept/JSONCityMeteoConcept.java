package fr.ensim.poo_api_tp2.model.API_MeteoConcept;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JSONCityMeteoConcept {
    @JsonProperty("insee")
    private String insee;

    @JsonProperty("cp")
    private String cp;

    @JsonProperty("name")
    private String name;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("altitude")
    private int altitude;

    /**
     * Code Insee de la commune
     * @return Code Insee
     */
    public String getInsee() { return insee; }

    public void setInsee(String insee) { this.insee = insee; }

    /**
     * Code postal de la commune
     * @return Code postal
     */
    public String getCp() { return cp; }

    public void setCp(String cp) { this.cp = cp; }

    /**
     * Nom de la commune
     * @return nom
     */
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    /**
     * Latitude décimale de la commune
     * @return Latitude
     */
    public double getLatitude() { return latitude; }

    public void setLatitude(double latitude) { this.latitude = latitude; }

    /**
     * Longitude décimale de la commune
     * @return Longitude
     */
    public double getLongitude() { return longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude; }

    /**
     * Altitude de la commune en mètres
     * @return Altitude
     */
    public int getAltitude() { return altitude; }

    public void setAltitude(int altitude) { this.altitude = altitude; }

    @Override
    public String toString() {
        return "JSONCityMeteoConcept{" +
                "insee='" + insee + '\'' +
                ", cp='" + cp + '\'' +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }
}

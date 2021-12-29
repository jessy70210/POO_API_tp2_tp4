package fr.ensim.poo_api_tp2.model.API_MeteoConcept;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JSONMeteoConcept {

    @JsonProperty("city")
    private JSONCityMeteoConcept city;

    @JsonProperty("update")
    private String update;

    @JsonProperty("forecast")
    private ArrayList<JSONItemForecastMeteoConcept> previsions;

    /**
     * Informations sur la commune
     * @return Objet ville
     */
    public JSONCityMeteoConcept getCity() { return city; }

    public void setCity(JSONCityMeteoConcept city) { this.city = city; }

    /**
     * associée à une chaîne de caractère donnant la date de la prévision
     * @return date de la prévision (au format ISO8601)
     */
    public String getUpdate() { return update; }

    public void setUpdate(String update) { this.update = update; }

    /**
     * Détail de la prévision météo par période et par jour
     * @return collections de prévision météo
     */
    public ArrayList<JSONItemForecastMeteoConcept> getPrevisions() { return previsions; }

    public void setPrevisions(ArrayList<JSONItemForecastMeteoConcept> previsions) { this.previsions = previsions; }

    @Override
    public String toString() {
        return "JSONMeteoConcept{" +
                "city=" + city +
                ", update='" + update + '\'' +
                ", previsions=" + previsions +
                '}';
    }
}

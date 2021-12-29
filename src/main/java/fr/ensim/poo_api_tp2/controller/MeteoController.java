package fr.ensim.poo_api_tp2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.ensim.poo_api_tp2.model.API_DataGouv.JSONDataGouv;
import fr.ensim.poo_api_tp2.model.API_MeteoConcept.JSONMeteoConcept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.net.URL;

@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String showMeteo (
            @RequestBody(required = true) String adressePost,
            //@RequestParam(name = "address", required = false, defaultValue = "Le mans") String adressePost,
            Model model) throws IOException {
        adressePost = adressePost.substring(adressePost.indexOf("=") + 1);
        model.addAttribute("adressePost", adressePost);
        System.out.println("\n\nParametre URL : " + adressePost);
        URL url;

        // API data gouv
        url = new URL("https://api-adresse.data.gouv.fr/search/?q=" + adressePost);
        JSONDataGouv localisation = new ObjectMapper().readValue(url, JSONDataGouv.class);

        double longitude = localisation.getFeatures().get(0).getGeometry().getCoordinates().get(0);
        double latitude = localisation.getFeatures().get(0).getGeometry().getCoordinates().get(1);


        System.out.println("--- Data Gouv ---");
        System.out.println("latitude : " + latitude);
        System.out.println("longitude : " + longitude);

        //API méteo concept
        // email : eb4fd8d6db@emailnax.com
        // mdp : ensim1995

//        DecimalFormat df = new DecimalFormat("#.###");
//        System.out.println("df.format(latitude) : "+df.format(latitude));
//        System.out.println("Math.round(latitude*100.0)/100.0 : " + Math.round(latitude*1000.0)/1000.0);
//        System.out.println("df.format(longitude) : "+df.format(longitude));
//        System.out.println("Math.round(longitude*100.0)/100.0 : " + Math.round(longitude*1000.0)/1000.0);
//        url = new URL("https://api.meteo-concept.com/api/ephemeride/1?token=97ecc6007f7d58f4fe7d350e7409f973f549937a3d04e0971333a4c4fcb5fdc7&latlng=" + Math.round(latitude*1000.0)/1000.0 + "," + Math.round(longitude*1000.0)/1000.0);
        url = new URL("https://api.meteo-concept.com/api/forecast/daily?token=97ecc6007f7d58f4fe7d350e7409f973f549937a3d04e0971333a4c4fcb5fdc7&latlng=" + Math.round(latitude*1000.0)/1000.0 + "," + Math.round(longitude*1000.0)/1000.0);
        JSONMeteoConcept meteo = new ObjectMapper().readValue(url, JSONMeteoConcept.class);
//
//        longitude = meteo.getCity().getLongitude();
//        latitude = meteo.getCity().getLatitude();
//
//        System.out.println("--- Meteo City ---");
//        System.out.println("latitude : " + latitude);
//        System.out.println("longitude : " + longitude);
//
//        longitude = meteo.getEphemeride().getLongitude();
//        latitude = meteo.getEphemeride().getLatitude();
//
//        System.out.println("--- Meteo Ephemeride ---");
//        System.out.println("latitude : " + latitude);
//        System.out.println("longitude : " + longitude);
//
//        String ville = meteo.getCity().getName();
//
//        System.out.println("Ville : " + ville);

        System.out.println("--- MeteoConcept ---\n"+meteo);

        model.addAttribute("meteo", meteo);

        return "meteo";
    }

}

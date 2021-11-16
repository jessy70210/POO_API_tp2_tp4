package fr.ensim.poo_api_tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    /**
     *
     * @param nameGET : contenu de la varibale contenu dans les paramètre de l'URL (non requise)
     * @param model : Objet qui contient tout les elements nesseaire a la modalisation de la vue futue
     * @return : nom de la vue
     */
    @GetMapping("/greeting")
    public String greeting (@RequestParam(name = "nameGET", required = false, defaultValue = "World") String nameGET, Model model) {

        //Création d'un attribut nomTemplate utilisation dans une vue
        model.addAttribute("nomTemplate", nameGET);

        //Apple de la vue greeting
        return "greeting";
    }

}

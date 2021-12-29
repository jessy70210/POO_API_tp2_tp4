package fr.ensim.poo_api_tp2.controller;

import fr.ensim.poo_api_tp2.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddressController {
    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/addresses")
    public String showAddresses (Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }

//    @GetMapping("addresse/one")
//    public String showAddresse (@RequestParam() Model model) {
//        model.addAttribute("allAddresses", addressRepository.findById());
//        return "addresses";
//    }

    @GetMapping("/adresse")
    public String showAdresse (Model model) { return "adresse"; }
}

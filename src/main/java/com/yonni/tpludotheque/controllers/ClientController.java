package com.yonni.tpludotheque.controllers;

import com.yonni.tpludotheque.bo.Client;
import com.yonni.tpludotheque.exceptions.ClientEmailExisteDejaException;
import com.yonni.tpludotheque.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientController {

    ClientService clientService;
    private static final String REGISTRATION_FORM = "/client/registrationForm";

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/creation")
    public String registration(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);


        return REGISTRATION_FORM;
    }

    @GetMapping("client/listing")
    public String listing(Model model) {
        // on recupere l'ensemble des clients
        List<Client> clients = clientService.getAll();
        model.addAttribute("clients", clients);
        return "/client/listing";
    }

    @PostMapping("/client/creation")
    public String registration(@Valid Client client, BindingResult clientControl, Model model) {
        model.addAttribute("client", client);

        if(clientControl.hasErrors()) {
            return REGISTRATION_FORM;
        }

        // on enregistre le nouveau client
        if (!clientService.save(client)) {
            model.addAttribute("emailErrorMessage", "Cet email existe déjà.");
            return REGISTRATION_FORM;
        }


        model.addAttribute("successMessage", "success");
        return REGISTRATION_FORM;
    }

}

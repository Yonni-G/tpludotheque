package com.yonni.tpludotheque.controllers;

import com.yonni.tpludotheque.bo.Client;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    @GetMapping("/client/creation")
    public String registration(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);


        return "/client/registrationForm";
    }

    @PostMapping("/client/creation")
    public String registration(@Valid Client client, BindingResult clientControl, Model model) {
        model.addAttribute("client", client);

        if(clientControl.hasErrors()) {
            return "/client/registrationForm";

        }



        return "/client/registrationForm";
    }

}

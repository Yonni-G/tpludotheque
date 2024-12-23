package com.yonni.tpludotheque.controllers;

import com.yonni.tpludotheque.bo.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/client/registration")
    public String registration(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "/client/registrationForm";
    }
}

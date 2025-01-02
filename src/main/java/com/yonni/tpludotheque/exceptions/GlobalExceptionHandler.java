//package com.yonni.tpludotheque.exceptions;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(ClientEmailExisteDejaException.class)
//    public String handleClientEmailExisteDeja(ClientEmailExisteDejaException ex, Model model) {
//        model.addAttribute("errorMessage", ex.getMessage());
//        return ex.getPageRetour(); // Retourne la page spécifiée dans l'exception
//    }
//}
//
//

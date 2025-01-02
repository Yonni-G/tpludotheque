package com.yonni.tpludotheque.exceptions;

public class ClientEmailExisteDejaException extends RuntimeException {

    public ClientEmailExisteDejaException() {
        super("L'email existe déjà dans le système.");
    }
}


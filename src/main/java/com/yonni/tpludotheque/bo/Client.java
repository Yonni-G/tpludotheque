package com.yonni.tpludotheque.bo;

import jakarta.validation.constraints.*;

public class Client {
    private int noClient;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 50)
    private String nom;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 50)
    private String prenom;

    @Email
    private String email;

    @Pattern(regexp = "\\d{10}")
    private String noTel;


    @NotNull
    @NotEmpty
    @Size(min = 10, max = 50)
    private String rue;

    @Pattern(regexp = "(\\d{5}|2[A-B]\\d{3})")
    private String codePostal;

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 50)
    private String ville;

    @Override
    public String toString() {
        return "Client{" +
                "noClient=" + noClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", noTel='" + noTel + '\'' +
                ", rue='" + rue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }

    public int getNoClient() {
        return noClient;
    }

    public void setNoClient(int noClient) {
        this.noClient = noClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTel() {
        return noTel;
    }

    public void setNoTel(String noTel) {
        this.noTel = noTel;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Client(int noClient, String nom, String prenom, String email, String noTel, String rue, String codePostal, String ville) {
        this.noClient = noClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.noTel = noTel;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}

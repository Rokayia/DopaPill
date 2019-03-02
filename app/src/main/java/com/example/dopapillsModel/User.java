package com.example.dopapillsModel;

public class User  {
    private String nom;
    private String prenom;
    private String sexe;
    private String age;
    private String poids;
    private String taille;
    private String pseudo;
    private String email;

    public User(){

    }
    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }
    public User(String nom, String prenom,String sexe,String age,String poids,String taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.poids = poids;
        this.taille = taille;

    }


    public User(String nom, String prenom,String sexe,String age,String poids,String taille,String pseudo, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
        this.pseudo = pseudo;
        this.email = email;

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAge() {
        return age;
    }

    public String getPoids() {
        return poids;
    }

    public String getTaille() {
        return taille;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getEmail() {
        return email;
    }
}

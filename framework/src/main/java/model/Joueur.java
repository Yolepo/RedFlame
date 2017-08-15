package model;

import lombok.Data;

// Le joueur est composé de :
// id (au cas ou on est des homonymes).
// Nom
// Prénom
// Couleur de jeu
// de 2 coureurs (sprinteur et rouleur)
public class Joueur {
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int Id;
    public String Couleur;
    public String Nom;
    public String Prenom;
    public Sprinteur sprinteur = new Sprinteur();
    public Rouleur rouleur = new Rouleur();


    public Joueur(String nom, String prenom, String couleur, int id) {
        Nom = nom;
        Prenom = prenom;
        Couleur = couleur;
        Id = id;
    }
}


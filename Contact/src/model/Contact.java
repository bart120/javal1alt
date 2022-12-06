package model;

import java.io.FileWriter;
import java.io.IOException;

public class Contact {
    private String nom;
    private String prenom;
    private String numero;
    private String mail;
    private String dateNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void enregistrer() {
        try {
            FileWriter writer = new FileWriter("contacts.csv", true);
            writer.write(this.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        // return this.getNom() + ";" + this.getPrenom();*
        StringBuilder build = new StringBuilder();
        build.append(getNom());
        build.append(";");
        build.append(getPrenom());
        build.append(";");
        build.append(getMail());
        build.append(";");
        build.append(getNumero());
        build.append(";");
        build.append(getDateNaissance());
        return build.toString();
    }

}

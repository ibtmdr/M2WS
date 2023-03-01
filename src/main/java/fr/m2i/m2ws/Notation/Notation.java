package fr.m2i.m2ws.Notation;

public class Notation {
    private String nom, prenom;
    private int id, note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Notation() {
    }

    public Notation(int id,String nom, String prenom, int note) {
        this.id= id;
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

public class Personne {
    private int id;
    private String nom;
    private double Salaire;

    public Personne(  int id,String nom, double Salaire) {
        this.id = id;
        this.nom = nom;
        this.Salaire = Salaire;
    }

  
    public Personne(String nom, double Salaire) {
        this.nom = nom;
        this.Salaire = Salaire;
    }
    
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

    public double getSalaire() {
        return Salaire;
    }

    public void setSalaire(double Salaire) {
        this.Salaire = Salaire;
    }

     @Override

    
    public String toString() {
        return "{" + "id=" + id + ", nom=" + nom + ", Salaire=" + Salaire + '}';
    }
   
    
    
    
 
    
}

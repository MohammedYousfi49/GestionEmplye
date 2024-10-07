/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

/**
 *
 * @author pc
 */
public class DirecteurGeneral extends Manager {

    public DirecteurGeneral(String nom, double Salaire) {
        super(nom, Salaire);
    }

    public DirecteurGeneral(int id, String nom, double Salaire) {
        super(id, nom, Salaire);
    }
     @Override
    public String toString(){
        return getClass().getSimpleName()+ super.toString();
    
    }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.List;

/**
 *
 * @author pc
 */
public class Manager extends Personne {

    public Manager(String nom, double Salaire) {
        super(nom, Salaire);
    }

    public Manager(int id, String nom, double Salaire) {
        super(id, nom, Salaire);
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+ super.toString();
    
    }
    
    }
    
    
    



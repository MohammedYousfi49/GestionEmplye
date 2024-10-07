/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Arrays;
import java.util.List;
import ma.projet.beans.Developpeur;
import ma.projet.beans.DirecteurGeneral;
import ma.projet.beans.Manager;
import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;

/**
 *
 * @author pc
 */
public class Entreprise {

    public static void main(String[] args) {
        DeveloppeurService ds = new DeveloppeurService();
        ManagerService ms = new ManagerService();
       // Création de deux developpeurs
//        Developpeur dev1 = new Developpeur("Mustapha", 3000);
//        Developpeur dev2 = new Developpeur("Walid", 3500);
//        ds.create(dev1);
//        ds.create(dev2);
//        //création d'un manager
//        Manager m1 = new Manager("Samy", 7000);
//        ms.create(m1);
//        //création d'un 3eme developpeur
//        Developpeur dev3 = new Developpeur("Mohamed",3800);
//        //création d'un directeur general
//        Manager m2 = new Manager("Soufiane", 8000);
       //affichage de la hiérarchie
       System.out.println(ds.getAll());
       System.out.println(ms.getAll());

    }

}

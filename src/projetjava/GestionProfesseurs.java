/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.Scanner;
import static projetjava.Projetjava.input;

/**
 *
 * @author Nomad Soul
 */
public class GestionProfesseurs extends Professeurs {
    static Scanner inputprof= new Scanner(System.in);
     static Professeurs pf;
    static ArrayList<Professeurs> professeur = new ArrayList<Professeurs>();
    static int compteur = 0;
    
    
    static int sousmenuprofesseur(){
        System.out.println("1-Ajouter un professeur");
        System.out.println("2-Modifier un professeur");
        System.out.println("3-Voir les détails d'un professeur");
        System.out.println("4-Supprimer un professeur");
        System.out.println("5-Afficher tous les professeurs");
        System.out.println("6-Quitter");
return (inputprof.nextInt());
    
    
    }
    
    public static void afficherprof() {
       
     for(Professeurs pf : professeur)
            pf.AfficherValeurProf();
        }

    public static void ajouterProfesseur() {
        String rep;
        do
        {
           pf = new Professeurs();
           pf.saisirValeurProf();
           professeur.add(pf);
            
           System.out.println("Voulez vous ajouter un autre professeur? ");
           rep = inputprof.next();
            
        }while(rep.equals("oui"));
        
    }
    public static void supprimerprofesseur() {
 Professeurs[] Professeurs = null;
     System.out.println("Veuillez saisir l'Id du professeur");
       int p = input.nextInt();
        if (p != -1)
        {
            for (int i = p; i < compteur - 1; i++)
                professeur.set(i, Professeurs[i + 1]);
            compteur--;
        }
      System.out.println("Professeur supprimé avec succés");    }
    
    
    
    public static void modifierprofesseur() {
System.out.println("Ssaisir l'Id du professeur à modifier");
        int p = input.nextInt();
        if (p != -1)
        {
           Professeurs[] Professeurs = null;
            for (int i = p; i < compteur - 1; i++)
                professeur.set(i, Professeurs[i + 1]);
            compteur++;
        }      }

     public static void voirdetailsprof(){
       for(Professeurs pf: professeur){{
     pf.AfficherValeurProf();
     }}}
}

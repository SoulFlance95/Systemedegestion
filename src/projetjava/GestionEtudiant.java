/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.Scanner;
import static projetjava.GestionProfesseurs.compteur;

import static projetjava.GestionProfesseurs.sousmenuprofesseur;

/**
 *
 * @author Nomad Soul
 */
public class GestionEtudiant extends Etudiant{
    static Scanner input= new Scanner(System.in);
    static Scanner input1=new Scanner(System.in);
    static int choixm;
    static Etudiant etd;
   
    static ArrayList<Etudiant> etudiants= new ArrayList<Etudiant>();
    
     
   
  
     public static void voirdetails(){
       for(Etudiant e: etudiants){{
     e.affichervaleur();
     }}}
     
     public static void ajouteretudiant(){
     String reponse;
     do {
     etd= new Etudiant();
     etd.saisirvaleur();
     etudiants.add(etd);
     
     System.out.println("Voulez vous ajouter un nouvel étudiant");
     reponse=input.next();
     }while(reponse.equals("oui"));
     }
     
     public static void supprimeretudiant(Etudiant[] Etudiant) {
        System.out.println("Veuillez saisir l'Id de l'étudiant");
        int p = input.nextInt();
        if (p != -1)
        {
            for (int i = p; i < compteur - 1; i++)
                etudiants.set(i, Etudiant[i + 1]);
            compteur--;
        }
 
    }
     
     public static void modifieretudiant(Etudiant[] Etudiant) {
        System.out.println("Veuillez saisir l'Id de l'étudiant");
        int p = input.nextInt();
        if (p != -1)
        {
            for (int i = p; i < compteur - 1; i++)
                etudiants.set(i, Etudiant[i + 1]);
            compteur++;
        }
 
    }
      
     
   
   static int sousmenuetudiant(){
         System.out.println("1-Ajouter un étudiant");
         System.out.println("2-Modifier un étudiant");
         System.out.println("3-Voir les détails d'un étudiant ");
         System.out.println("4-Supprimer un étudiant ");
         System.out.println("5-Afficher tous les étudiant ");
         System.out.println("6-Quitter");
        return (input.nextInt());
        
}
   
 
   
   }

   
   
 
   
   
   
   
  



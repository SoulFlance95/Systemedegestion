/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import java.util.Scanner;
import static projetjava.GestionEtudiant.etd;
import static projetjava.GestionEtudiant.sousmenuetudiant;
import projetjava.GestionGroupes;
import static projetjava.GestionGroupes.sousmenuprincipal;
import static projetjava.GestionProfesseurs.sousmenuprofesseur;
import projetjava.Etudiant;
import static projetjava.GestionEtudiant.etudiants;
import static projetjava.GestionEtudiant.input;
import static projetjava.GestionEtudiant.sousmenuetudiant;
import static projetjava.GestionProfesseurs.ajouterProfesseur;
import java.util.ArrayList;
import static projetjava.Etudiant.inputetd;
import static projetjava.GestionGroupes.ajoutergroupe;
import static projetjava.GestionGroupes.groupe;
import static projetjava.GestionGroupes.menup;
import static projetjava.GestionGroupes.modifiergroupe;
import static projetjava.GestionGroupes.supprimergroupe;
import static projetjava.GestionGroupes.voirdetailsgrp;
import static projetjava.GestionProfesseurs.afficherprof;
import static projetjava.GestionProfesseurs.compteur;
import static projetjava.GestionProfesseurs.professeur;


/**
 *
 * @author Nomad Soul
 */
public class Projetjava {

    /**
     * @param args the command line arguments
     */
   static ArrayList<Etudiant> etudiants= new ArrayList<Etudiant>();

    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        //Initialisation du menu principal
         
         System.out.println("1-Gestion Groupe");
         System.out.println("2-Gestion Etudiants");
         System.out.println("3-Gestion Professeurs");
         System.out.println("4-Gestion Groupe-Etudiant");
         System.out.println("5-Quitter");
         
         int selection;
         System.out.println("Veuillez choisir une option");
         selection=input.nextInt();
        
   switch(selection){
       case 1:
           sousmenuprincipal();
           menup();
           break;
           
       case 2:
           sousmenuetudiant();
           setchoice();
           break;
           
       case 3:
           sousmenuprofesseur();
           setchoice1();
           break;
           
       case 5:
           System.exit(0);
           break;
 }
   
    
    }   
  
    
    
    
    
   public static void ajouteretudiant(){
     String reponse;
     do {
     etd= new Etudiant();
     etd.saisirvaleur();
     etudiants.add(etd);
     
     System.out.println("Etudiant ajouté avec succés");
     System.out.println("Voulez vous ajouter un nouvel étudiant");
     reponse=input.next();
     }while(reponse.equals("oui"));
    
    
     }

   public static void voirdetails(){
       for(Etudiant e: etudiants){{
     e.affichervaleur();
     }}}
     

    public static void setchoice(){
      int choixm;
     choixm=input.nextInt();
   
   switch(choixm){
       case 1:
           System.out.println("--Menu Ajout Etudiant");
           ajouteretudiant();
           break;
           
       case 2:
           System.out.println("--Menu Modification Etudiant");
           modifieretudiant();
         case 3:
           voirdetails();
           break;
       
       case 4:
           System.out.println("--Menu Supression Etudiant");
          supprimeretudiant();
           break;
       case 5:
           afficheretudiants();
           break;
       case 6:
           System.exit(0);
           break;
   
   }
    }
   
   public static void setchoice1(){
      int choixm;
     choixm=input.nextInt();
   
   switch(choixm){
       case 1:
           System.out.println("--Menu Ajout Professeur");
           ajouterProfesseur();
           break;
           
       case 2:
           System.out.println("--Menu Modification Professeur");
           modifierprofesseur();
           
           
       case 3:
           voirdetailsprof();
           break;
           
       case 4:  System.out.println("--Menu Supression Professeur");
          supprimerprofesseur();
           break;
           
       case 5:
            afficherprof();
           break;
       case 6:
           System.exit(0);
           break;
   }
   
   
   }

public static void setchoice2(){
   int choixm;
     choixm=input.nextInt();
   
   switch(choixm){
       case 1:
           System.out.println("--Menu Ajout Groupe");
           ajoutergroupe();
           break;
           
       case 2:
           System.out.println("--Menu Modification Professeur");
           modifiergroupe();
           
           
       case 3:
           voirdetailsgrp();
           break;
           
       case 4:  System.out.println("--Menu Supression Professeur");
          supprimergroupe();
           break;
           
       case 5:
            affichergroupe();
           break;
       case 6:
           System.exit(0);
           break;
   }








}
 

   public static void supprimeretudiant() {
       Etudiant[] Etudiant = null;
     System.out.println("Veuillez saisir l'Id de l'étudiant");
       int p = input.nextInt();
        if (p != -1)
        {
            for (int i = p; i < compteur - 1; i++)
                etudiants.set(i, Etudiant[i + 1]);
            compteur--;
        }
      System.out.println("Etudiant supprimé avec succés");
   }

    public static void modifieretudiant() {
 System.out.println("Ssaisir l'Id de l'étudiant à modifier");
        int p = input.nextInt();
        if (p != -1)
        {
           Etudiant[] Etudiant = null;
            for (int i = p; i < compteur - 1; i++)
                etudiants.set(i, Etudiant[i + 1]);
            compteur++;
        }    }

    public static void afficheretudiants() {
    Iterable<Etudiant> Etudiant = null;
  for(Etudiant e: etudiants){{
      System.out.println("Voici la liste de tous les étudiants");
      e.affichervaleur();
     }}    }

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

    public static void affichergroupe() {
            Iterable<Groupe> Groupe = null;
  for(Groupe g: groupe){{
      System.out.println("Voici la liste de tous les groupe");
      g.affichervaleurgroupe();
     }} 
    }
    

    

   
   
         
    
        
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import java.util.ArrayList;
import java.util.Scanner;
import projetjava.Groupe;
import projetjava.Professeurs;
import projetjava.Etudiant;
import static projetjava.GestionEtudiant.etudiants;
import static projetjava.GestionEtudiant.sousmenuetudiant;
import static projetjava.GestionProfesseurs.compteur;
import static projetjava.GestionProfesseurs.sousmenuprofesseur;
import static projetjava.Projetjava.setchoice;
import static projetjava.Projetjava.setchoice1;

/**
 *
 * @author Nomad Soul
 */
public class GestionGroupes {
    static Scanner input= new Scanner(System.in);
    static Groupe grp;
    static int compteur=0;
    static int monchoix;
   static ArrayList<Groupe> groupe= new ArrayList<Groupe>();
    static Scanner inputm=new Scanner(System.in);
    static int mychoice;
    
   
    
    
    static int sousmenuprincipal(){
        System.out.println("1-Créer un Groupe");
        System.out.println("2-Modifier un Groupe");
        System.out.println("3-Voir les détails d'un groupe");
        System.out.println("4-Supprimer un groupe");
        System.out.println("5-Afficher tous les groupes");
        System.out.println("6-Quitter");
        return (input.nextInt());
       }
    static void menup(){
     do{monchoix=input.nextInt();
     
   
        System.out.println("1-Gestion Groupe");
         System.out.println("2-Gestion Etudiants");
         System.out.println("3-Gestion Professeurs");
         System.out.println("4-Gestion Groupe-Etudiant");
         System.out.println("5-Quitter");
    
    } while(monchoix==6);
    }
    
    
  
    

    
    
    
    
    
    
    
       public static void voirdetailsgrp(){
       for(Groupe g: groupe){{
     g.affichervaleurgroupe();
     }}}
     
     public static void ajoutergroupe(){
     String reponse;
     do {
     grp= new Groupe();
     grp.saisirvaleurgroupe();
     groupe.add(grp);
     
     System.out.println("Voulez vous ajouter un nouveau groupe");
     reponse=input.next();
     }while(reponse.equals("oui"));
     }
     
     public static void supprimergroupe() {
        System.out.println("Veuillez saisir l'Id du groupe");
        int p = input.nextInt();
        if (p != -1)
        {
            Groupe[] Groupe = null;
            for (int i = p; i < compteur - 1; i++)
                groupe.set(i, Groupe[i + 1]);
            compteur--;
        }
 
    }
     
     public static void modifiergroupe() {
        System.out.println("Veuillez saisir l'Id du groupe");
        int p = input.nextInt();
        if (p != -1)
        {
            Groupe[] Groupe = null;
            for (int i = p; i < compteur - 1; i++)
                groupe.set(i, Groupe[i + 1]);
            compteur++;
        }
 
    }
       public static void affichergroupe() {
            Iterable<Groupe> Groupe = null;
  for(Groupe g: groupe){{
      System.out.println("Voici la liste de tous les groupe");
      g.affichervaleurgroupe();
     }} 
    }
        
    }
  
    
      
    
    
   
   
    
    
    
  

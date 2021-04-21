/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.Scanner;

/**
 *
 * @author Nomad Soul
 */
public class Etudiant {
    protected String nom;
    protected String Prenom;
    protected int age;
    protected int id;
    protected String adresse;
    static Scanner inputetd= new Scanner(System.in);

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    @Override
    public String toString() {
        return "Etudiant{" + "nom=" + nom + ", Prenom=" + Prenom + ", age=" + age + ", id=" + id + ", adresse=" + adresse + '}';
    }
    
     public void affichervaleur(){
     System.out.println("Le nom de l'étudiant est:"+nom);
     System.out.println("Le nom de l'étudiant est:"+Prenom);
     System.out.println("Le nom de l'étudiant est:"+age);
     System.out.println("Le nom de l'étudiant est:"+id);
     System.out.println("Le nom de l'étudiant est:"+adresse);
    }  
 
  public void saisirvaleur(){
   System.out.println("Veuillez saisir le nom de l'étudiant:");nom=inputetd.next();
   System.out.println("Veuillez saisir le prénom de l'étudiant:");Prenom = inputetd.next();
   System.out.println("Veuillez saisir l'age de l'étudiant:");age=inputetd.nextInt();
   System.out.println("Veuillez saisir le matricule de l'étudiant:");id=inputetd.nextInt();
   System.out.println("Veuillez saisir l'adresse de l'étudiant:");adresse=inputetd.next();
  }

    
}

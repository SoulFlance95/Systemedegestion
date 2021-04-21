/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import static projetjava.Etudiant.inputetd;
import static projetjava.GestionProfesseurs.inputprof;

/**
 *
 * @author Nomad Soul
 */
public class Professeurs {
    protected String nomprof;
    protected String prenomprof;
    protected int ageprof;
    protected int idprof;
    protected String adresseprof;

    
    public String getNomprof() {
        return nomprof;
    }

    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
    }

    public String getPrenomprof() {
        return prenomprof;
    }

    public void setPrenomprof(String prenomprof) {
        this.prenomprof = prenomprof;
    }

    public int getAgeprof() {
        return ageprof;
    }

    public void setAgeprof(int ageprof) {
        this.ageprof = ageprof;
    }

    public int getIdprof() {
        return idprof;
    }

    public void setIdprof(int idprof) {
        this.idprof = idprof;
    }

    public String getAdresseprof() {
        return adresseprof;
    }

    public void setAdresseprof(String adresseprof) {
        this.adresseprof = adresseprof;
    }
    @Override
    public String toString() {
        return "Professeurs{" + "nomprof=" + nomprof + ", prenomprof=" + prenomprof + ", ageprof=" + ageprof + ", idprof=" + idprof + ", adresseprof=" + adresseprof + '}';
    }

    void saisirValeurProf() {
   System.out.println("Veuillez saisir le nom du professeur:");nomprof=inputprof.next();
   System.out.println("Veuillez saisir le prénom du professeur:");prenomprof = inputprof.next();
   System.out.println("Veuillez saisir l'age du professeur:");ageprof=inputprof.nextInt();
   System.out.println("Veuillez saisir le matricule du professeur:");idprof=inputprof.nextInt();
   System.out.println("Veuillez saisir l'adresse du professeur:");adresseprof=inputprof.next(); 
    }

    void AfficherValeurProf() {
    System.out.println("Le nom du professeur est:"+nomprof);
     System.out.println("Le nom du professeur est:"+prenomprof);
     System.out.println("Le nom du professeur est:"+ageprof);
     System.out.println("Le nom du professeur est:"+idprof);
     System.out.println("Le nom du professeur est:"+adresseprof);  }


}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import static projetjava.GestionProfesseurs.inputprof;

/**
 *
 * @author Nomad Soul
 */
public class Groupe {
    protected int idgroupe;
    protected String nomgroupe;

    

    public int getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(int idgroupe) {
        this.idgroupe = idgroupe;
    }

    public String getNomgroupe() {
        return nomgroupe;
    }

    public void setNomgroupe(String nomgroupe) {
        this.nomgroupe = nomgroupe;
    }
    
    @Override
    public String toString() {
        return "Groupe{" + "idgroupe=" + idgroupe + ", nomgroupe=" + nomgroupe + '}';
    }
    
    void affichervaleurgroupe() {
System.out.println("Le nom du professeur est:"+nomgroupe);
    System.out.println("Le nom du professeur est:"+idgroupe);    }

    void saisirvaleurgroupe() {
   System.out.println("Veuillez saisir le nom du professeur:");nomgroupe=inputprof.next();
   System.out.println("Veuillez saisir le matricule du professeur:");idgroupe=inputprof.nextInt();    }

}

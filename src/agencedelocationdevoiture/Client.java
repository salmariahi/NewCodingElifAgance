/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import java.util.Comparator;

/**
 *
 * @author wiemhjiri
 */
public class Client{
    
private int code;
private String nom;
private String prenom;

    public Client(int code, String nom, String prenom) {
        
// à compléter

    }


public int getCode() { return code;
}
public void setCode(int code) {
this.code = code;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}

    @Override
    public int hashCode() {
        
// à compléter

    }

    @Override
    public boolean equals(Object obj) {
        
// à compléter

    }

    @Override
    public String toString() {
        
// à compléter

    }

   
    public Client() {
    }



    
}

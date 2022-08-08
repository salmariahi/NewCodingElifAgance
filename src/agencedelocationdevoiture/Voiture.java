/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

/**
 *
 * @author wiemhjiri
 */
public class Voiture {
    
private int immariculation;
private String marque;
private float prixLocation;

public Voiture(int immariculation, String marque, float prixLocation) {
// à compléter
    
}
public int getImmariculation() {
return immariculation;
}
public void setImmariculation(int immariculation) {
this.immariculation = immariculation;
}
public String getMarque() {
return marque;
}
public void setMarque(String marque) {
this.marque = marque;
}
public float getPrixLocation() {
return prixLocation;
}
public void setPrixLocation(float prixLocation) {
this.prixLocation = prixLocation;
}
@Override
public int hashCode() {
//à completer 

}
@Override
public boolean equals(Object obj) { 
//à completer
    
}
@Override
public String toString(){

// à compléter

}
    
}

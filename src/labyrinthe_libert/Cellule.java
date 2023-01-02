/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labyrinthe_libert;

/**
 *
 * @author pauline
 */
public class Cellule {
   //Creation des attributs de la classes 
   boolean N,S,E,O;
   int rotation ; 
   String objet;

    public Cellule(boolean N, boolean S, boolean E, boolean O, int rotation, String objet) {
        //Creation du constructeur 
        this.N =N;
        this.S = S;
        this.E = E;
        this.O = O;
        this.rotation = rotation;
        this.objet = objet;
    }

public void Rotate(boolean horaire){
    // Fonction permetant de tourner la piece quand horaire est true il la tourne dans le sens horaire false pour antihoraire
    boolean temp;
    if (horaire){//On tourne le sens horaire
        rotation=(rotation+270)%360;// permet de connaitre le nouvel angle de la piece 
        temp = N;
        N=O;
        O=S;
        S=E;
        E=temp;
    }
    else{
        rotation=(rotation+90)%360;//On tourne dans le sens anti-horaire
        temp = N;
        N=E;
        E=S;
        S=O;
        O=temp;
    }
}
    
    // Méthode qui permet de retourner le nom du joueur
    public String getObj() {
        return this.objet;
    }
   
    // Méthode qui permet de retourner le nom du joueur
    public int getRot() {
        return rotation;
    }
    
    public boolean MvtLeg(boolean N,boolean S,boolean E,boolean O) {
        return (this.N&&N || this.S&&S || this.E&&E || this.O&&O);
    }
    
}

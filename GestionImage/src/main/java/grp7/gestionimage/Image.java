/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grp7.gestionimage;

import java.util.ArrayList;

/**
 *
 * @author vdufo
 */
public class Image {
    private int hauteur;
    private int largeur;
    private String commentaire;
    private ArrayList listeCases;
    private ArrayList listeFinLigne;
            
    private final int valeurMax=255;

    public Image(int hauteur, int largeur, String commentaire, ArrayList listeCases, ArrayList listeFinLigne) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.commentaire = commentaire;
        this.listeCases = listeCases;
        this.listeFinLigne = listeFinLigne;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public ArrayList getListeCases() {
        return listeCases;
    }

    public void setListeCases(ArrayList listeCases) {
        this.listeCases = listeCases;
    }

    public ArrayList getListeFinLigne() {
        return listeFinLigne;
    }

    public void setListeFinLigne(ArrayList listeFinLigne) {
        this.listeFinLigne = listeFinLigne;
    }
    
    public void ecritureImage(){
        // Creation d'un fichier texte
        
        //
    }
}
 
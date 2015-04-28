package com.example.tp2;

public class Element {
	
	public String nom=null;
	public String commentaire=null;
	
		
	public Element(String nom, String commentaire) {
		super();
		this.nom = nom;
		this.commentaire = commentaire;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	@Override
	public String toString() {
		return  nom + commentaire;
	}
	
	
	

}

package org.eclipse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;

@Entity
public class Personne {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int num;
private String nom; 
private String prenom; 
private int age;
public Integer getNum() {
	return num;
}
public void setNum(Integer num) {
	this.num = num;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

// + getters + setters + toString

}
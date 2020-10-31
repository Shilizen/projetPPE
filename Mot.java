package motus.modele;

import java.util.Scanner;

public class Mot {
	private char [] lettres;
	private String mot;
	private String newMot;
	
	public Mot(String unMot) {
		mot = unMot;
		lettres = new char[7];
	}
	
	public char[] ajouterLettresT() {
		for(int i = 0; i < mot.length(); i++) {
			lettres[i] = mot.charAt(i);
		}
		return lettres;
	}
	
	public char[] getLettres() {
		return lettres;
	}
	
	
}

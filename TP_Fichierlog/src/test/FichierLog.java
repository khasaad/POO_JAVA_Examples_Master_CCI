package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JFileChooser;

public class FichierLog {

	private LinkedList lignes = null;
	private Iterator iterateur = null;
	private String filename;

	/**
	 * Constructeur, charge le fichier en mémoire
	 * @param name nom du fichier à charger
	 */
	public FichierLog(String name) {
		lignes = new LinkedList();
		filename = name;
		load();
	}
	
	/**
	 * Renvoie le contenu de la liste sous la forme d'une chaine
	 */
	public String toString() {
		StringBuilder buff = new StringBuilder();
		//this.debut();
		while (this.elementSuivant()) {
			buff.append ( this.element()+"\n" );
		}
		return buff.toString();
		
	}
	
	/**
	 * Methode interne qui initialise l'itérateur
	 */
	private void debut() {
		iterateur = lignes.iterator();
	}
	
	/**
	 * Parcours de la liste interne selon la logique de l'iterateur
	 * @return true s'il reste des elements à parcourir, false sinon
	 */
	public boolean elementSuivant() {
		// initialise l'itérateur si nécessaire
		if (iterateur == null)
			debut();
		// calcule le résultats
		boolean res = iterateur.hasNext();
		// réinitialise l'itérateur si nécessaire
		if (!res)
			iterateur = null;
		
		return res;
	}
	
	/**
	 * Renvoie l'élement courant de la liste
	 * @return une des chaines de la liste
	 */
	public String element() {
		return (String)(iterateur.next());
	}
	
	/**
	 * Methode interne qui charge le fichier et le stocke dans la liste en memoire
	 */
	private void load()
	{
		BufferedReader entree = null;
		try {
			// classe pour lecture fichier texte
			FileReader fic = new FileReader(filename);
			// entree bufferisee
			entree = new BufferedReader(fic);

			String line = "";
			// boucle sur la lecture des lignes
			while(line != null)
			{
				// lit une ligne, null si fin de fichier
				line = entree.readLine();
				// stockage en liste
				if (line != null) lignes.add(line); 
			}
		}
		catch(IOException e)
		{
			System.out.println("Erreur ouverture ou lecture fichier");
		}
		finally{ 
			// ce code est toujours exécuté, exception ou pas
			try {
				// ferme le fichier s'il a été ouvert
				if (entree!=null) entree.close();
			} catch (IOException e) {
				System.out.println("Erreur fermeture fichier");
			}
		}
	}


}

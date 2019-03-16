package test;



import javax.swing.JFileChooser;

public class DemoFichierLog {

	public static void main(String [] args) {

		JFileChooser choix = new JFileChooser();
		int retour=choix.showOpenDialog(null);
		if(retour==JFileChooser.APPROVE_OPTION){

			// chemin absolu du fichier choisi
			String filename = choix.getSelectedFile().getAbsolutePath();

			// appel du chargeur de lignes
			FichierLog lignes = new FichierLog(filename);

			// affichage avec itérateur
			// Boucle tant qu’on n’est pas arrivé à la fin de la liste			
			while (lignes.elementSuivant()) {
				// obtient un des éléments de la liste 
				String ligne = lignes.element();				
				System.out.println(ligne);
			}
			
			// Affichage direct
			System.out.println(lignes);
		}
	}
	
	
} // FIN CLASSE

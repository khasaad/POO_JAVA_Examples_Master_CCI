
public class essaiCelluleV2V3 {

	public static void main(String[] args) {
		
		
		String s1 = "195.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\""
				+ "GET / HTTP/1.1\"200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n";
		String s2 = "295.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\""
				+ "GET / HTTP/1.1\"200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n";
		String s3 = "395.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\""
				+ "GET / HTTP/1.1\"200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n";
		
		
		// V2
		Requete r1 = new Requete(s1);
		Requete r2 = new Requete(s2);
		Requete r3 = new Requete(s3);

		CelluleV2 c1 = new CelluleV2(r1);
		CelluleV2 c2 = new CelluleV2(r2);
		CelluleV2 c3 = new CelluleV2(r3);
		
		c1.add(c2);
		c1.add(c3);
		
		c1.liste();
		
		// V3
		
		CelluleV3 liste = new CelluleV3();
		
		liste.add(r1);
		liste.add(r2);
		liste.add(r3);
		
		//liste.liste();
		liste.listeDebut();
		
		
		
		
		
		
		

//		
//		CelluleReq listeR = new ListeRequete();
//		
//		listeR.Ajouter(r1);
//		listeR.Ajouter(r2);
//		listeR.Ajouter(r3);
//
//		listeR.lister();
		
		
//		


	}

}

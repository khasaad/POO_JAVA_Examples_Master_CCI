import java.util.Iterator;
import java.util.LinkedList;

public class SimpleLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Requete> liste = new LinkedList<Requete>();
		
		String s1 = "195.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\""
				+ "GET / HTTP/1.1\"200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n";
		
		String s2 = "295.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\""
				+ "GET / HTTP/1.1\"200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n";
		
		String s3 = "395.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\""
				+ "GET / HTTP/1.1\"200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n";

		
//		Requete r1 = new Requete(s1);
//		Requete r2 = new Requete(s2);
//		Requete r3 = new Requete(s3);	
//		
//		liste.add(r1);
//		liste.add(r2);
//		liste.add(r3);
		
	
		
		
		
		
		
		
		
		
		
		Iterator<Requete> iter = liste.iterator();
		
		while (iter.hasNext()) {
			Requete x = (Requete) iter.next();
			System.out.println(x.get_adresseIP());
			
		}

	}

}

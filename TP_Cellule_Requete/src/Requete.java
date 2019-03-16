//import java.util.Arrays;

public class Requete {

	private String adresseIP;
	private String login;
	private String domaine;
	private String timestamp;
	private int jour;
	private int mois;
	private int annee;
	private int heure;
	private int minutes;
	private int secondes;
	private String decalGMT;
	private String action;
	private String ressource;
	private String protocole;
	private int statut;
	private int taille;
	private String referer;
	private String configuration;

	public Requete(String s) {

		String data = s;
		int pos;

		// adresse IP
		pos = data.indexOf(" ");
		this.adresseIP = data.substring(0, pos);
		data = data.substring(pos+1);
		// login
		pos = data.indexOf(" ");
		this.login = data.substring(0, pos);
		data = data.substring(pos+1);

		// domaine
		pos = data.indexOf(" ");
		this.domaine = data.substring(0, pos);
		data = data.substring(pos+1);

		// timestamp
		pos = data.indexOf("]");
		this.timestamp = data.substring(1, pos);
		data = data.substring(pos+2);

		// décalage GMT
		String timeparts[] = this.timestamp.split(" ");
		this.decalGMT = timeparts[1];

		// heure, minute, seconde
		String reste = timeparts[0];
		timeparts = reste.split(":");		
		this.heure = Integer.parseInt(timeparts[1]);
		this.minutes = Integer.parseInt(timeparts[2]);
		this.secondes = Integer.parseInt(timeparts[3]);

		// jour, mois, année
		reste = timeparts[0];
		timeparts = reste.split("/");		
		this.jour = Integer.parseInt(timeparts[0]);
		this.mois = decodeMois(timeparts[1]);
		this.annee = Integer.parseInt(timeparts[2]);

		// action, ressource, protocole
		String motif = "\"";
		String [] dataparts = data.split(motif);		
		String acrepr = dataparts[1];
		// parfois vide, remplacé par -
		if (acrepr.contentEquals("-")) {
			this.action = "";
			this.ressource = "";
			this.protocole = "";
		}
		else {
			String [] elems = acrepr.split(" ");
			this.action = elems[0];
			this.ressource = elems[1];
			// le protocole est parfois absent
			if (elems.length == 3)
				this.protocole = elems[2];
			else	
				this.protocole = "";		
		}
		data = data.substring(1);
		data = data.substring( data.indexOf(motif)+2 );

		// statut
		pos = data.indexOf(" ");
		this.statut = Integer.parseInt( data.substring(0, pos) );
		data = data.substring(pos+1);

		// taille
		// parfois absente, remplacée par -
		pos = data.indexOf(" ");
		String strTaille = data.substring(0, pos);
	//	if (strTaille.equals("-"))
			this.taille = 0;
	//	else
	//		this.taille = Integer.parseInt( data.substring(0, pos) );
		data = data.substring(pos+2);

		// referer
		//pos = data.indexOf(motif);
		//this.referer = data.substring(0, pos);
		//data = data.substring(pos+3);

		// configuration
		pos = data.indexOf(motif);
		this.configuration = data.substring(0, pos);
		//data = data.substring(pos+3);

		/*
		System.out.println("||" + this.adresseIP + "||" );
		System.out.println("||" + this.login + "||" );
		System.out.println("||" + this.domaine + "||" );
		System.out.println("||" + this.timestamp + "||" );
		System.out.println("||" + this.heure + "||" );
		System.out.println("||" + this.minutes + "||" );
		System.out.println("||" + this.secondes + "||" );
		System.out.println("||" + this.decalGMT + "||" );
		System.out.println("||" + this.jour + "||" );
		System.out.println("||" + this.mois + "||" );
		System.out.println("||" + this.annee + "||" );
		System.out.println("||" + this.action + "||" );
		System.out.println("||" + this.ressource + "||" );
		System.out.println("||" + this.protocole + "||" );
		System.out.println("||" + this.statut + "||" );
		System.out.println("||" + this.taille + "||" );
		System.out.println("||" + this.referer + "||" );
		System.out.println("||" + this.configuration + "||" );
		 */
	}



	private int decodeMois(String string) {
		if (string.contentEquals("Jan")) return 1;
		if (string.contentEquals("Feb")) return 2;
		if (string.contentEquals("Mar")) return 3;
		if (string.contentEquals("Apr")) return 4;
		if (string.contentEquals("May")) return 5;
		if (string.contentEquals("Jun")) return 6;
		if (string.contentEquals("Jul")) return 7;
		if (string.contentEquals("Aug")) return 8;
		if (string.contentEquals("Sep")) return 9;
		if (string.contentEquals("Oct")) return 10;
		if (string.contentEquals("Nov")) return 11;
		if (string.contentEquals("Dec")) return 12;
		return 0;
	}

	public String get_timestamp() {
		return this.timestamp;
	}

	public String get_adresseIP() {
		return this.adresseIP;
	}

	public String get_login() {
		return this.login;
	}

	public int get_jour() {
		return this.jour;
	}

	public int get_mois() {
		return mois ;
	}

	public int get_annee() {
		return this.annee;
	}

	public int get_heure() {
		return this.heure;
	}

	public int get_minutes() {
		return this.minutes;
	}

	public int get_secondes() {
		return this.secondes;
	}

	public String get_decalGMT() {
		return this.decalGMT;
	}

	public String get_action() {
		return this.action;
	}

	public String get_ressource() {
		return this.ressource;
	}

	public String get_protocole() {
		return this.protocole;
	}

	public int get_statut() {
		return this.statut;
	}

	public int get_taille() {
		return this.taille;
	}

	public String get_referer() {
		return this.referer;
	}

	public String get_configuration() {
		return this.configuration;
	}

	public boolean is_attaque() {
		return true;
	}

	public boolean is_erreur() {
		return true;
	}


}

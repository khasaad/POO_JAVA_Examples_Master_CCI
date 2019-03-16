
public class CelluleV3 {

	CelluleV3 prev;
	CelluleV3 next;
	Requete requete;
	CelluleV3 head;

	CelluleV3() {
		prev = null;
		next = null;
		head = this;
	}

	CelluleV3(Requete r) {

		prev = null;
		next = null;
		this.requete = r;
		head = this;
	}

	void add(Requete r) {

		CelluleV3 nc = new CelluleV3(r);
		head.next = nc;
		nc.prev = head;
		head = nc;

	}

	void liste() {

		while (head.prev != null) { // && head.requete!= null
			System.out.println(head.requete.get_adresseIP());
			head = head.prev;

		}

	}
	
	
	void listeDebut() {
		CelluleV3 debut = this.next;
		while (debut != null) { // && head.requete!= null
			System.out.println(debut.requete.get_adresseIP());
			debut = debut.next;
			

		}

	}

}

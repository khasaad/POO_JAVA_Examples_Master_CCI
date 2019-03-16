
public class CelluleV2 {

	CelluleV2 prev;
	CelluleV2 next;
	Requete requete;
	CelluleV2 head;

	CelluleV2(Requete r) {
		prev = null;
		next = null;
		requete = r;
		head = this;
	}

	void add(CelluleV2 nc) {
		
//		head.prev = nc;
//		nc.next = head;
//		head = nc;
		head.next = nc;
		nc.prev = head;
		head =nc;
		
		
	}

	void liste() {
		while (head != null) {

			System.out.println(head.requete.get_adresseIP());
			//head = head.next;
			head = head.prev;

		}

	}

	public CelluleV2 getPrev() {
		return prev;
	}

	public void setPrev(CelluleV2 prev) {
		this.prev = prev;
	}

	public CelluleV2 getNxt() {
		return next;
	}

	public void setNxt(CelluleV2 nxt) {
		this.next = nxt;
	}

	

}

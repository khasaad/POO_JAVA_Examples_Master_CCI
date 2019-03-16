

public class CelluleDoubleChainage {

	CelluleDoubleChainage prev;
	CelluleDoubleChainage next;
	int r;
	CelluleDoubleChainage head;

	CelluleDoubleChainage(int ct) {
		prev = null;
		next = null;
		r = ct;
		head = this;
	}

	void add(CelluleDoubleChainage newCell) {
		head.prev = newCell;
		newCell.next = head;
		head = newCell;
		
	}

	void liste() {
		while (head != null) {

			System.out.println(head.r);
			head = head.next;

		}

	}

	

}

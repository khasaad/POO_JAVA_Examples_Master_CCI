
public class CelluleSimpleChainage {
		
	CelluleSimpleChainage next;
	CelluleSimpleChainage head;
	
	int r;

	public CelluleSimpleChainage(int r) {
		this.r = r;
		
		this.next = null;
		this.head = this;
		
	}

	public void add(CelluleSimpleChainage nc) {
		
		nc.next = head;
		head = nc;
		

	}

	void list() {
		while (head != null) {
			System.out.println(head.r);
			head = head.next; 
		}

	}
	
	

}

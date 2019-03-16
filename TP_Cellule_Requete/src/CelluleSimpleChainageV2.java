
public class CelluleSimpleChainageV2 {
		
	CelluleSimpleChainageV2 next;
	CelluleSimpleChainageV2 head;
	
	int r;

	public CelluleSimpleChainageV2(int r) {
		this.r = r;
		
		this.next = null;
		this.head = this;
		
	}

	public void add(CelluleSimpleChainageV2 nc) {
		
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

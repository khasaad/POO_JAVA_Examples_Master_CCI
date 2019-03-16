
public class essaiCelluleSimpleChainage {

	public static void main(String[] args) {
		
		// simple chainage 
		
		CelluleSimpleChainage c= new CelluleSimpleChainage(10);
		CelluleSimpleChainage c1= new CelluleSimpleChainage(11);
		CelluleSimpleChainage c3= new CelluleSimpleChainage(12);
		
		c.add(c1);
		c.add(c3);
		
		c.list();
		
		
		
	

	}

}

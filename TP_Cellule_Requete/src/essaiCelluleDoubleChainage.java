
public class essaiCelluleDoubleChainage {

	public static void main(String[] args) {
		
		
		// double chinage  
		 
		CelluleDoubleChainage c= new CelluleDoubleChainage(10);
		CelluleDoubleChainage c1= new CelluleDoubleChainage(11);
		CelluleDoubleChainage c3= new CelluleDoubleChainage(12);
		
		c.add(c1);
		c.add(c3);
		
		c.liste();
		
		

	}

}

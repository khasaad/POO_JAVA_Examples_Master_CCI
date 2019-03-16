
/** 
 * 
 */

/**
 * @author khaled
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		System.out.println("Nbre d'instances de point :"+Point.getNbPoints());
        Point origine = new Point();// on cree le pont (0,0)
        System.out.println("Nbre d'instances de point :"+Point.getNbPoints());
        if (origine.getX() == 0)
                     System.out.println("Test origine.getX()  [ok]");
        else
                     System.out.println("Test origine.getX()  [error]");

        if (origine.getY() == 0)
        	
                     System.out.println("Test origine.getY()  [ok]");
        else
        
                     System.out.println("Test origine.getY()  [error]");

        System.out.println("Nbre d'instances de point :"+Point.getNbPoints());
        Point newPoint = new Point(3, 2);
        if (newPoint.getX() == 3)
                     System.out.println("Test new(3,2).getX()  [ok]");
        else
                     System.out.println("Test new(3,2).getX()  [error]");

        if (newPoint.getY() == 2)
                     System.out.println("Test new(3,2).getY()  [ok]");
        else
                     System.out.println("Test new(3,2).getY()  [error]");
        

        Point copie = newPoint.copyof();
        

        if (copie.getX() == 3)
                     System.out.println("Test copy(3,2).getX()  [ok]");
        else
                     System.out.println("Test copy(3,2).getX()  [error]");

        if (copie.getY() == 2)
                     System.out.println("Test copy(3,2).getY()  [ok]");
        else
                     System.out.println("Test copy(3,2).getY()  [error]");
        origine.setX(4);
        if(origine.getX()==4)
                     System.out.println("Test setX(4).getX()   [ok]");
        else
                     System.out.println("Test setX(4).getX()   [error]");
                    
        origine.setY(7);
        if(origine.getY()==7)
                     System.out.println("Test setY(7).getY()   [ok]");
        else
                     System.out.println("Test setY(7).getY()   [error]");
        Point P23= new Point(2,3);
        P23.translate(4, 7);
        if(P23.getX()==6)
                     System.out.println("Test (2.,3.).translater (4.,7.)  [ok]");
        else
                     System.out.println("Test (2.,3.).translater (4.,7.)  [error]");

         if(P23.getY()==10)
                     System.out.println("Test (2.,3.).translater (4.,7.)  [ok]");
         else
                     System.out.println("Test (2.,3.).translater (4.,7.)  [error]");
         
         System.out.println("Nbre d'instances de point :"+Point.getNbPoints());
}

}


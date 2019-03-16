/**
 * 
 */

/**
 * @author khaled
 *
 */
public class Point {
	private int x;
    private int y;
    private static int nbPoints ;
    
    //private static int nbPoints=0;(*)
    /**
    * Constructeur par défaut qui créé un point (0,0)
    */
    // tu peux supprime this , mais
    public Point(){
    	this.nbPoints=0;//si j'ecris (*) , je n'ecris pas : this.nbPoints=0; 
    this.x=0;
    this.y=0;
     nbPoints++;            
    }
    /**
    * Constrecteur avec parametres pour créée un point (x,y)
    * @param x abscisse du point
    * @param y  ordonnée du point
     */
    // constructure
public Point(int x, int y){
	nbPoints++;
    this.x= x; // complement differ de x=x;
    this.y= y;
    
   
}
/**
* Constructeur avec parametres pour creer un point à paritre d'un autre
* @param p pont à copier
*/
public Point (Point p){
	nbPoints++;
    this.x=  p.getX(); // this.x = p.x;
    this.y=  p.getY(); //p.y;
}
/**
*
* @return retourn la valeur de l'attribut x
*/
public  int getX(){

    return this.x;
}


    public int getY() {
                  return this.y;
    }
    public void  setX(int x) {
                  this.x=x;
    }
    public void  setY(int y) {
                  this.y=y;
    }

    public void translate(int a, int b) {
                  this.x += a; // this.x= this.x+a
                  this.y += b;
    }

    public void symetrieHorizontale() {
                  this.y = -this.y;

    }

    public void symetrieVerticale() {
                  this.x = -this.x;

    }

    public Point copyof() {
                  // 1ere facon à viter
                  // return this;// retourn la reference sur l'objet en cours ! donc ne
                  // copie pas

                  // deuxieme facon : ok
                  /*
                  * Point laCopy= new Point(this.x, this.y); return laCopy;
                  */
                  // 3eme facon: ok
                  /*
                  * Point laCopie= new Point(this); return laCopie;
                  */

                  // 4eme
                  return new Point(this);

    }

    public static int getNbPoints(){
    	return nbPoints;
    }
}

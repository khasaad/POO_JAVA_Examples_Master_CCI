/**
 * 
 */

/**
 * @author khaled
 *
 */
public class Segment {
	// attributs
    private Point p1;
    private Point p2;

    // constructeurs
    public Segment() {
                  this.p1 = new Point();// cree le point (0,0)
                  this.p2 = new Point();

    }

    public Segment(Point p1, Point p2) {

                  Point sp1 = new Point(p1);
                  Point sp2 = new Point(p2);
                  this.p1 = sp1;
                  this.p2 = sp2;

    }

    /*
    * public Segmente(Point p1,Point p2){ this.p1=p1 ;// cree le point (0,0)
    * this.p2 =p2; }
    */
    public Segment(int x1, int y1, int x2, int y2) {
                  this.p1 = new Point(x1, y1);
                  this.p2 = new Point(x2, y2);

    }

    public String afficheSegment() {
                  return "[(" + p1.getX() + "," + p1.getY() + ")---(" + p2.getX() + "," + p2.getY() + ")]";
    }

}

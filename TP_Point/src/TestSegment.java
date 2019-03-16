/**
 * 
 */

/**
 * @author khaled
 *
 */
public class TestSegment {
	public static void main(String[] args) {
	Point p1 = new Point(0, 10);
    Point p2 = new Point(10, 0);
    System.out.println("S1");
    //Segment s1 = new Segment(p1, p2);
    //System.out.println(s1.afficheSegment());
    p1.translate(10, 0);
    Segment s1 = new Segment(p1, p2);
    System.out.println(s1.afficheSegment());
    System.out.println("S2");
    int x1 = 0, y1 = 10, x2 = 10, y2 = 0;
    Segment s2 = new Segment(x1, y1, x2, y2);
    System.out.println(s2.afficheSegment());
    x1 = 10;
    Segment s3 = new Segment(x1, y1, x2, y2);
    System.out.println(s3.afficheSegment());


}
}
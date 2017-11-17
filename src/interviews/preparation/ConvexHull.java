package interviews.preparation;

public class ConvexHull {
	
	private final double x;
	private final double y;	
	
	public ConvexHull(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static int ccw(Point a, Point b, Point c) {
		double ccw = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
		if(ccw > 0) return 1; 
		else if(ccw < 0) return -1;
		else return 0;	
	}
	
	
}

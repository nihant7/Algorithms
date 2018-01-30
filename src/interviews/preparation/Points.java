package interviews.preparation;

public class Points {

	static int area(Point p1, Point p2, Point p3) {
		double area  = (p2.y - p1.y)*(p3.x - p2.x) - (p3.y - p2.y)*(p2.x - p1.x);
		
		if(area == 0) return 0; // collinear
		
		else if(area > 0) return 1; // clockwise
		
		else return -1; // counter clockswise
		
		
	}
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		
		p1.x = 0;
		p1.y = 0;
		
		p2.x = 4;
		p2.y = 4;
		
		p3.x = 1;
		p3.y = 2;
		
		System.out.println(Points.area(p1, p2, p3));
		
	}

}

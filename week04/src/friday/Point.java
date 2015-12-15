package friday;

public class Point {

	private int _x;
	private int _y;

	public Point(int x, int y) {
		this._x = x;
		this._y = y;
	}

	public Point() {
		this._x = 0;
		this._y = 0;
	}

	public Point(Point other) {
		this._x = other._x;
		this._y = other._y;
	}

	public int get_x() {
		return _x;
	}

	public int get_y() {
		return _y;
	}

	public static Point getOriginOfCoordinateSystem() {
		return new Point();
	}

	@Override
	public String toString() {
		return String.format("Point(%d, %d)", this.get_x(), this.get_y());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Point temp = (Point) obj;
		return this.get_x() == temp.get_x() && this.get_y() == temp.get_y();
	}

	@Override
	public int hashCode() {
		Integer newX = _x;
		Integer newY = _y;
		int hash = 17;
		hash = hash * 23 + newX.hashCode();
		hash = hash * 23 + newY.hashCode();
		return hash;

	}

	public static LineSegment add(Point point1, Point point2) {
		return new LineSegment(point1, point2);

	}

	public static void main(String[] args) {
		Point first = new Point(3, 3);
		System.out.println(first.toString());
	}

}

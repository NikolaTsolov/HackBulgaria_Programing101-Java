package friday;

public class Triangle implements Shape {
	private final Point _upper;
	private final Point _lowerLeft;
	private final Point _lowerRight;

	private final LineSegment _left;
	private final LineSegment _bottom;
	private final LineSegment _right;

	public Triangle(Point upper, Point lowerLeft, Point lowerRight) {

		this._upper = upper;
		this._lowerLeft = lowerLeft;
		this._lowerRight = lowerRight;
		checkPointsLockation(_upper, _lowerLeft, _lowerRight);

		this._left = new LineSegment(_upper, _lowerLeft);
		this._bottom = new LineSegment(_lowerLeft, lowerRight);
		this._right = new LineSegment(_lowerRight, _upper);

	}

	public Triangle(Triangle other) {
		this._upper = other._upper;
		this._lowerLeft = other._lowerLeft;
		this._lowerRight = other._lowerRight;

		this._bottom = other._bottom;
		this._left = other._left;
		this._right = other._right;
	}

	public boolean checkPointsLockation(Point first, Point second, Point third) {
		if (first.get_x() == second.get_x() && first.get_x() == third.get_x()) {
			System.err.println("Points are on the same axis.");
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("Triangle[(%d,%d)]", this.getHeight(), this.get_bottom());
	}

	@Override
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(
				p * (p - this._bottom.getLenght()) * (p - this._left.getLenght()) * (p - this._right.getLenght()));
	}

	// TO DO: getCenter()

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Triangle temp = (Triangle) obj;

		return this.getArea() == temp.getArea();
	}

	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + _left.hashCode();
		hash = hash * 23 + _bottom.hashCode();
		hash = hash * 23 + _right.hashCode();
		return hash;
	}

	@Override
	public double getPerimeter() {
		return this._left.getLenght() + this._bottom.getLenght() + this._right.getLenght();
	}

	public Point get_lowerLeft() {
		return _lowerLeft;
	}

	public Point get_lowerRight() {
		return _lowerRight;
	}

	public Point get_upper() {
		return _upper;
	}

	public LineSegment get_bottom() {
		return _bottom;
	}

	public LineSegment get_left() {
		return _left;
	}

	public LineSegment get_right() {
		return _right;
	}

	public double getHeight() {
		return 2 * this.getArea() / this._bottom.getLenght();
	}

	@Override
	public Point getCenter() {
		Point result;
		result = new Point(this._lowerLeft.get_x() + this._lowerRight.get_x() + this._upper.get_x(),
				this._lowerLeft.get_y() + this._lowerRight.get_y() + this._upper.get_y());
		return result;
	}

}
